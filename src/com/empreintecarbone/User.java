package com.empreintecarbone;

public class User {
    private String name;
    private int age;
    private String Id;

    public User(String name, int age, String Id){
        this.name = name;
        this.age = age;
        this.Id = Id;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                "id ='" + Id + '\'' +
                '}';
    }


}
