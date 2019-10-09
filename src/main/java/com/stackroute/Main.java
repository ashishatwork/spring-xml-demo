package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        System.out.println("file loaded");
        Actor actor=(Actor)factory.getBean("imran");
        Movie movie=(Movie)factory.getBean("blackmail");
        System.out.println(movie.getActor());


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("file loaded.");
        Movie movieNew = (Movie)context.getBean("Avengers");
        System.out.println(movieNew.getActor());


    }
}
