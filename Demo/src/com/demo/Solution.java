package com.demo;

import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(String str) {
        
    	str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String A = sc.nextLine(); // Read the entire line

        boolean result = isPalindrome(A);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

