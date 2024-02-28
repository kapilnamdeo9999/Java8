package com.java8.lamda;

public class StringDuplicate {
    public static void main(String[] args) {
        String str = "KapilNamdeo";
        String var ="";
        for(int i = str.length() -1; i>=0; i--){
            var = var + str.charAt(i);
        }
        System.out.println(var);
    }
}
