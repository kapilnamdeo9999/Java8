package com.java8.lamda;
import java.util.function.*;
public class FunctionJava {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(4));
    }
}
