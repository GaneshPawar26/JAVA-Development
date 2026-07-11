package org.ganesh.JdbcLearning;
import java.sql.*;


//update and retrieve in same program

public class LaunchApp4 {

    public static void main(String[] args) throws SQLException {

        Statement statement=null;
        Connection con=null;


        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";

        try {
            //connection

            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Established");

            //statement creation
             statement = con.createStatement();

            //retrieval data from database table
            String query = "select * from studentInfo";

            boolean status = statement.execute(query);

            if (status) {
                ResultSet rs = statement.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":"
                            + rs.getInt(3) + ":" + rs.getString(4));
                }
            } else {
                int affectedRows = statement.getUpdateCount();
                if (affectedRows == 0) {
                    System.out.println("No update, 0 rows updated");
                } else {
                    System.out.println("Update happened" + affectedRows);
                }
            }

        }
        catch(Exception e) {
            System.out.println("Error is connection establishment" + e);
        }
        finally
        {
            //close resources
//            rs.close();
            statement.close();
            con.close();
        }


    }
}
