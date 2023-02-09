package com.example;

public class A<U> {

    public <T extends U> void foo(Class<T> clazz, T instanze) {
    }

}
