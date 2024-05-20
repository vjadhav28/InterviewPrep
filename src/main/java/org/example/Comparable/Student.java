package org.example.Comparable;

public class Student implements Comparable<Student>{
    int id;
    String name;
    String Branch;

    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        Branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Branch='" + Branch + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
