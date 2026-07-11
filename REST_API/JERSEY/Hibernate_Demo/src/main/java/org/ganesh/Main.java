package org.ganesh;

import org.ganesh.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ganesh.Util.HiberUtil;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

        Student s1=new Student();
        s1.setName("Ankit");
        s1.setCollege("Coep");
        s1.setPhone("1235125");
        s1.setActive(true);
        s1.setAbout("this is dummy student");
        s1.setFatherName("DK Sinhah");

        Student s2=new Student();
        s2.setName("Ankit");
        s2.setCollege("ssbt");


        SessionFactory sFactory=HiberUtil.getSessionFactory();
//        System.out.println(sFactory);

        Session session=sFactory.openSession();

        Transaction t1=null;

        //insert into the table
        try
        {
            t1= session.beginTransaction();
//            session.persist(s2);
            t1.commit();
            System.out.println("Student inserted into the table");

        } catch (Exception e) {
            if(t1!=null)
            {
                t1.rollback();
            }
            throw new RuntimeException(e);
        }


//get object/row from id
        try
        {
            t1= session.beginTransaction();
            Student s=session.get(Student.class,1);
            System.out.println(s);
            t1.commit();

        } catch (Exception e) {
            if(t1!=null)
            {
                t1.rollback();
            }
            throw new RuntimeException(e);
        }
        finally
        {
            session.close();
        }


        session= sFactory.openSession();

        //update id 1 student to Ganesh
        try
        {
            t1= session.beginTransaction();
            Student s=session.get(Student.class,1);
            s.setName("Ganesh");

            System.out.println(s);
            t1.commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally
        {
            session.close();
        }

       //delete row from id
        session= sFactory.openSession();

        try
        {
            t1= session.beginTransaction();
            Student s=session.get(Student.class,2);
            session.remove(s);
            t1.commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{session.close();}
    }
}