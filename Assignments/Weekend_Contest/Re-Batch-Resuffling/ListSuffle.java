/* 
 * List shuffle
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a list of size 2*N in the form as x1->x2->x3.. xn, y1->y2->y3,. yn, your task is to shuffle the list in the form given as x1->y1->x2->y2,. xN,->yN.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addNumber() that takes the head node of the linked lists as a parameter.

Constraints:-
1 <= N <= 1000
Output
Return the head of the modified list.
Example
Sample Input:-
3
1 2 3 4 5 6

Explanation:
1- >2- >3- >4- >5- >6

Sample Output:-
1 4 2 5 3 6

Explanation:
1- >4- >2- >5- >3- >6

Sample Input:-
2
2- >4- >6- >8

Sample Output:-
2- >6- >4- >8
 */
/*

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

public static Node Shuffle(Node head){
    //Enter your code here
Node slow = head;
Node fast = slow.next;
boolean restricted=false;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
Node left=head;
Node right=slow.next;
slow.next=null;

//dummy Node
Node dummy = new Node(0);
Node temp=dummy;
while(left!=null || right!=null){
    if(left!=null){
        temp.next=left;
        temp=temp.next;
        left=left.next;
    }
    if(right!=null){
        temp.next=right;
        temp=temp.next;
        right=right.next;
    }
}
head= dummy.next;
return head;
}
// public static Node mid(Node head){
//     Node slow = head;
//     Node fast= fast;
//     while(fast!=null && fast.next!=null){
//         slow=slow.next;
//         fast=fast.next.next;
//     }
//     return slow.next;
// }