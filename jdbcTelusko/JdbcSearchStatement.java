package jdbcTelusko;

import java.sql.*;

public class JdbcSearchStatement {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
        String uname = "root";
        String pass = "1234";
        Connection con = DriverManager.getConnection(url, uname, pass);
        String fetch = "SELECT * FROM STUDENT";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(fetch);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        //For Printing Tables
        // while(rs.next())
        //     System.out.println(rs.getString(1));
        st.close();
        con.close();
    }
}
