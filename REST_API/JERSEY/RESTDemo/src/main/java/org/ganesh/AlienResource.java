package org.ganesh;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("hello")
public class AlienResource {

    AlienRepository ar=new AlienRepository();
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public List<Alien> getAliens()
    {

        List<Alien> l= ar.getAliens();
        Alien a=ar.getIDAlien(101);

        return l;
    }

    @GET
    @Path("humans/{id}")
    public Alien getAlien(@PathParam("id") int id)
    {
        return ar.getIDAlien(id);
    }

    @POST
    @Path("alien")
    public Alien createAlien(Alien a1)
    {
        ar.create(a1);

        return a1;
    }



}
