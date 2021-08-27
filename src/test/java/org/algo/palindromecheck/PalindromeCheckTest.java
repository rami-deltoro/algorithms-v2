package org.algo.palindromecheck;

import org.junit.jupiter.api.Test;

class PalindromeCheckTest {
    private PalindromeCheck palindromeCheck = new PalindromeCheck();

    @Test
    void isPalindrome() {
        String string ="abcdGdcba";
        boolean isPalindrome = palindromeCheck.isPalindrome(string);
        System.out.println(isPalindrome);
    }

    @Test
    void isPalindromeSB() {
        String string ="abcdGdcba";
        boolean isPalindrome = palindromeCheck.isPalindromeSB(string);
        System.out.println(isPalindrome);

        String string2 ="abcdGdcba2";
        boolean isPalindrome2 = palindromeCheck.isPalindromeSB(string2);
        System.out.println(isPalindrome2);
    }

    @Test
    void isPalindromeRecursive() {
        String string ="abcdGdcba";
        boolean isPalindrome = palindromeCheck.isPalindromeRecursive(string);
        System.out.println(isPalindrome);

        String string2 ="abcdGdcba2";
        boolean isPalindrome2 = palindromeCheck.isPalindromeRecursive(string2);
        System.out.println(isPalindrome2);
    }

    @Test
    void isPalindromeI() {
        String string ="abcdGdcba";
        boolean isPalindrome = palindromeCheck.isPalindromeI(string);
        System.out.println(isPalindrome);

        String string2 ="abcdGdcba2";
        boolean isPalindrome2 = palindromeCheck.isPalindromeI(string2);
        System.out.println(isPalindrome2);
    }
}