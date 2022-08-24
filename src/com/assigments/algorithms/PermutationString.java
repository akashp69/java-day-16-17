package com.assigments.algorithms;

import java.util.Scanner;

public class PermutationString {
    public void permutation(char[] charArray, int left, int right) {
        int start;
        if (left == right) {
            for (int i = 0; i < charArray.length; i++) {
                System.out.print(charArray[i]);
            }
            System.out.println();
        } else {
            for (start = left; start < right; start++) {
                swap(charArray, left, start);
                permutation(charArray, left + 1, right);
                swap(charArray, left, start);
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        PermutationString permutation = new PermutationString();
        System.out.println("Enter the String to be permute : ");
        Scanner s = new Scanner(System.in);
        char[] ch = s.next().toCharArray();
        System.out.println("Permutations are :");
        permutation.permutation(ch, 0, ch.length);
    }
}
