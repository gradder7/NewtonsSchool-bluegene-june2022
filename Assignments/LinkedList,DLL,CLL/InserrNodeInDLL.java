/* 
 * Insert a node in doubly linkedlist
easy
Problem Statement
Given a reference to the head of a sorted doubly-linked list and an integer k, your task is to insert the integer k in your doubly linked-list while maintaining the sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function insertnew() that takes head node of the linked list and the integer k as parameter.

Constraints:
1 <= T <= 100
1 <= Node.data <= 1000
Output
Return the head of the modified linked list.
Example
Sample Input
1
4
1
3
4
10
5

Sample Output
1 3 4 5 10
 */
/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) {    
    Node newNode = new Node(k);
    if(head==null){
        head=newNode;
    }

    else if(head.val>=newNode.val){
        newNode.next=head;
        newNode.next.prev=newNode;
        head=newNode;
    }

    else{
        Node temp =head;
        while(temp.next!=null && temp.next.val<newNode.val){
            temp=temp.next;
        }
        newNode.next=temp.next;
        if(temp.next!=null){
            newNode.next.prev=newNode;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    return head;
}