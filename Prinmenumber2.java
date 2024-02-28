package com.java8.lamda;

import java.util.Scanner;

public class Prinmenumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int temp = 0;
        for(int i = 2; i <=no-1; i++){
            if(no % i == 0){
                temp = temp +i;
            }
        }
        if(temp>0){
            System.out.println("not Prime ");
        }
        else {
            System.out.println("prime" );
        }
    }
}


