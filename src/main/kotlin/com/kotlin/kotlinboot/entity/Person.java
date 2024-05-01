package com.kotlin.kotlinboot.entity;

import jakarta.annotation.Nullable;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Nullable
    public String getName() {
        return name;
    }
}
