package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main
{
    public static void main( String[] args )
    {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("file loaded.");
        Movie movieNew = (Movie)context.getBean("Avengers");
        System.out.println(movieNew.getActor());

        Movie movieNew1=(Movie)context.getBean("blackmail");
        System.out.println(movieNew1.getActor());

        Actor actNew = (Actor)context.getBean("Kriti");
        System.out.println(actNew.toString());



        ((AbstractApplicationContext)context).registerShutdownHook();

    }
}
