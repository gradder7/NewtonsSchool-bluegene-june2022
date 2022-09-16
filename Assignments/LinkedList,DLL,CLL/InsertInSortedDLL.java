/* 
 * Insertion in Sorted Doubly Linked List
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given head which is a reference node to a doubly- linked list of integers. Complete the function sortedInsertion which inserts value in sorted doubly linked list such that the list is sorted after insertion.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function sortedInsertion that takes the head of the linked list and the value to be inserted as parameter.

Constraints:
1 <= Number of nodes <= 10000.
Data at node <= 100000
Output
The function need not return anything.
Example
Sample Input 1:-
3 2
1 2 3

Sample Output 1:-
1 2 2 3

Explanation:
We will add 2 at index 2. So, our list is sorted and we successfully inserted the value 2.

Sample Input 2:-
2 0
1 2

Sample Output 2:-
0 1 2

Explanation:
We will insert 0 at index 0. So, our list is sorted and we successfully inserted the value 0.
 */
/*
class Node
{
   int data;
   Node next, prev;
};
*/
static Node sortedInsertion(Node head, Node newNode)
    {
        // Code
        if(head==null){
            //list is empty
            head = newNode;
        }

        //if found in head
        else if(head.data>=newNode.data){
            newNode.next=head;
            newNode.next.prev=newNode;
            head=newNode;
        }
        else{
            //in other position
            Node temp=head;
            while(temp.next!=null && temp.next.data<newNode.data){
                temp=temp.next;
            }
            newNode.next=temp.next;
            if(temp.next!=null){
                //if temp is not the last Node
                newNode.next.prev=newNode;
            }
            temp.next=newNode;
            newNode.prev= temp;
        }
        return head;
    }