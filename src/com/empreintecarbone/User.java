package com.empreintecarbone;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String id;
    private ArrayList<CarbonConsumption> carbonConsumption;

    public User(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                "id ='" + id + '\'' +
                '}';
    }

    public void getInformations() {
        System.out.println("Nom: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Identifiant: " + this.id);
    }


}
