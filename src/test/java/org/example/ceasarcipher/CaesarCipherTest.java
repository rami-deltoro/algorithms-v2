package org.example.ceasarcipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    private CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    void encrypt() {
        String string = "rami";

        String encryptedString = caesarCipher.encrypt(string,26*10+1);

        System.out.println(encryptedString);
    }

    @Test
    void encrypt2() {
        String string = "rami";

        String encryptedString = caesarCipher.encrypt2(string,26*10+1);

        System.out.println(encryptedString);
    }
}