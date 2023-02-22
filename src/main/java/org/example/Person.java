package org.example;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
}
