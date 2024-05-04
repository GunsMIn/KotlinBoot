package com.kotlin.kotlinboot.service;

import jakarta.annotation.Nullable;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }
}
