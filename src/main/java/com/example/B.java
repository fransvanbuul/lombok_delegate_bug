package com.example;

import lombok.experimental.Delegate;

import java.util.Collection;

public class B {

    @Delegate
    protected final A<Collection<?>> a = new A<>();

    /* This is what gets generated, causing an error reported in C. */
//    public <T extends U> void foo(Class<T> clazz, T instanze) {
//        this.a.foo(clazz, instanze);
//    }

    /* This is what should be generated: */
//    public <T extends Collection<?>> void foo(Class<T> clazz, T instanze) {
//        this.a.foo(clazz, instanze);
//    }
}
