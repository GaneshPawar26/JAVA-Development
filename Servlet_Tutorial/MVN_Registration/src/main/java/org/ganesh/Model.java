package org.ganesh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String name;
    private String email;
    private String pass;
    private String city;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


    /////////////////

    Connection con=null;
    PreparedStatement pstmt;


    public int register()
    {
        try
        {
            con=JDBC_Util.getDBConnection();

            String sql="insert into personalInfo values (?,?,?,?)";
            pstmt=con.prepareStatement(sql);

            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,pass);
            pstmt.setString(4,city);

            int row=pstmt.executeUpdate();

            JDBC_Util.closeResource(con,pstmt);

            return row;
        }
        catch(SQLException e)
        {
            return 0;
        }
    }


}
