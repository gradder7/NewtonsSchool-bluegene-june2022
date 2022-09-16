/* 
 * Number of Recent Calls
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer Q representing the number of queries. Each query contains an integer t representing the time (in milliseconds) at which a request was made to server. For each query, print the number of requests made in the last 3000 milliseconds. Specifically, print the number of requests that have happened in the range [t - 3000, t].
Input
First line contain an integer Q.
Next line contains Q space separated integers representing the time at which a request was made.

Constraints
1 <= Q <= 10^5
1 <= t <= 2 * 10^9
It is guaranteed that every request to server uses a strictly larger value of t than the previous call.
Output
Print Q integers, each representing the number of requests made in the last 3000 milliseconds.

Sample Input 1:
4
1 100 3001 3002

Output
1 2 3 3

Explanation:
[-2999,1] -> 1 request
[-2900,100] -> 2 request
[1,3001] -> 3 request
[2,3002] -> 3 request

Sample Input 2:
2
3000 7000

Output
1 1

Explanation
[0,3000] -> 1 request
[4000,7000] -> 1 request
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

        //Using deque
        Deque<Integer> dq = new LinkedList<>();
         for(int i=0;i<n;i++){
            int t = sc.nextInt();
            dq.offerLast(t); //addLast();
            while(dq.peekFirst()<(t-3000)){
                dq.removeFirst();// pollFirst();
            }

            //using queue
        // Queue<Integer> qu =new LinkedList<>();
        // for(int i=0;i<n;i++){
        //     int t = sc.nextInt();
        //     qu.add(t);

        //     while(qu.peek()<(t-3000)){
        //     qu.remove();
            
        // }
        System.out.print(dq.size()+" ");
        }
        
    }
}