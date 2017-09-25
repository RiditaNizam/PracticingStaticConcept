package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Person person = new Person();  //Creating a new instance of the class Person
            System.out.println(person.count);  //Every time you create an object, you print out the count
        }
    }
}
