package railway.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PassengerQuery {

    public boolean createNewPassenger(int user_id, String passenger_name, int passenger_age, String passenger_gender,
            String passenger_adhar_no, String passenger_contact, String passenger_state, String passenger_pincode,
            String passenger_district) {

        // Assume all information is correctly send by the front-end GUI
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement createNewPassenger = con.prepareStatement(
                    "INSERT INTO Passengers (`user_id`, `passenger_name`, `passenger_age`, `passenger_gender`, `passenger_adhar_no`, `passenger_contact`, `passenger_state`, `passenger_pincode`, `passenger_district`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
            createNewPassenger.setInt(1, user_id);
            createNewPassenger.setString(2, passenger_name);
            createNewPassenger.setInt(3, passenger_age);
            createNewPassenger.setString(4, passenger_gender);
            createNewPassenger.setString(5, passenger_adhar_no);
            createNewPassenger.setString(6, passenger_contact);
            createNewPassenger.setString(7, passenger_state);
            createNewPassenger.setString(8, passenger_pincode);
            createNewPassenger.setString(9, passenger_district);
            if (createNewPassenger.executeUpdate() != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String[] getPassengerDeatils(int passenger_id) {
        String[] passenger = new String[6];
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT passenger_id, passenger_name, passenger_gender, passenger_contact, passenger_state, passenger_pincode FROM Passengers WHERE passenger_id=?;");
            ps.setInt(1, passenger_id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                passenger[0] = String.valueOf(rs.getInt("passenger_id"));
                passenger[1] = rs.getString("passenger_name");
                passenger[2] = rs.getString("passenger_gender");
                passenger[3] = rs.getString("passenger_contact");
                passenger[4] = rs.getString("passenger_state");
                passenger[5] = rs.getString("passenger_pincode");
                return passenger;
            } else {
                return passenger;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return passenger;
        }
    }

    public int getPassengerID(String mobile_no) {
        Connection con = SqlConnection.getConnection();
        int passenger_id = -1;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT passenger_id FROM Passengers WHERE passenger_contact = ?;");
            ps.setString(1, mobile_no);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                passenger_id = rs.getInt("passenger_id");
            }
            return passenger_id;
        } catch (SQLException ex) {
            Logger.getLogger(PassengerQuery.class.getName()).log(Level.SEVERE, null, ex);
            return passenger_id;
        }
    }
}
