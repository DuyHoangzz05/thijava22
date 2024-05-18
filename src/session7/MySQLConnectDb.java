package session7;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectDb {
    public static Connection getMysqlConnection() throws SQLException {
        Connection conn = null;
        String hostName = "localhost";//127.0.0.1
        String dbname = "Employee-fpt";
        String userName = "root";
        String password ="";
        String connectionURL ="jdbc:mysql://"+hostName+":3306/"+dbname;
        conn = DriverManager.getConnection(connectionURL,userName,password);
        return conn;
    }

    public static void main(String[] args) throws SQLException {
//        if (getMysqlConnection()!=null){
//            System.out.println("ket noi thanh cong");
//        }
        Connection connection = getMysqlConnection();
    }
}
