import java.sql.*;
import java.util.Scanner;

public class Links {
    Connection conn;
    Statement stmt;
    String body;
    String alternative1;
    int target1;
    String alternative2;
    int target2;
    int currentRoom;

    public Links() {
        currentRoom = 1;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                            "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    DatabaseLoginData.user, DatabaseLoginData.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Setup statement
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Scanner tgb = new Scanner(System.in);

        String strSelect = "select body from story where id = " + currentRoom;

        ResultSet rset = null;
        try {
            rset = stmt.executeQuery(strSelect);

            // Loop through the result set and print
            while (rset.next()) {
                body = rset.getString("body");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        strSelect = "select description, target_Id from links where story_Id = " + currentRoom;

        try {
            rset = stmt.executeQuery(strSelect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Loop through the result set and print
        while (true) {
            try {
                if (!rset.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String description = null;
            try {
                description = rset.getString("description");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            int storyLink = 0;
            try {
                storyLink = rset.getInt("target_Id");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            storyLinks.add(storyLink);

        }

    }

}