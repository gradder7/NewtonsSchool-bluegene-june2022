package Assignments.Weekend_Contest.contest07_08_2022;
/* 
 * Pair sum (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr, of N integers find the sum of max(A[i], A[j]) for all i, j such that i < j.
Input
The first line of the input contains an integer N, the size of the array.
The second line of the input contains N integers, the elements of the array Arr.

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000000
Output
Print a single integer which is the sum of min(A[i], A[j]) for all i, j such that i < j.
Example
Sample Input
4
5 3 3 1

Sample Output
24

Explanation: max(5,3) + max(5,3) + max(5,1) + max(3,3) + max(3,1) + max(3,1) = 24

Sample Input
2
1 10

Sample Output
10
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
                      long arr[]= new long[n];
                      for(int i=0;i<n;i++){
                          arr[i]=sc.nextLong();
                      }
                      pairSum(arr);
                         }

public static void pairSum(long arr[]){
    long sum =0;
    Arrays.sort(arr);
    for(int i=arr.length-1;i>0;i--){
       int a =i;
       sum+=arr[i]*i;
}
    System.out.println(sum);
}
}