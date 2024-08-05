package org.java.springsecurity.Classes;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getFullName() {

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }

        if (firstName.isEmpty()) {
            return lastName;
        }

        if (lastName.isEmpty()) {
            return firstName;
        }

        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);

        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Is Teenager: " + person.isTeen());

        person.setAge(17);
        System.out.println("Is Teenager: " + person.isTeen());

        person.setAge(-1);
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teenager: " + person.isTeen());
    }
}
