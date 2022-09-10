package LinkedList.singlell;

import java.util.HashSet;
import java.util.Set;

public class MaximumdistancePeek {
    Node head;
    
    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data= data;
            this.next=null;// when new node create next will be null
        }
    }

    public void addLast(Integer data) {
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head; // why? if head becomes head next so we will lose prev head or starting head.
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;
    }

    public void maxDistancePeek(){
        Set<Node> peaks = new HashSet<>();
 
        // Pre points to previous of current node
        Node pre = new Node(-1);
        pre.next = head;
 
        // Current is initially head
        Node cur = head;
 
        // Loop till current is not null
        while (cur != null) {
 
            // Find next of current
            Node next = cur.next;
 
            // One node only
            if (pre.next == head && next == null)
                peaks.add(cur);
 
            // For the 1st node check only next
            else if (pre.next == head
                     && next.data < cur.data)
                peaks.add(cur);
 
            // For the last node check
            // only the prev node
            else if (next == null
                     && pre.data < cur.data)
                peaks.add(cur);
 
            // Check prev and next nodes for all
            // intermediate nodes
            else if (pre.data < cur.data
                     && next.data < cur.data)
                peaks.add(cur);
 
            // Move pre and cur pointer
            pre = pre.next;
            cur = cur.next;
        }
 
        // Initialize
        int lastPeakIndex = -1,
            currentIndex = 0,
            maxGap = 0, gap = 0;
 
        cur = head;
 
        // Iterate through the linkedlist
        while (cur != null) {
 
            // If current node is a peak
            if (peaks.contains(cur)) {
 
                // If current node is first peak
                // then update lastPeakIndex
                // and move ahead
                if (lastPeakIndex == -1)
                    lastPeakIndex = currentIndex;
 
                // If current node peak then
                // calculate gap and update
                // lastPeakIndex and move ahead
                else {
                    gap = currentIndex
                          - lastPeakIndex - 1;
                    maxGap = Math.max(gap, maxGap);
                    lastPeakIndex = currentIndex;
                }
            }
 
            // Increment currentIndex
            // move current node ahead
            currentIndex++;
            cur = cur.next;
        }
        System.out.println(maxGap);
    }

    public void print() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head; // why? if head becomes head next so we will lose prev head or starting head.
        while(temp!=null){ // to print last next so not use .next
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MaximumdistancePeek mx= new MaximumdistancePeek();
        //1 -> 2 -> 3 -> 1 -> 5 -> 4 -> 4 -> 10 -> 7
        mx.addLast(1);
        mx.addLast(3);
        mx.addLast(1);
        mx.addLast(1);
        mx.addLast(1);
        mx.addLast(1);
        mx.addLast(4);
        mx.addLast(2);
        mx.addLast(7);
        mx.maxDistancePeek();



    }
}
