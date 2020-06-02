package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
    public  static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number: ");
        if (num < 0) {
            throw new NegativeArraySizeException();
        }
        return num;
    }
    public static void fillArray(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            System.out.println("Negative number occured.");
            arr[i] = 0;
        }
    }
}
