package org.java.springsecurity.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student student = new Student(
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "John";
                case 3 -> "David";
                case 4 -> "Sarah";
                case 5 -> "King";
                default -> "Other";
                    },
                    switch(i) {
                case 1 -> "wamboo";
                case 2 -> "456";
                case 3 -> "789";
                case 4 -> "abc";
                case 5 -> "xyz";
                default -> "Other";
                    }
                    ,  12 + i);
            System.out.println(student);
        }
    }
}
