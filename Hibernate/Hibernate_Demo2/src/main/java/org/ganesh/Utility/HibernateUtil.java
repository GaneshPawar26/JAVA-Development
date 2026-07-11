package org.ganesh.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    static SessionFactory factory=null;

    static
    {
        try
        {
            factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return factory;
    }









}
