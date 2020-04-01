package by.itstep.goryachev.database;



import java.sql.*;

public class Main {
    final static String DATABASE_URL = "jdbc:postgresql://localhost:5432/my_test_db";
    final static String USER = "postgres";
    final static String PASSWORD = "postgres";

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");


        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        Statement statement = connection.createStatement();


        ResultSet resultSet = statement.executeQuery("SELECT * FROM developers");

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id" + " "));
            System.out.println(resultSet.getString("name" + " "));
            System.out.println(resultSet.getString("speciality" + " "));
            System.out.println(resultSet.getInt("salary"));
        }
    }


}
