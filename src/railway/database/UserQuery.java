package railway.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserQuery {

    // Creating a new User
    public boolean createNewUser(String first_name, String last_name, String adhar_no, String gender, int age,
            String mobile_no, String email, String city, String state, String pincode, String user_name,
            String password, String security_que, String security_ans) {

        // Assume all information is correctly send by the front-end GUI
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement createNewUser = con.prepareStatement(
                    "INSERT INTO Users (`first_name`, `last_name`, `adhar_no`, `gender`, `age`, `mobile_no`, `email`, `city`, `state`, `pincode`, `user_name`, `password`, `security_ques`, `security_ans`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            createNewUser.setString(1, first_name);
            createNewUser.setString(2, last_name);
            createNewUser.setString(3, adhar_no);
            createNewUser.setString(4, gender);
            createNewUser.setInt(5, age);
            createNewUser.setString(6, mobile_no);
            createNewUser.setString(7, email);
            createNewUser.setString(8, city);
            createNewUser.setString(9, state);
            createNewUser.setString(10, pincode);
            createNewUser.setString(11, user_name);
            createNewUser.setString(12, password);
            createNewUser.setString(13, security_que);
            createNewUser.setString(14, security_ans);
            if (createNewUser.executeUpdate() != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Logging in the User
    public String[] loginUser(String user_name, String password) {
        String[] user = new String[3];
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement login = con
                    .prepareStatement("SELECT user_id, first_name, user_name FROM Users WHERE user_name=? && password=?;");
            login.setString(1, user_name);
            login.setString(2, password);
            ResultSet rs = login.executeQuery();
            if (rs.next()) {
                user[0] = rs.getString("user_id");
                user[1] = rs.getString("user_name");
                user[2] = rs.getString("first_name");
                return user;
            } else {
                return user;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return user;
        }
    }
    
      // Logging in the User
    public boolean isUserExists(String user_name) {
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement login = con
                    .prepareStatement("SELECT user_id, first_name, last_name, user_name FROM Users WHERE user_name=?;");
            login.setString(1, user_name);
            ResultSet rs = login.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    // Send User Info With ID
    public String[] userDetails(int user_id) {
        String[] user = {"", "", ""};
        Connection con = SqlConnection.getConnection();
        try {
            PreparedStatement ps = con
                    .prepareStatement("SELECT first_name,last_name,user_name FROM Users WHERE user_id = ?;");
            ps.setInt(1, user_id);
            ResultSet userDetail = ps.executeQuery();
            if (userDetail.next()) {
                user[0] = userDetail.getString("first_name");
                user[1] = userDetail.getString("last_name");
                user[2] = userDetail.getString("user_name");
                return user;
            } else {
                return user;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return user;
        }
    }
}
