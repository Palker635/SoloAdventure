import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Links {
    String body;
    String alternative1;
    String alternative2;
    int target;
    private JButton button1;
    private JButton button2;
    int currentRoom;


    public Links () {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://" + DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                        "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                DatabaseLoginData.user, DatabaseLoginData.password);

        // Setup statement
        Statement stmt = conn.createStatement();
        Scanner tgb = new Scanner(System.in);



        while (currentRoom != 0) {
            // Create query and execute
            String strSelect = "select body from story where id = " + currentRoom;

            ResultSet rset = stmt.executeQuery(strSelect);

            // Loop through the result set and print
            while (rset.next()) {
                String body = rset.getString("body");
                System.out.println(body);
            }
    }
}
