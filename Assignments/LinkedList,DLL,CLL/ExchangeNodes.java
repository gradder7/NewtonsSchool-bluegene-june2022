/* 
 * Exchange Nodes
easy
Problem Statement
Given a circular linked list consisting of N nodes, your task is to exchange the first and last node of the list.

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function exchangeNodes() that takes head node as parameter.

Constraints:
3 <= N <= 1000
1 <= Node. data<= 1000
Output
Return the head of the modified linked list.
Example
Sample Input 1:-
3
1- >2- >3

Sample Output 1:-
3- >2- >1

Sample Input 2:-
4
1- >2- >3- >4

Sample Output 2:-
4- >2- >3- >1
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
public static Node exchangeNodes(Node head) {
    //Enter your code here
        if (head == null) {
            return head;
        }
        Node temp = head;
        while(temp.next.next!=head){
          temp = temp.next; 
        }
        // //swap
        // int t = head.val;
        // head.val = temp.val;
        // temp.val = t;
        head=temp.next;
        Node firstNode= head.next;
        head.next=firstNode.next;
        firstNode.next=head;
        temp.next=firstNode;
        return head;
    }