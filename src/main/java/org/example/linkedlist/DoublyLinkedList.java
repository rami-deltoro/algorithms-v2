package org.example.linkedlist;

import lombok.Data;
import org.example.lrucache.DoublyLinkListNode;

@Data
public class DoublyLinkedList {

    private DoublyLinkListNode head;
    private DoublyLinkListNode tail;

    /*
    O(p) time - traversing the list up to p.
    O(1) space - keeping track of node
 */
    public void insertAtPosition(int position, DoublyLinkListNode nodeToInsert) {
        if(position == 1) {
            setHead(nodeToInsert);
            return;
        }

        DoublyLinkListNode node = head;
        int currentPosition = 1;

        while(node != null && currentPosition!=position) {
            node = node.getNext();
            currentPosition++;
        }

        if(node!=null) { //not at tail
            insertBefore(node,nodeToInsert);
        } else {
            setTail(nodeToInsert);
        }

    }

        /*
    O(1) time - constant
    O(1) space - constant
    */
    public void setHead(DoublyLinkListNode node) {
        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        insertBefore(head,node);
    }

        /*
    O(1) time - constant
    O(1) space - constant
    */
    public void setTail(DoublyLinkListNode node) {
        if(tail==null) {
            setHead(node);
            return;
        }

        insertAfter(tail,node);
    }

    /*
    O(1) time - constant
    O(1) space - constant
 */
    public void insertBefore(DoublyLinkListNode node, DoublyLinkListNode nodeToInsert) {
        if(nodeToInsert == head && nodeToInsert == tail) {
            return;
        }

        remove(nodeToInsert);

        nodeToInsert.setPrev(node.getPrev());
        nodeToInsert.setNext(node);

        if(node.getPrev()==null) {
            head = nodeToInsert;
        } else {
            DoublyLinkListNode previousNode = node.getPrev();
            previousNode.setNext(nodeToInsert);
        }

        node.setPrev(nodeToInsert);
    }

        /*
    O(1) time - constant
    O(1) space - constant
    */
    public void insertAfter(DoublyLinkListNode node, DoublyLinkListNode nodeToInsert) {
        if(nodeToInsert == head && nodeToInsert == tail) {
            return;
        }

        remove(nodeToInsert);

        nodeToInsert.setPrev(node);
        nodeToInsert.setNext(node.getNext());

        if(node.getNext() == null) {
            tail = nodeToInsert;
        } else {
            DoublyLinkListNode nextNode = node.getNext();
            nextNode.setPrev(nodeToInsert);
        }

        node.setNext(nodeToInsert);

    }


    /*
        O(n) time - traversing the whole list
        O(1) space - keeping track of node
     */
    public void removeNodeWithValue(String value) {
        DoublyLinkListNode node = head;

        while(node!=null) {
            DoublyLinkListNode nodeToRemove = node;
            node = node.getNext();
            if(node!=null && value.equals(nodeToRemove.getValue())) {
                remove(nodeToRemove);
            }
        }
    }

    /*
    O(1) time
    O(1) space
 */
    public void remove(final DoublyLinkListNode node) {
        if(head.getValue().equals(node.getValue())) {
            head = head.getNext();
        }

        if(tail.getValue().equals(node.getValue())) {
            tail = tail.getPrev();
        }

        removeNodeBindings(node);
    }

    private void removeNodeBindings(final DoublyLinkListNode node) {
        if(node.getPrev()!=null) {
            DoublyLinkListNode previousNode = node.getPrev();
            previousNode.setNext(node.getNext());
        }

        if(node.getNext()!=null) {
            DoublyLinkListNode nextNode = node.getNext();
            nextNode.setPrev(node.getPrev());
        }
        node.setPrev(null);
        node.setNext(null);
    }

    //TODO test this if there is only a Head and the value is/not is equal
    public boolean containsNodeWithValue(String value) {
        DoublyLinkListNode node = head;

        while(node!=null && !node.getValue().equals(value)) {
            node = node.getNext();
        }

        return node!=null;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        DoublyLinkListNode node = this.head;

        while (node!=null) {
            stringBuilder.append(node);
            stringBuilder.append("\n");
            node = node.getNext();
        }

        return stringBuilder.toString();
    }
}
