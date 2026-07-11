package org.ganesh;
import org.ganesh.Entities.Alien;
import org.ganesh.Utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Alien a1=new Alien();

        a1.setId(101);
        a1.setName("Vishal");
        a1.setMarks(90);

        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t1=null;
        try
        {
            t1= session.beginTransaction();
            session.persist(a1);
            System.out.println("object inserted in a table");
            t1.commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            session.close();
        }

    }
}