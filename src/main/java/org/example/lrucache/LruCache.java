package org.example.lrucache;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * TODO see how to implement a double link list like LinkedList implementation
 */
public class LruCache {

    private final int maxSize;
    private HashMap<String,DoublyLinkListNode> cache = new HashMap<>();
    private int currentSize=0;
    private LinkedList<DoublyLinkListNode> listOfMostRecent = new LinkedList<>();

    public LruCache(final int maxSize) {
        this.maxSize=maxSize;
    }

    /*
        O(1) time | O(1) space
     */
    public void insertKeyValuePair(final String key, final String value) {
        if(cache.containsKey(key)) {
            replaceKey(key,value);
        } else {
            if(currentSize==maxSize) {
                evictLeastRecent();
            } else {
                currentSize++;
            }

            final DoublyLinkListNode doublyLinkListNode = new DoublyLinkListNode(key,value);
            cache.put(key, doublyLinkListNode);
        }

        updateMostRecent(cache.get(key));
    }

    /*
    O(1) time | O(1) space
    */
    public String getValueFromKey(final String key) {
        String valueToReturn = null;
        if(cache.containsKey(key)) {
            valueToReturn = cache.get(key).getValue();
            updateMostRecent(cache.get(key));
        }

        return valueToReturn;
    }

    /*
    O(1) time | O(1) space
    */
    public String getMostRecent() {
        return listOfMostRecent.getFirst().getKey();
    }

    private void updateMostRecent(final DoublyLinkListNode doublyLinkListNode) {
        listOfMostRecent.addFirst(doublyLinkListNode);
    }

    private void evictLeastRecent() {
        final DoublyLinkListNode nodeToRemove = listOfMostRecent.removeLast();
        cache.remove(nodeToRemove.getKey());
    }

    private void replaceKey(final String key, final String value) {
        if(!cache.containsKey(key)) {
            throw new IllegalArgumentException("The provided key :"+key+" isn't in the cache.");
        }

        cache.get(key).setValue(value);
    }
}
