package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App { public static void main(String[] args) {AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);Person person = (Person) ac.getBean("person");System.out.println(person);}}