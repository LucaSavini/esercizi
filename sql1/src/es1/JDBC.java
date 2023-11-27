package es1;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class JDBC {

    static String url = "jdbc:mysql://localhost:3306/newdb";
    static String user = "developer@localhost";
    static String password = "password1";


    public static Connection connection() {
        try {
            return getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException("Errore nella connessione", e);
        }
    }

    public static Statement createTable() {
        try (Statement statement = connection().createStatement()) {
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS students (" +
                            "student_id INT(10) NOT NULL AUTO_INCREMENT," +
                            "last_name VARCHAR(30)," +
                            "first_name VARCHAR(30)," +
                            "PRIMARY KEY (student_id))");

        } catch (SQLException e) {
            throw new RuntimeException("Errore nella creazione della tabella", e);
        }
        return null;
    }


    public static void fillTable() {
        try (Statement statement = connection().createStatement()) {


            statement.executeUpdate("INSERT INTO students (first_name, last_name) VALUES ('Riccardo', 'Merlo')");
            statement.executeUpdate("INSERT INTO students (first_name, last_name) VALUES ('Andrea', 'Rossi')");
            statement.executeUpdate("INSERT INTO students (first_name, last_name) VALUES ('Luca', 'Merlo')");
            statement.executeUpdate("INSERT INTO students (first_name, last_name) VALUES ('Riccardo', 'Bianchi')");
        } catch (SQLException e) {
            throw new RuntimeException("Error filling the table", e);
        }
    }


    public static void stamp() {
        try (Statement statement = connection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * from students");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("student_id"));
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
            }

        } catch (SQLException e) {
            new RuntimeException("Errore nella stampa", e);
        }
    }
}
