package org.example.palindromecheck;


public class PalindromeCheck {

    /*
        O(N^2) time
        O(n) space
     */
    public boolean isPalindrome(String string) {
        String reversedString = "";

        for(int i=string.length()-1;i>=0;i--) {
            reversedString = reversedString + string.charAt(i);
        }

        return string.equals(reversedString);
    }

    /*
    O(n) time
    O(n) space
 */
    public boolean isPalindromeSB(String string) {
        StringBuilder reversedString = new StringBuilder();

        for(int i=string.length()-1;i>=0;i--) {
            reversedString.append(string.charAt(i));
        }

        return reversedString.toString().equals(string);
    }

    /*
O(n) time
O(n) space
*/
    public boolean isPalindromeRecursive(String string) {
        return isPalindromeRecursiveHelper(string,0);
    }

    private boolean isPalindromeRecursiveHelper(String string, int lIndex) {
        int rIndex = string.length() -1 -lIndex;

        return lIndex >= rIndex || string.charAt(lIndex) == string.charAt(rIndex) && isPalindromeRecursiveHelper(string, lIndex + 1);
    }


        /*
    O(n) time
    O(1) space
    */
    public boolean isPalindromeI(String string) {
        int lIndex = 0;
        int rIndex = string.length()-1;

        while (lIndex < rIndex) {
            if(string.charAt(lIndex) != string.charAt(rIndex)) {
                return false;
            }

            lIndex ++;
            rIndex--;
        }

        return true;

    }

}
