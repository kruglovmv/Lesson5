package com.company;

import java.sql.SQLOutput;

public class employee{
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public employee(String name, String surname, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printClass(){
        System.out.println("Имя сотрудника: " +name);
        System.out.println("Фамилия сотрудника: " + surname);
        System.out.println("Должность сотрудника: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: "+ phone);
        System.out.println("Зарплата:  " + salary);
        System.out.println("Возраст: " + age);
    }
}
