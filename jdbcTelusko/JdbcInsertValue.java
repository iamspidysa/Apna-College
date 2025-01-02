package jdbcTelusko;

import java.sql.*;

public class JdbcInsertValue {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://127.0.0.1:3306/jdbc";
        String uname = "root";
        String pass = "1234";
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        String insert = "INSERT INTO DEMO VALUES (5,'SAURABH')";
        int affected = st.executeUpdate(insert);
        System.out.println(affected+" row affected");
        con.close();
        st.close();
    }
}
