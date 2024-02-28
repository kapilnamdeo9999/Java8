package com.java8.lamda;


interface Drawale{
   public void Draw();
}
public class Test1 {
    public static void main(String[] args) {
        int width = 10;
        Drawale obj = new Drawale() {
            @Override
            public void Draw() {
                System.out.println("The Width is " + width);
            }
        };
        obj.Draw();
    }
}

