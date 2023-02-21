package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("s.xml");
        Person person = (Person) ap.getBean("person");
        System.out.println(person);
    }
}