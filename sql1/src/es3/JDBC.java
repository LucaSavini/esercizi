package es3;

import java.sql.*;
import java.util.ArrayList;

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


    public static void createView() {
        try (Statement statement = connection().createStatement()) {
            statement.executeUpdate("CREATE VIEW IF NOT EXISTS 'italian_students' AS SELECT * from students where country = 'Italia'");
            statement.executeUpdate("CREATE VIEW IF NOT EXISTS 'german_students' AS SELECT * from students where country = 'Germania'");

        } catch (SQLException e) {
            new RuntimeException("Errore nella creazione della view");
        }
    }

    public static ArrayList<Student> studentiItaliani() {
        ArrayList<Student> italiani = new ArrayList<>();
        try (Statement statement = connection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * from italian_students");

            while (resultSet.next()) {
                italiani.add(new Student(resultSet.getString("first_name"), resultSet.getString("last_name")));
            }

        } catch (SQLException e) {
            new RuntimeException("Errore nella view 'italian_students'");
        }return italiani;
    }


    public static ArrayList<Student> studentiTedeschi() {
        ArrayList<Student> tedeschi = new ArrayList<>();
        try (Statement statement = connection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * from italian_students");

            while (resultSet.next()) {
                tedeschi.add(new Student(resultSet.getString("first_name"), resultSet.getString("last_name")));
            }

        } catch (SQLException e) {
            new RuntimeException("Errore nella view 'german_students'");
        }return tedeschi;
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
