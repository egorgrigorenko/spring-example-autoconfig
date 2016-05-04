package com.egorgrigorenko;

import org.springframework.stereotype.Component;

@Component
public class FooImpl implements Foo {
    public void print(String s) {
        System.out.println(s);
    }
}
