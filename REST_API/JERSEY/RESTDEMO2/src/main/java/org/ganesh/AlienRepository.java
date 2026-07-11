package org.ganesh;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {



    Connection con;

    public AlienRepository()
    {
        String url="jdbc:mysql://localhost:3306/restdb";
        String user="root";
        String pass="Gnp2003@278";

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con=DriverManager.getConnection(url,user,pass);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    List<Alien> a=new ArrayList<>();
    public List<Alien> getAliens()
    {

        String query="select * from alien;";

        try
        {
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next())
            {
                Alien a1=new Alien();
                a1.setId(rs.getInt(1));
                a1.setName(rs.getString(2));
                a1.setPoints(rs.getInt(3));
                a.add(a1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return a;
    }

    public Alien getIDAlien(int id) throws SQLException {
        String query="select * from alien where id=?";
        PreparedStatement pstmt= con.prepareStatement(query);

        pstmt.setInt(1,id);

        ResultSet rs=pstmt.executeQuery();

        while(rs.next())
        {
            for(Alien n:a)
            {
                if(n.getId()==rs.getInt(1))
                {
                    return n;
                }
            }
        }

        return null;
    }

    public void create(Alien a2) throws SQLException {
        String query="insert into alien values (?,?,?);";

        PreparedStatement pstmt=con.prepareStatement(query);

        pstmt.setInt(1,a2.getId());
        pstmt.setString(2,a2.getName());
        pstmt.setInt(3,a2.getPoints());

        pstmt.executeUpdate();

    }

    public void updateAlienName(Alien a3) throws SQLException {
        String query="update alien set name='Bhavana' where id=?;";

        PreparedStatement pstmt=con.prepareStatement(query);

        pstmt.setInt(1,a3.getId());
        pstmt.executeUpdate();

    }




}
