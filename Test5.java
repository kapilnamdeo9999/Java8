package com.java8.lamda;
import java.util.*;
interface IntValPrint{
    void add(int x);
}

public class Test5 {
    public static void main(String[] args) {
        IntValPrint obj =(x)-> System.out.println(x*x);
    }
}
