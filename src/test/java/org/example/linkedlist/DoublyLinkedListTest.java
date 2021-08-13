package org.example.linkedlist;

import org.example.lrucache.DoublyLinkListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private final DoublyLinkListNode doublyLinkListNode1 = new DoublyLinkListNode("1","One");
    private final DoublyLinkListNode doublyLinkListNode2 = new DoublyLinkListNode("2","Two");
    private final DoublyLinkListNode doublyLinkListNode3 = new DoublyLinkListNode("3","Three");
    private final DoublyLinkListNode doublyLinkListNode4 = new DoublyLinkListNode("4","Four");
    private final DoublyLinkListNode doublyLinkListNode5 = new DoublyLinkListNode("5","Five");

    private final DoublyLinkListNode doublyLinkListNode100 = new DoublyLinkListNode("100","One Hundred");

    private DoublyLinkedList doublyLinkedList;

    @BeforeEach
    public void setup() {
        doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtPosition(1,doublyLinkListNode1);
        doublyLinkedList.insertAtPosition(2,doublyLinkListNode2);
        doublyLinkedList.insertAtPosition(3,doublyLinkListNode3);
        doublyLinkedList.insertAtPosition(4,doublyLinkListNode4);
        doublyLinkedList.insertAtPosition(5,doublyLinkListNode5);
    }


    @Test
    void insertAtPosition() {
        doublyLinkedList.insertAtPosition(6,doublyLinkListNode100);
        System.out.println(doublyLinkedList);
    }

    @Test
    void setHead() {
        doublyLinkedList.setHead(doublyLinkListNode100);
        System.out.println(doublyLinkedList);

    }

    @Test
    void setTail() {
        doublyLinkedList.setTail(doublyLinkListNode100);
        System.out.println(doublyLinkedList);
    }

    @Test
    void insertBefore() {
        doublyLinkedList.insertBefore(doublyLinkListNode3,doublyLinkListNode100);
        System.out.println(doublyLinkedList);
    }

    @Test
    void insertAfter() {
        doublyLinkedList.insertAfter(doublyLinkListNode3,doublyLinkListNode100);
        System.out.println(doublyLinkedList);
    }

    @Test
    void removeNodeWithValue() {
        doublyLinkedList.removeNodeWithValue("One Hundred");
        System.out.println(doublyLinkedList);

        doublyLinkedList.insertAfter(doublyLinkListNode3,doublyLinkListNode100);
        System.out.println(doublyLinkedList);

        doublyLinkedList.removeNodeWithValue("One Hundred");
        System.out.println(doublyLinkedList);
    }

    @Test
    void remove() {
        doublyLinkedList.remove(doublyLinkListNode100);
        System.out.println(doublyLinkedList);

        doublyLinkedList.insertAfter(doublyLinkListNode3,doublyLinkListNode100);
        System.out.println(doublyLinkedList);

        doublyLinkedList.remove(doublyLinkListNode100);
        System.out.println(doublyLinkedList);
    }

    @Test
    void containsNodeWithValue() {
        boolean hasValue = doublyLinkedList.containsNodeWithValue("One Hundred");
        System.out.println("hasValue = "+hasValue);

        hasValue = doublyLinkedList.containsNodeWithValue("One");
        System.out.println("hasValue = "+hasValue);

    }

    @Test
    void containsNodeWithValueSingleNode() {
        doublyLinkedList.remove(doublyLinkListNode1);
        doublyLinkedList.remove(doublyLinkListNode2);
        doublyLinkedList.remove(doublyLinkListNode3);
        doublyLinkedList.remove(doublyLinkListNode4);
        System.out.println(doublyLinkedList);

        boolean hasValue = doublyLinkedList.containsNodeWithValue("four");
        System.out.println("hasValue="+hasValue);

        hasValue = doublyLinkedList.containsNodeWithValue("Five");
        System.out.println("hasValue="+hasValue);

    }
}