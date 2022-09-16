/* 
 * Reverse Queue I
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have been given a queue of integers of size N , you need to reverse the elements in the queue.
You can only use standard queue operations.
Input
You don't have to input anything . Just implement the reverseQueue function .

Constraints :
1 <= N <= 10^5
1 <= element <= 10^9
Output
You don't have to output anything.
Example
Input:
4
1 2 3 4

Output:
4 3 2 1
 */
class Solution{
    public void reverseQueue(Queue<Integer> Q){
        //take a stack  beacuse stack follows lifo
       Stack<Integer> st = new Stack<>();
       //insert num to stack and remove from queue
       while(!Q.isEmpty()){
           st.push(Q.peek());
           Q.remove();
       }
       //insert num to queue and remove from stack 
       while(!st.isEmpty()){
           Q.add(st.peek());
           st.pop();
       }
    } 
}