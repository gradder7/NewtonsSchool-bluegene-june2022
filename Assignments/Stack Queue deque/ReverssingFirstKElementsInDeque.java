/* 
 * Reversing the first K elements of a deque
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a deque of N integers and an integer K. Reversing the first K elements of a deque and print it.
Input
First line contains an integer N and K.
Next line contains N space separated integers denoting elements of deque.

Constraints
1 <= K <= N <= 10^5
0 <= Ai<= 10^5
Output
Print N space separated integers - the elements of deque after reversing the first K elements.
 Example
Sample Input 1:
5 2
1 2 3 4 5

Output
2 1 3 4 5

Explanation:
Reversing : (1 2)(3 4 5) - > (2 1)(3 4 5)

Sample Input 2:
4 3
1 3 4 2

Output
4 3 1 2

Explanation
Reversing : (1 3 4)(2) - > (4 3 1)(2)
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<n;i++){
        int t = sc.nextInt();
        dq.offerLast(t); //addLast();   
        }
        //   while (!dq.isEmpty()) {
        //     System.out.print(dq.peekFirst() + " ");
        //     dq.removeFirst();
        // }

        Stack<Integer> st = new Stack<>();

        // Push the first K elements into a Stack
        for(int i=0;i<k;i++){
            st.push(dq.peekFirst());
            dq.removeFirst();
        }
        
        //addLast in dq all elements of the stack in reverse order
        while(!st.isEmpty()){
            dq.addLast(st.peek());
            st.pop();
        }

        //take un reverse elemnts of the dq and add them in last.
        for(int i=0;i<dq.size()-k;i++){
            dq.addLast(dq.peekFirst());
            dq.removeFirst();
        }

        //print
         while (!dq.isEmpty()) {
            System.out.print(dq.peekFirst() + " ");
            dq.removeFirst();
        }

    }
}