package org.algo.splitstring;

import org.junit.jupiter.api.Test;

import java.util.List;

class SplitStringTest {

    private SplitString splitString = new SplitString();

    @Test
    void splitMessage() {
        String text = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                      "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" +
                        "CCCC";
        List<String> tweets =        splitString.splitMessage(text);

        for (String tweet : tweets) {
            System.out.println("tweet="+tweet);

        }
    }
}