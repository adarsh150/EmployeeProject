package com.adarsh.learnJava;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
public class Person {
    private String name;
    private int age;
    private int id;


    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", id=" + id + '}';
    }
}
