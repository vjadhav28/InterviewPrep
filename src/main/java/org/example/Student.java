package org.example;

import lombok.Getter;

import java.util.Date;
@Getter
public class Student {
    String name;
    int age ;
    Date DOB;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
