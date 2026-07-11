package org.ganesh;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Path("hello")
public class AlienResource {

    AlienRepository ar=new AlienRepository();

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public List<Alien> getAliens() throws SQLException {

        List<Alien> l= ar.getAliens();
        Alien a=ar.getIDAlien(101);

        return l;
    }

    @GET
    @Path("humans/{id}")
    public Alien getAlien(@PathParam("id") int id) throws SQLException {
        return ar.getIDAlien(id);
    }

    @POST
    @Path("alien")
    public Alien createAlien(Alien a1) throws SQLException {
        ar.create(a1);

        return a1;
    }

    @PUT
    @Path("update")
    @Produces(MediaType.APPLICATION_JSON)
    public Alien updateAlienName(Alien a2) throws SQLException {

     ar.updateAlienName(a2);
        return a2;
    }



}
