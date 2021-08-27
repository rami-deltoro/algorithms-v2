package org.algo.splitstring;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {

    private static int MAX_CHARACTERS_OF_MESSAGE_IN_TWEET = 129;
    private static Pattern pattern = Pattern.compile(".{1," + (MAX_CHARACTERS_OF_MESSAGE_IN_TWEET-1) + "}");

    public List<String> splitMessage(String message) {
        final Matcher matcher = pattern.matcher(message);
        final List<String> tweetsToReturn = new ArrayList<>();
        int i = 0;
        while (matcher.find()) {
            tweetsToReturn.add("(Tweet "+(++i)+"/"+matcher.groupCount()+ ")"+matcher.group());
        }
        return tweetsToReturn;
    }
}
