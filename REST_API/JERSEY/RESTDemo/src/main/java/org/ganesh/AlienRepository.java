package org.ganesh;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

    List<Alien> a=new ArrayList<>();
    public AlienRepository()
    {
        Alien a1=new Alien();
        a1.setName("Ganesh");
        a1.setPoints(80);
        a1.setId(101);

        Alien a2=new Alien();
        a2.setName("Navin");
        a2.setPoints(90);
        a2.setId(102);

        a.add(a1);
        a.add(a2);
    }

    public List<Alien> getAliens()
    {
        return a;
    }

    public Alien getIDAlien(int id)
    {
        for(Alien n:a)
        {
            if(n.getId()==id)
            {
                return n;
            }
        }
        return null;
    }

    public void create(Alien a3)
    {
        a.add(a3);

    }

}
