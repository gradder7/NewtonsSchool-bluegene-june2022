/* 
 * Circular linked list
easy
Problem Statement
Given a linked list consisting of N nodes, your task is to check if the given list is circular or not.

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function check() that takes head node as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data<= 1000

Output
Return 1 if the given linked list is circular else return 0.
Example
Sample Input 1:-
3 0
1 2 3

Sample Output 1:-
0

Explanation:-
1->2->3

Sample Input 2:-
3 1
1 2 3

Sample Output 2:-
1

Explanation:-
1->2->3->1.......
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

public static int check(Node head) {
    //enter your code here
    // if(head == null){
    //     return 1;
    // }
    // Node cNode= head.next;
    // while(cNode!=null && cNode!=head){
    //     cNode= cNode.next;
    // }
    // if(cNode==head)
    // return 1;
    // else
    // return 0;
    
    
    Node temp =head;
    if(head == null){
        return 1;
    }
    while(true){
        if(temp.next==null){
            return 0;
        }
        if(temp.next==head){
            return 1;
        }
        temp= temp.next;
    }
    }