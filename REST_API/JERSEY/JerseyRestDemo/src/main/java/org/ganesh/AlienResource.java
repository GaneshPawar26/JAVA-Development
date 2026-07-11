package org.ganesh;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.util.ArrayList;

@Path("aliens")
public class AlienResource
{



    @GET
//    @Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Alien> getAlien()
    {
        System.out.println("getAlien called");
        Alien a1=new Alien();
        a1.setName("Ganesh");
        a1.setPoints(50);

        Alien a2=new Alien();

        ArrayList<Alien> a=new ArrayList<>();
        a.add(a1);
        a.add(a2);
        return a;
    }


}
