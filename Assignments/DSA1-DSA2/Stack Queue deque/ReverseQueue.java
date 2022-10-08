/* 
 * Reverse Queue II
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have been given a queue of integers of size N and an Integer K, you need to reverse first K elements in the queue leaving the rest elements as it is.

You can only use standard queue operations.
Input
You don't have to input anything. Just implement the reverseQueueKFirstElement function.

Constraints :
1 <= N <= 10^5
1 <= element <= 10^9
Output
You don't have to output anything.
Example
Input:
5 3
1 2 3 4 5

Output:
3 2 1 4 5
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            qu.add(num);
            // System.out.print(qu.peek()+" ");
            // qu.remove();
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(qu.peek());
            qu.remove();
        }

        while(!st.isEmpty()){
            qu.add(st.peek());
            st.pop();
        }

        //1 2 3 4 5
        //3 4 5 2 1 
        //2 1 3 4 5
        for(int i=0;i<qu.size()-k;i++){
            qu.add(qu.peek());
            qu.remove();
        }

        while(!qu.isEmpty()){
            System.out.print(qu.peek()+" ");
            qu.remove();
        }
        
    }
}