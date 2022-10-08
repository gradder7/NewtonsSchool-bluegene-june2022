/* 
 * Remove Duplicates from doubly linked list
medium
Problem Statement
Given a sorted doubly linked list containing n nodes. Your task is to remove duplicate nodes from the given list.

Example 1:
Input
1<->2<->2-<->3<->3<->4

Output:
1<->2<->3<->4

Example 2:
Input
1<->1<->1<->1

Output
1
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteDuplicates() that takes head node as parameter.

Constraints:
1 <=N <= 10000
1 <= Node. data<= 2*10000
Output
Return the head of the modified list.
Example
Sample Input:-
6
1 2 2 3 3 4

Sample Output:-
1 2 3 4

Sample Input:-
4
1 1 1 1

Sample Output:-
1
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
public static Node deleteDuplicates(Node head) {
    //complete this function
    if(head ==null){
      return null;
    }
    
    Node temp= head;
    while(temp.next!=null){
      if(temp.val==temp.next.val){
        delete(head,temp.next);
      }
      else{
        temp=temp.next;
      }
    }
    return head;
    
    }
    //2 3 4 5
    //2 <- 4
    
    // 1 2 2 3 3 4
    //   t
    
    // 1 2 2 3 3 4
    //   t
    // 2->
    
    //     2<-3
    //     2->3
    
    public static Node delete(Node head,Node temp){
      if (head==null || temp==null){
        return null;
      }
      //if head to be delete
      if(head==temp){
        head = temp.next;
      }
      // Node if not last node so make next
      if(temp.next!=null){
        temp.next.prev=temp.prev;
      }
    
      // change previous only if node is not first node
    
      if(temp.prev!=null){
        temp.prev.next= temp.next;
      }
      return head;
    }