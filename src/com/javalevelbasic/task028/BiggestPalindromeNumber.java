package com.javalevelbasic.task028;

/**
 * A palindrome number on both sides (from right to left and from left to right) reads the same.
 * The largest number is a palindrome obtained by multiplying two two-digit numbers -9009 = 91 x 99.
 * Find the largest palindrome obtained by multiplying two three-digit numbers.
 */
public class BiggestPalindromeNumber {

    public static final int LIMIT_NUMBER = 1000;

    public static void main(String[] args) {
        System.out.println(getBiggestPalindromeNumber(LIMIT_NUMBER));
    }

    /**
     * fine the biggest palindrome number by multiplying two three-digit numbers
     * @param number
     * @return
     */
    private static int getBiggestPalindromeNumber(int number) {
        for (int i = number; i > 0; i--) {
            for (int j = number; j > 0; j--) {
                if (isPalindrome(i * j)) {
                    return i * j;
                }
            }
        }
        return -1;
    }

    /**
     * check if the number is palindrome
     * @param number
     * @return
     */
    public static boolean isPalindrome(int number) {
        String sb = String.valueOf(number);
        String reverse = new StringBuilder(sb).reverse().toString();
        return sb.equals(reverse.toString());
    }

}
