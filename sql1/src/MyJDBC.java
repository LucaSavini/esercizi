import java.sql.*;
import java.util.ArrayList;

public class MyJDBC {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer@localhost", "passwordhere");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from studenti");

        ArrayList<String> surnames = new ArrayList<>();


        while (resultSet.next()) {

            System.out.println(resultSet.getString("first_name"));
            String surname = (resultSet.getString("last_name"));
            surnames.add(surname);
        }

        for(String x : surnames) {
            System.out.println(x);
        }
    }
}
