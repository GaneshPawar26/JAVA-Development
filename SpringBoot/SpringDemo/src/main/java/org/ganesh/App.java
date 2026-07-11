package org.ganesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Dev d1=(Dev) context.getBean("dev");

        d1.build();

        System.out.println( "Hello World!" );

    }
}
