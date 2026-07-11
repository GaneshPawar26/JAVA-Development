package org.ganesh;

import java.sql.*;

public class JDBC_Util {


    static
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getDBConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="Gnp2003@278";

        return DriverManager.getConnection(url,user,password);
    }

    public static void closeResource(Connection con, PreparedStatement pstmt) throws SQLException {
        if(con!=null)
        {
            con.close();
        }
        if(pstmt!=null)
        {
            pstmt.close();
        }
    }





}
