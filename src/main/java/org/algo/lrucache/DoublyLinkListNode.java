package org.algo.lrucache;

import lombok.Data;

@Data
public class DoublyLinkListNode {

    private String key;
    private String value;

    private DoublyLinkListNode next;
    private DoublyLinkListNode prev;

    public DoublyLinkListNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "key = " + key + " value =" +value;
    }

}
