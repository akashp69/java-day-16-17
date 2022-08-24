package com.assigments.algorithms.datastructure;

import java.util.Scanner;

public class UnOrderedList {
    public static void main(String[] args) {
        String sentence = "Paranoids are not paranoid because they are paranoid but"
                + " because they keep putting themselves deliberately into paranoid avoidable situations";
        System.out.println("Paranoids are not paranoid because they are paranoid but"
                + " because they keep putting themselves deliberately into paranoid avoidable situations");
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter words to search from the pragraph");
        String item=sc.next();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words)

            list.add(word);

        if (list.search(item) == true)
        {
            list.removeItem(item);
        }
        else
        {
            list.add(item);
        }
        System.out.println("List of words: ");
        list.show();

        int size = list.getSize();
        System.out.println("Size of the list: " + size);
    }
}
