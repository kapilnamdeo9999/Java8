package com.java8.lamda;

import java.util.Scanner;

public class Prymid2 {
    public static void main(String[] args) {
        int rowcount = 1;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row; i>= 0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=rowcount; j++){
                System.out.print(" *");
            }
            System.out.println();
            rowcount++;
        }
    }
}
