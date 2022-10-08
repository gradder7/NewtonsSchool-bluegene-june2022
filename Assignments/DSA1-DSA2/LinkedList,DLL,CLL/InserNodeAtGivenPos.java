/* 
 * Insert node at the given position
easy
Problem Statement
Given a linked list consisting of N nodes and two integers M and K. Your task is to add element K at the Mth position from the start of the linked list
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addElement() that takes head node, M(position of element to be inserted) and K(the element to be inserted) as parameter.

Constraints:
1 <= M <=N <= 1000
1 <=K, Node.data<= 1000
Output
Return the head of the modified linked list
Example
Sample Input:-
5 3 2
1 3 2 4 5

Sample Output:-
1 3 2 2 4 5

Explanation:-
here M is 3 and K is 2
so we insert 2 at the 3rd position, resulting list will be 1 3 2 2 4 5

Sample Input 2:-
5 2 6
1 2 3 4 5

Sample Output 2:-
1 6 2 3 4 5
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

public static Node addElement(Node head, int k ,int pos ) {
    //enter your code here
    Node newNode = new Node(k);
    if(pos==1){
        newNode.next=head;
        return newNode;
    }
    Node temp = head;
    while(pos>2){ // start from second position.
        temp=temp.next;
        pos--;
    }
    newNode.next= temp.next;
    temp.next= newNode;
    return head;
    
    }