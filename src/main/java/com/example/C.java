package com.example;

import java.util.ArrayList;
import java.util.List;

public class C extends B {

    public void bar() {
        foo(List.class, new ArrayList<String>());
    }

}
