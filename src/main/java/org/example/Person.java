package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

//@AllArgsConstructor
@Data
@ToString
public class Person {
    private String name;
    private int age;
    private double high;
    private Cat[] cat1;
}
