package com.example.demo.models;

public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person() {
        this.name = "";
        this.age = 0;
        this.hobby = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }
}



