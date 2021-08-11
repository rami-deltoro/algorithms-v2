package org.example.lrucache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LruCacheTest {

    @Test
    void testDetValueFromKey() {
        final LruCache lruCache = new LruCache(3);

        lruCache.insertKeyValuePair("1","One");
        lruCache.insertKeyValuePair("2","Two");
        lruCache.insertKeyValuePair("3","Three");

        System.out.println("getValueFromKey 1 ="+lruCache.getValueFromKey("1"));

        String recent = lruCache.getMostRecent();
        System.out.println("recent = "+recent);
    }

    @Test
    void testGetMostRecent() {
        final LruCache lruCache = new LruCache(3);

        lruCache.insertKeyValuePair("1","One");
        lruCache.insertKeyValuePair("2","Two");
        lruCache.insertKeyValuePair("3","Three");


        String recent = lruCache.getMostRecent();
        System.out.println("recent = "+recent);
    }

    @Test
    void insertNewTest() {
        final LruCache lruCache = new LruCache(3);

        lruCache.insertKeyValuePair("1","One");
        lruCache.insertKeyValuePair("2","Two");
        lruCache.insertKeyValuePair("3","Three");


        String recent = lruCache.getMostRecent();
        System.out.println("recent = "+recent);

        lruCache.insertKeyValuePair("4","Four");

        recent = lruCache.getMostRecent();
        System.out.println("recent after insert = "+recent);

        String oneFromCache = lruCache.getValueFromKey("1");
        System.out.println("oneFromCache = "+oneFromCache);

    }
}