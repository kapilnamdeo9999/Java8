package com.java8.lamda;

public class FindtheSum {
    public static void main(String[] args) {
        String num = "12345";
        char[] number = num.toCharArray();
        int var = 0;
        for(int i = 0; i<= num.length()-1; i++){
            var = var + num.charAt(i) ;
            i++;
        }
        System.out.println(var);

    }
}
