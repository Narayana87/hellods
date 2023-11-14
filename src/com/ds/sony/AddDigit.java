package com.ds.sony;

import java.util.Scanner;

public class AddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;

        while(num > 0){
            //get the last digit of the number using modulo operator
            int digit = num % 10;
            //add the digit to the sum
            sum += digit;
            //remove the last digit of the number using division operator
            num /= 10;
        }
        System.out.println("The sum is : "+sum);

    }
}
