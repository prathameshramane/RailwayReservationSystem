package railway.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrainQuery {

    // Returns True for UP (V-Ch) and False for DOWN (Ch-VR)
    private boolean checkDirection(int source_id, int destination_id) {

        if (source_id < destination_id) {
            return true;
        } else {
            return false;
        }

    }

    private int[] getStationId(String source, String destination) {
        int[] a = new int[2];
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT station_id, station_name FROM Stations WHERE station_name = ? OR station_name= ?;");
            ps.setString(1, source);
            ps.setString(2, destination);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("station_name").equals(source)) {
                    a[0] = rs.getInt("station_id");
                } else {
                    a[1] = rs.getInt("station_id");
                }
            }
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
            return a;
        }
    }

    // Returns Array on train_id for source to destination
    public ResultSet getTrainDetails(String source, String destination) throws SQLException {
        Connection con = SqlConnection.getConnection();
        PreparedStatement ps;

        int[] a = getStationId(source, destination);

        if (checkDirection(a[0], a[1])) {
            ps = con.prepareStatement(
                    "SELECT DISTINCT trn.train_id, trn.train_name, comb.source_id, comb.source_name, comb1.destination_name, comb.arrival_time, comb.departure_time, comb.date\n"
                    + "FROM (\n"
                    + "(SELECT train_id, hlt1.station_id as source_id, stn.station_id, stn.station_name as source_name, hlt1.arrival_time, hlt1.departure_time, hlt1.date FROM Halts_at AS hlt1, Stations AS stn WHERE hlt1.station_id= ? AND hlt1.station_id = stn.station_id) as comb\n"
                    + "INNER JOIN \n"
                    + "(SELECT train_id, hlt2.station_id as destination_id, stn.station_id, stn.station_name as destination_name FROM Halts_at as hlt2, Stations AS stn WHERE hlt2.station_id= ? AND hlt2.station_id = stn.station_id) as comb1\n"
                    + "ON comb.train_id = comb1.train_id\n" + ")\n"
                    + "INNER JOIN Trains AS trn ON trn.train_id = comb.train_id\n" + "WHERE trn.train_id < 6\n"
                    + "ORDER BY trn.train_id, comb.source_id;");
        } else {
            ps = con.prepareStatement(
                    "SELECT DISTINCT trn.train_id, trn.train_name, comb.source_id, comb.source_name, comb1.destination_name, comb.arrival_time, comb.departure_time, comb.date\n"
                    + "FROM (\n"
                    + "(SELECT train_id, hlt1.station_id as source_id, stn.station_id, stn.station_name as source_name, hlt1.arrival_time, hlt1.departure_time, hlt1.date FROM Halts_at AS hlt1, Stations AS stn WHERE hlt1.station_id= ? AND hlt1.station_id = stn.station_id) as comb\n"
                    + "INNER JOIN \n"
                    + "(SELECT train_id, hlt2.station_id as destination_id, stn.station_id, stn.station_name as destination_name FROM Halts_at as hlt2, Stations AS stn WHERE hlt2.station_id= ? AND hlt2.station_id = stn.station_id) as comb1\n"
                    + "ON comb.train_id = comb1.train_id\n" + ")\n"
                    + "INNER JOIN Trains AS trn ON trn.train_id = comb.train_id\n" + "WHERE trn.train_id >= 6\n"
                    + "ORDER BY trn.train_id, comb.source_id;");
        }

        ps.setInt(1, a[0]);
        ps.setInt(2, a[1]);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public ResultSet getTrainCompleteDetails(int train_id) throws SQLException {
        Connection con = SqlConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT DISTINCT comb.train_id, comb.train_name, comb.starts_at_id, comb.starts_name, comb.stops_at_id, stn.station_name AS stops_name, comb.availability_of_seats\n"
                + "FROM (SELECT trn.train_id, trn.train_name, str.station_id AS starts_at_id, stn.station_name AS starts_name, stp.station_id AS stops_at_id, trn.availability_of_seats\n"
                + "FROM\n"
                + " Trains AS trn, Starts_at AS str, Stops_at AS stp, Stations AS stn \n"
                + " WHERE trn.train_id = ? AND trn.train_id = stp.train_id AND trn.train_id = str.train_id AND str.station_id = stn.station_id) AS comb\n"
                + " INNER JOIN Stations AS stn ON stn.station_id = comb.stops_at_id;");
        ps.setInt(1, train_id);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public int[] getAvailabiltyOfSeats(int train_id) {
        Connection con = SqlConnection.getConnection();
        int[] a = new int[2];
        try {
            PreparedStatement ps = con.prepareStatement("Select seats_reserved_fc, seats_reserved_sc FROM Train_booking_status WHERE train_id = ?;");
            ps.setInt(1, train_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a[0] = rs.getInt("seats_reserved_fc");
                a[1] = rs.getInt("seats_reserved_sc");
            }
            return a;
        } catch (SQLException ex) {
            Logger.getLogger(TrainQuery.class.getName()).log(Level.SEVERE, null, ex);
            return a;
        }
    }

    public int getStationId(String station_name) {
        Connection con = SqlConnection.getConnection();
        int station_id = -1;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT station_id FROM Stations WHERE station_name = ?;");
            ps.setString(1, station_name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                station_id = rs.getInt("station_id");
            }
            return station_id;
        } catch (SQLException ex) {
            Logger.getLogger(TrainQuery.class.getName()).log(Level.SEVERE, null, ex);
            return station_id;
        }
    }
}
