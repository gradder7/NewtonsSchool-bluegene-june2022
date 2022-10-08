/* 
 * Palindrome List
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a linked list consisting of N nodes, your task is to check if the given list is palindrome or not.

A palindrome is a string/number that mirrors itself, for example, 21312 reverse is also 21312.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions Ispalindrome() that takes the head of the linked list as parameter.

Constraints:-
1<=N<=1000
1<=Node.data<=1000
Output
Return true if given list is palindrome else return false.
Example
Sample Input 1:-
5
1 2 3 2 1

Sample Output 1:-
Yes

Sample Input 2:-
3
1 2 2

Sample Output 2:-
No
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
public static boolean IsPalindrome(Node head) {
    //enter your code here
    
    if(head==null || head.next==null)
    return true;
    Node mid = middle(head);
    Node last = reverse(mid);
    Node cur = head;
    while(last!=null){
        if(last.val != cur.val)
        return false;
        last= last.next;
        cur = cur.next;
    }
    return true;
    }
    
    public static Node reverse(Node head){
            Node previous =null;
            Node next = null;
            Node current = head;
            while(current != null){
                next = current.next;
                current.next=previous;
                previous= current;
                current= next;
            }
            return previous;
        }
    
    
    public static Node middle(Node head){
        Node slow= head;
        Node fast= head;
        while(fast!=null &&fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }return slow;
    }