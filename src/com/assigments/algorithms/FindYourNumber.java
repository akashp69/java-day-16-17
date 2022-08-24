package com.assigments.algorithms;


import java.util.Scanner;

public class FindYourNumber {
    int[] numberArray;
    int count = 0;
    int ans;
    int N;
    double maxCount = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        FindYourNumber findYourNumber = new FindYourNumber();
        findYourNumber.start();
    }
    void start() {
        System.out.print("Enter limit N: ");
        N = sc.nextInt();
        numberArray = new int[N];


        for (int i = 0; i < N; i++) {
            numberArray[i] = i;
        }

        maxCount = (Math.log(N) / Math.log(2));
        System.out.println("Number of tries required to guess: " + ((int) maxCount + 1));
        binarySearch(0, N - 1);
    }
    void binarySearch(int first, int last) {
        if (count < maxCount) {
            int middle = (first + last) / 2;
            count++;
            System.out.println("Is number between " + first + " and " + middle + "?");
            String temp = sc.next();
            if (temp.equals("y")) {
                change(middle + 1, last);
                binarySearch(first, middle);
            } else if (temp.equals("n")) {
                change(first, middle);
                binarySearch(middle + 1, last);
            }
        } else {
            for (int i : numberArray) {
                if (i != -1) {
                    System.out.println("The number is: " + i);
                }
            }
        }
    }


    void change(int first, int last) {
        for (int i = first; i <= last; i++) {
            numberArray[i] = -1;
        }
    }
}