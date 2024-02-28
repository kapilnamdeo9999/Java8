package com.java8.lamda;
import java.util.*;
interface SumofNum{
    int sum(int x, int y);
}

public class Test6 {
    public static void main(String[] args) {
        SumofNum obj = (x, y)->(x+y);{
            System.out.println("the sum is "+obj.sum(50,60));
        }
            System.out.println(obj.sum(20,30));

    }
}
