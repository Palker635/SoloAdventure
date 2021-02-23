import java.sql.*;
import java.util.Scanner;

public class Links {

    String body;
    String alternative1;
    int target1;
    String alternative2;
    int target2;
    int currentRoom;


    public Links() {
        currentRoom = 1;

        Scanner tgb = new Scanner(System.in);

        String strSelect = "select body from story where id = " + currentRoom;

        ResultSet rset = null;
        try {
            rset = dblogin.getStmt.executeQuery(strSelect);

            // Loop through the result set and print
            while (rset.next()) {
                body = rset.getString("body");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        strSelect = "select description, targetId from links where storyId = " + currentRoom;

        try {
            rset = dblogin.getStmt.executeQuery(strSelect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Description 1
        try {
            if (rset.next()){
                alternative1 = rset.getString("description");
                target1 = rset.getInt("targetId");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Description 2
        try {
            if (rset.next()){
                alternative2 = rset.getString("description");
                target2 = rset.getInt("targetId");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}