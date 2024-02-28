package com.java8.lamda;

public class Findsum {
    public static void main(String[] args) {
        String num = "12345";
        int var = 0;
        for(int i = num.length() ; i<0; i--){
            var = var + num.charAt(i);
        }
        System.out.println(var);
    }
}
