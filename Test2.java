package com.java8.lamda;
import java.util.function.*;
interface Drawble{
   void Draw();
}
public class Test2 {
    public static void main(String[] args) {
        int width = 20;
       Drawale d=()->{
           System.out.println("the Width is " +width );
       };
       d.Draw();

    }
}
