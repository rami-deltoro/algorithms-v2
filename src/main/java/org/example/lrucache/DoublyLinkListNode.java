package org.example.lrucache;

import lombok.Data;

@Data
public class DoublyLinkListNode {

    private String key;
    private String value;

    public DoublyLinkListNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
