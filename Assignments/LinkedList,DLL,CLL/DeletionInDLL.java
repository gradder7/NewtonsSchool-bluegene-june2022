/* 
 * Deletion in Doubly Linked List
easy
Problem Statement
Given a Doubly linked list consisting of N nodes and given a number K. The task is to delete the Kth node from the end of the linked list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and the position K as parameter.

Constraints:
1 <=K<=N<= 1000
1 <=value<= 1000
Output
Return the head of the modified Doubly linked list
Example
Input:
5 3
1 2 3 4 5

Output:
1 2 4 5

Explanation:
After deleting 3rd node from the end of the linked list, 3 will be deleted and the list will become 1, 2, 4, 5.
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
public static Node deleteElement(Node head,int k) {
    //enter your code here'
    Node temp1= head;
    while(k>1){
        temp1=temp1.next;
        k--;
    }
    
    Node temp2= head;
    while(temp1.next!=null){
        temp1=temp1.next;
        temp2=temp2.next;
    }
    
    //if delete head
    if(temp2==head){
        temp2.next.prev=null;
        return temp2.next;
    }
    
    if(temp2.next!=null){
    temp2.next.prev=temp2.prev;
    }
    
    if(temp2.next!=null){
       temp2.prev.next=temp2.next;
    }
    
    return head;
    }