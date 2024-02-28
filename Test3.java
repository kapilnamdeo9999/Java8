package com.java8.lamda;
import java.util.function.*;
interface Print{
    void print();
}
public class Test3 {
    public static void main(String[] args) {
        Print obj = new Print() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        obj.print();

    }
}
