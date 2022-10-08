/* 
 * Zeros at front of linked list
easy
Problem Statement
Given a linked list, the task is to move all 0’s to the front of the linked list. The order of all another element except 0 should be same after rearrangement.

Note: Avoid use of any type of Java Collection frameworks.

Note: For custom input/output, enter the list in reverse order, and the output will also be in reverse order.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function moveZeroes() that takes head node as parameter.

Constraints:
1 <= T <= 100
1 <= N <= 100000
0<=Node.data<=100000

Note:- Sum of all test cases doesn't exceed 10^5

Output
Return the head of the modified linked list.
Example
Input:
2
10
0 4 0 5 0 2 1 0 1 0
7
1 1 2 3 0 0 0

Output:
0 0 0 0 0 1 1 2 5 4
0 0 0 3 2 1 1

Explanation:
Testcase 1:
Original list was 0->4->0->5->0->2->1->0->1->0->NULL.
After processing list becomes 0->0->0->0->0->4->5->2->1->1->NULL.

Testcase 2:
Original list was 1->1->2->3->0->0->0->NULL.
After processing list becomes 0->0->0->1->1->2->3->NULL.
 */
/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
       // Your code here
       if(head ==null){
           return null;
       }
       return removeZeros(head);
}

static public Node removeZeros(Node head){
    int count =0;
    Node mainHead=head;
    while(head!=null && head.data==0){
        //count zero at the beginning of list
        count++;
        head=head.next;
    }
    if(head==null){
        //if all values int the list is zero
        return mainHead;
    }
    Node temp =head;
    while(temp.next!=null){
        if(temp.next.data==0){
            count++;
            //deleting the node with value zero
            temp.next=temp.next.next;
        } else{
            temp= temp.next;
        }
    }
    if(temp.data==0){
        //hande last
        count++;
        temp=null;
    }
    while(count-->0){
        Node newNode=new Node(0);
        newNode.next=head;
        head=newNode;
    }
    return head;
}