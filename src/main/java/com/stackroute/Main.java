package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
//        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        System.out.println("file loaded");
//        Movie movie=(Movie)factory.getBean("blackmail");
//        System.out.println(movie.getActor());


        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("file loaded.");
        Movie movieNew = (Movie)context.getBean("Avengers");
        System.out.println(movieNew.getActor());

        Movie movieNew1=(Movie)context.getBean("blackmail");
        System.out.println(movieNew1.getActor());

        Actor actNew = (Actor)context.getBean("Kriti");
        System.out.println(actNew.toString());

//        Movie movieNew2= (Movie)context.getBean("Rockstar");
//        System.out.println(movieNew2.getActor());
//
//        System.out.println(movieNew1==movieNew2);
//
//        Movie movieNew3= (Movie)context.getBean("Jordan");
//        System.out.println(movieNew3.getActor());


        context.registerShutdownHook();

    }
}
