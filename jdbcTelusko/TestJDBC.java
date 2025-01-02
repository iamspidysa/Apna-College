package jdbcTelusko;
import java.sql.*;
import javax.swing.JOptionPane;
public class TestJDBC {
    public static void main(String[] args) throws Exception {

        try {

            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "JDBC";
            String userName = "root";
            String password = "1234";
            Connection connection = DriverManager.getConnection(url,userName, password);
            String sql = "CREATE DATABASE " + databaseName;
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
