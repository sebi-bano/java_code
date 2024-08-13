package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoreData {
    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/first";
        String user = "postgres";
        String password = "root";

        try {
            // Step 1: Load the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Create the connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Step 3: Create a Statement to execute SQL queries
            Statement statement = connection.createStatement();

            // Step 4: Take user input
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            System.out.println("Enter your email:");
            String email = scanner.nextLine();

            System.out.println("Enter your Age:");
            int age = scanner.nextInt();

            // Create the SQL query using string concatenation
            String sql = "INSERT INTO person (name, email, age) VALUES ('" 
                        + name + "', '" + email + "', " + age + ")";

            // Execute the SQL insert query
            int rowsInserted = statement.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

            // Close the statement and connection
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
