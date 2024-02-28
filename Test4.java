package com.java8.lamda;
import java.util.*;
interface SyaHello{
    void Hello();
}

public class Test4 {
    public static void main(String[] args) {
        SyaHello obj =()->{
            System.out.println("Say Hello to Me ::Hello");
        };
        obj.Hello();
    }
}
