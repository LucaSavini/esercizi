package es2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class JDBC {

    static String url = "jdbc:mysql://localhost:3306/newdb";
    static String user = "developer@localhost";
    static String password = "password1";


    public static Connection connection() {
        try {
            return getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException("Errore nella connessione");
        }
    }


    public static void addCountry () {
        try (Statement statement = connection().createStatement()) {
            statement.executeUpdate("ALTER TABLE students ADD COLUMN country VARCHAR(30)");
            statement.executeUpdate("UPDATE `newdb`.`students` SET `country`='Italia' WHERE  `student_id`=1 ");
            statement.executeUpdate("UPDATE `newdb`.`students` SET `country`='Germania' WHERE  `student_id`=2 ");
            statement.executeUpdate("UPDATE `newdb`.`students` SET `country`='Italia' WHERE  `student_id`=3 ");
            statement.executeUpdate("UPDATE `newdb`.`students` SET `country`='Germania' WHERE  `student_id`=4 ");
        } catch (SQLException e) {
            throw new RuntimeException("Errore nell' aggiunta della colonna country");
        }
    }


    public static void stamp() {
        try (Statement statement = connection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * from students");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("student_id"));
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("country"));
            }

        } catch (SQLException e) {
            new RuntimeException("Errore nella stampa");
        }
    }
}
