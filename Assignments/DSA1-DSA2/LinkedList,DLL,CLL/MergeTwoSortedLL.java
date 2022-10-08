/* q
 * Merge two sorted linked list
easy
Problem Statement
Given two sorted linked list of size s1 and s2(sizes may or may not be same), your task is to merge them such that resultant list is also sorted.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Merge() that takes head node of both the linked list as the parameter.

Constraints:
1 < = s1, s2 < = 1000
1 < = val < = 10000
Output
Return the head of the merged linked list, printing will be done by the driver code
Example
Sample Input:
5 6
1 2 3 4 5
3 4 6 8 9 10

Sample Output:
1 2 3 3 4 4 5 6 8 9 10
 */

 /*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
    //Enter your code here
    Node dummy = new Node(0);
    Node tail = dummy;
    while(true){
        if(head1==null){
            tail.next=head2;
            break;
        }
        else if(head2==null){
            tail.next= head1;
            break;
        }
    
        if(head1.val<=head2.val){
            tail.next=head1;
            head1=head1.next;
        } else{
            tail.next= head2;
            head2= head2.next;
        }
        tail=tail.next;
    }
    return dummy.next;
    }