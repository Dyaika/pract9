package com.company;

import java.util.Objects;
import java.util.Scanner;

public class TestStudent {
    public static void test() throws StudentNotFoundException {
        int n = 20;
        Student [] iDNumber = new Student[n];
        for (int i = 0; i < n; i++) {
            iDNumber[i] = new Student();
        }
        sort(iDNumber);
        for (Student st:
                iDNumber) {
            System.out.println(st);
        }
        System.out.print("name=");
        String str = new Scanner(System.in).nextLine();
        System.out.println(getByName(str, iDNumber));

    }
    private static void sort(Comparable[] array){
        int n = array.length;
        Comparable cur = array[0];
        for (int i = 1; i < n; i++){
            cur = array[i];
            int j = i - 1;
            while (j >= 0 && cur.compareTo(array[j]) < 0){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = cur;
        }
    }
    private static Student getByName(String name, Student[] students) throws StudentNotFoundException {
        for (Student s: students
             ) {
            if (Objects.equals(s.getName(), name)){
                return s;
            }
        }
        throw new StudentNotFoundException("no student " + name + " in our database");
    }
}
