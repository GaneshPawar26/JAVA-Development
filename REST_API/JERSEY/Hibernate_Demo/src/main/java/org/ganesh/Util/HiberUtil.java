package org.ganesh.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
    private static SessionFactory factory;
    static
    {
        try
        {
            if(factory == null)
            {
                factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return factory;
    }



}
