/* 
 * Forming Queue from two stack
easy
Problem Statement
A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process q queries, where each query is one of the following 3 types:

1 x: Enqueue element x into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:-
enQueue() that takes the integer x(input element) as a parameter.
deQueue()that takes no parameter
Print1()that print the element which is at the front of the queue

Constraints:-
1 <= x <= 10^9
1 <= number of queries <= 1000

Note:- It is guaranteed that the queue will never be empty whenever Print function or deQueue function is called.
Output
Print the value of the element which is at the front of the queue on a new line in Print1().
Example
Sample Input:-
10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2


Sample Output:-
14
14
 */

/*
 static Stack<Integer> s1 = new Stack<Integer>();  
 static Stack<Integer> s2 = new Stack<Integer>();  
*/
  
static void enQueue(int x)  
{  
  //Enter your code here
  while(!s1.isEmpty()){
    s2.push(s1.pop());  
   }
   s1.push(x);
   while(!s2.isEmpty()){
     s1.push(s2.pop());
   }
}  

static void deQueue()  
{   
 //Enter your code here
 if(s1.isEmpty()){
   System.out.println("empty");
   return;
 }
 //System.out.println(s1.pop());
 s1.pop();
} 
static void Print1(){
  // Enter your code here
  System.out.println(s1.peek());
}