package org.java.algorithm;

public class DetectACycle {
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        Node p1 = head, p2 = head;

        while (p1 != null && p1.next != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            {
                if (p1 == p2) return true;

            }

        }
        return false;

    }
}
