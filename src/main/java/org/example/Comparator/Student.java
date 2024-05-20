package org.example.Comparator;

import lombok.Setter;

public class Student {
    @Setter
    int id;
    String name;
    @Setter
    String Branch;

    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        Branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return Branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Branch='" + Branch + '\'' +
                '}';
    }

}
