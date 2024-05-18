package session7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyApplication {
    public static void main(String[] args) throws SQLException {
        createCustomer();
       getAllCustomer();
        }
        public static void createCustomer() throws SQLException {
        Connection connection = MySQLConnectDb.getMysqlConnection();
        Statement stm = connection.createStatement();
        String query = "INSERT INTO customers(customer_id,first_name,last_name,email) values(6,'vc','l','vcl@gmail.com')";
        int count = stm.executeUpdate(query);
            System.out.println("Bản ghi đã được thêm: " +count);
        }
        public static void getAllCustomer() throws SQLException {
            Connection connection = MySQLConnectDb.getMysqlConnection();
            Statement stm = connection.createStatement();
            String query ="select * from customers";
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int cusId = rs.getInt(1);
                String first_name = rs.getString(2);
                String last_name = rs.getString(3);
                String email = rs.getString(4);
                System.out.println("================");
                System.out.println("Costomer ID: " +cusId);
                System.out.println("First Name:" +first_name);
                System.out.println("Last Name:" +last_name);
                System.out.println("Email:"  +email);
            }
            connection.close();
        }
    }

