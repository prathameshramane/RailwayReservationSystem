package railway.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;
import java.util.Date;

public class TicketQuery {

    public int newTicket(int user_id,
            int train_id,
            int passenger_id,
            String source_name,
            String destination_name,
            int num_of_pass,
            String coach_type,
            Date today,
            Date tommarow) {

        Connection con = SqlConnection.getConnection();
        TrainQuery tq = new TrainQuery();
        int source_id = tq.getStationId(source_name);
        int destination_id = tq.getStationId(destination_name);
        int ticket_id = -1;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Tickets (`user_id`, `train_id`, `passenger_id`, `source_station_id`, `destination_station_id`, `num_of_pass`, `coach_type`, `booking_date`, `valid`) \n"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setInt(1, user_id);
            ps.setInt(2, train_id);
            ps.setInt(3, passenger_id);
            ps.setInt(4, source_id);
            ps.setInt(5, destination_id);
            ps.setInt(6, num_of_pass);
            ps.setString(7, coach_type);
            ps.setTimestamp(8, new Timestamp(today.getTime()));
            ps.setTimestamp(9, new Timestamp(tommarow.getTime()));
            ps.execute();
            updateBookingStatus(train_id, num_of_pass, coach_type);
            ticket_id = getTicketId(user_id, passenger_id, source_id, destination_id, today);
            return ticket_id;
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
            return ticket_id;
        }
    }

    private void updateBookingStatus(int train_id, int num_of_seats, String coach_type) {
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement ps;
            if (coach_type.equals("SC")) {
                ps = con.prepareStatement(
                        "UPDATE Train_booking_status SET seats_reserved_sc = seats_reserved_sc - ?, available_seats = available_seats - ? WHERE train_id = ?;");
            } else {
                ps = con.prepareStatement(
                        "UPDATE Train_booking_status SET seats_reserved_fc = seats_reserved_fc - ?, available_seats = available_seats - ? WHERE train_id = ?;");
            }
            ps.setInt(1, num_of_seats);
            ps.setInt(2, num_of_seats);
            ps.setInt(3, train_id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateBookingStatusCancel(String coach_type, int num_of_pass, int train_id) {
        Connection con = SqlConnection.getConnection();
        PreparedStatement ps;
        try {
            if (coach_type.equals("SC")) {
                ps = con.prepareStatement(
                        "Update Train_booking_status set seats_reserved_sc = seats_reserved_sc + ?, available_seats = available_seats + ? where train_id=?");
            } else {
                ps = con.prepareStatement(
                        "Update Train_booking_status set seats_reserved_fc = seats_reserved_fc + ?, available_seats = available_seats + ? where train_id=?");
            }
            ps.setInt(1, num_of_pass);
            ps.setInt(2, num_of_pass);
            ps.setInt(3, train_id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] getTicketInfo(int ticket_id) {
        String[] ticketInfo = new String[11];
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT DISTINCT tk.ticket_id, pass.passenger_name, src.station_name AS source_name, des.station_name AS destination_name, tk.coach_type, tk.num_of_pass, trn.train_name, src_hlt.arrival_time, src_hlt.departure_time, tk.booking_date, tk.valid\n"
                    + "FROM Tickets AS tk,Passengers AS pass, Stations AS src, Stations AS des, Trains AS trn, Halts_at AS src_hlt, Halts_at AS des_hlt\n"
                    + "WHERE tk.train_id = trn.train_id AND tk.passenger_id = pass.passenger_id AND tk.source_station_id = src.station_id \n"
                    + "AND tk.destination_station_id = des.station_id AND tk.train_id = src_hlt.train_id AND tk.source_station_id = src_hlt.station_id\n"
                    + "AND tk.train_id = des_hlt.train_id AND tk.destination_station_id = des_hlt.station_id\n"
                    + "AND tk.ticket_id = ?;");
            ps.setInt(1, ticket_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ticketInfo[0] = String.valueOf(rs.getInt("ticket_id"));
                ticketInfo[1] = rs.getString("passenger_name");
                ticketInfo[2] = rs.getString("source_name");
                ticketInfo[3] = rs.getString("destination_name");
                ticketInfo[4] = rs.getString("coach_type");
                ticketInfo[5] = String.valueOf(rs.getInt("num_of_pass"));
                ticketInfo[6] = rs.getString("train_name");
                ticketInfo[7] = String.valueOf(rs.getDate("arrival_time"));
                ticketInfo[8] = String.valueOf(rs.getDate("departure_time"));
                ticketInfo[9] = String.valueOf(rs.getTimestamp("booking_date"));
                ticketInfo[10] = String.valueOf(rs.getTimestamp("valid"));
            }
            return ticketInfo;
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
            return ticketInfo;
        }
    }

    public boolean cancelTicket(int ticket_id, String coach_type, int num_of_pass, String train_name) {
        Connection con = SqlConnection.getConnection();
        int train_id = getTrainID(train_name);
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM Tickets WHERE ticket_id = ?;");
            ps.setInt(1, ticket_id);
            if (ps.executeUpdate() != 0) {
                updateBookingStatusCancel(coach_type, num_of_pass, train_id);
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    private int getTrainID(String train_name) {
        Connection con = SqlConnection.getConnection();
        int train_id = -1;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT train_id From Trains WHERE train_name = ?;");
            ps.setString(1, train_name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                train_id = rs.getInt("train_id");
            }
            return train_id;
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
            return train_id;
        }
    }

    private int getTicketId(int user_id, int passenger_id, int source_id, int destination_id, Date booking_date) {
        Connection con = SqlConnection.getConnection();
        Date date = new Date(Long.valueOf(approx(String.valueOf(booking_date.getTime()))));
        int ticket_id = -1;
        try {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT ticket_id FROM Tickets WHERE passenger_id= ? AND user_id= ? AND source_station_id = ? AND destination_station_id = ? AND booking_date = ?;");
            ps.setInt(1, passenger_id);
            ps.setInt(2, user_id);
            ps.setInt(3, source_id);
            ps.setInt(4, destination_id);
            ps.setTimestamp(5, new Timestamp(date.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ticket_id = rs.getInt("ticket_id");
            }
            return ticket_id;
        } catch (SQLException ex) {
            Logger.getLogger(TicketQuery.class.getName()).log(Level.SEVERE, null, ex);
            return ticket_id;
        }
    }

    private String approx(String time) {
        long timeInt = Long.valueOf(time);
        if (Integer.parseInt(time.substring(10)) >= 500) {
            timeInt = timeInt + 1000;
            timeInt = timeInt - Integer.parseInt(time.substring(10));
        } else {
            timeInt = timeInt - Integer.parseInt(time.substring(10));
        }
        return String.valueOf(timeInt);
    }

}
