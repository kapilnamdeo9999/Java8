package com.java8.lamda;

import java.awt.*;

public class LamdaExample {
    public static void main(String[] args) {
        Name kapil = ()-> System.out.println("hi to kapil");
    }

}
interface Name{
    void kapil();
}
class KapilName implements Name{
    public void kapil(){
        System.out.println("say Hi to Kapil");
    }
}

