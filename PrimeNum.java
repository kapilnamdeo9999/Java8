package com.java8.lamda;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 11;
        int temp = 0;
        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                temp = temp + 1;

            }
        }
        if(temp == 0 || temp == 1 || temp == 2){
            System.out.println(num + " Is prime ");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
