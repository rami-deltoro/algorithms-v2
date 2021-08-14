package org.example.ceasarcipher;

public class CaesarCipher {

    /*
    O(n) time
    O(n) space
     */
    public String encrypt(String string,int key) {
        StringBuilder stringBuilder = new StringBuilder();
        char newKey = (char) (key % 26);

        for(char letter : string.toCharArray()) {
            stringBuilder.append(getNewLetter(letter,newKey));
        }

        return stringBuilder.toString();
    }

    private String getNewLetter(char letter,char key) {
        char newLetterCode = (char) (letter + key);

        if (newLetterCode <= 122) {
            return String.valueOf(newLetterCode);
        } else {
            return String.valueOf(96 + newLetterCode % 122);
        }
    }

//TODO Review this algo
        /*
    O(n) time
    O(n) space
     */
    public String encrypt2(String string,int key) {
        StringBuilder stringBuilder = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char newKey = (char) (key % 26);

        for(char letter : string.toCharArray()) {
            stringBuilder.append(getNewLetter2(letter,newKey,alphabet));
        }

        return stringBuilder.toString();
    }

    private String getNewLetter2(char letter,char key, String alphabet) {
        char newLetterCode = (char) (alphabet.indexOf(letter) + key);

        if(newLetterCode <=25) {
            return String.valueOf(alphabet.charAt(newLetterCode));
        } else {
            return String.valueOf(alphabet.charAt(-1 + newLetterCode % 25));
        }
    }
}
