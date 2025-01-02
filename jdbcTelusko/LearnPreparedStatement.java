package jdbcTelusko;

import java.sql.*;

public class LearnPreparedStatement {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:mysql://localhost:3306/jdbc";
        String uname= "root";
        String pass ="1234";
        int id = 1;
        String name = "Spidy";
        String query = "INSERT INTO DEMO VALUES (?,?)";
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2,name );
        int affected = ps.executeUpdate();
        System.out.println(affected+" rows affected");
        con.close();
        ps.close();

    }
}
