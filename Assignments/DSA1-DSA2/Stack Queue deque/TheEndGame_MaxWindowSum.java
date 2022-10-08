/* 
 * The EndGame : Maximum Sliding Window
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. You have to print the maximum in every K-sized subarray from the left to the right in the array A.
More formally, you have to print N - K + 1 integers X1, X2, ..., XN-K+1 such that Xi (1 <= i <= N - K + 1) is the maximum element in the subarray Ai, Ai+1, ..., Ai+K-1.
Input
1. The first line contains an integer N, denoting the size of the array.
2. The second line has N space- separated integers of the array A.
3. The third line contains integer K, denoting the size of the sliding window

Constraints :
1 <= N <= 10^5
10^-4 <= A[i] <= 10^4
1 <= K <= N
Output
Print the max of K numbers for each position of sliding window
Example
Sample Input:-
8
1 3 -1 -3 5 3 6 7
3

Sample Output:-
3 3 5 5 6 7

Explanation:-
Window position Max
- - - -
[1 3 -1] -3 5 3 6 7 3
1 [3 -1 -3] 5 3 6 7 3
1 3 [-1 -3 5] 3 6 7 5
1 3 -1 [-3 5 3] 6 7 5
1 3 -1 -3 [5 3 6] 7 6
1 3 -1 -3 5 [3 6 7] 7

Sample Input:-
1
1
1

Sample Output:-
1
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
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();        
        }
        int k = sc.nextInt();
        maxSlidingMax(arr,n,k);
    }
    public static void maxSlidingMax(int [] arr,int n,int k){
        //store the index of greater elements.
        Deque<Integer> dq = new LinkedList<Integer>();

        //for first set of k elements
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            //add elements in last
            dq.addLast(i);
        }

        for(int i=k;i<n;i++){
            //print the first element beacuse first is always greater
            System.out.print(arr[dq.peekFirst()]+" ");
            //remove out of bound elemnts
            while(!dq.isEmpty() && dq.peekFirst()<=(i-k)){
                dq.removeFirst();
            }
           // remove smaller in the left of dequeue
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peekFirst()]);
        }
 }