package com.company;

public class Student implements Comparable<Student> {
    private static int g_id = 0;
    private int id;
    private double average_mark;
    private String name;

    public Student() {
        this.name = "HumanBeing-" + g_id;
        id = g_id;
        average_mark = Math.random() * 3 + 2;
        g_id++;
    }
    public double getAverage_mark() {
        return average_mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if (Double.compare(this.average_mark, o.average_mark) != 0){
            return Double.compare(this.average_mark, o.average_mark);
        } else if(this.id != o.id){
            return Integer.compare(this.id, o.id);
        } else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return name + " is a student with ID=" + id + " and average mark " + average_mark;
    }
}
