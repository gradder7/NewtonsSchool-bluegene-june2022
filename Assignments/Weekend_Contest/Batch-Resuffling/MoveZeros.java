/* 
 * Move Zeros
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[] of size N containing non-negative integers. You have to move all 0's to the end of array while maintaining the relative order of the non-zero elements.

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Input
The first line of input line contains T, denoting the number of testcases. Each test cases contains 2 lines. First-line contains N, size of array. Second-line contains elements of array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^5

Sum of N over all testcases does not exceed 10^6
Output
For each testcase you need to print the updated array.
Example
Sample Input:
2
5
0 1 0 3 12
8
0 0 0 0 1 2 3 4

Sample Output:
1 3 12 0 0
1 2 3 4 0 0 0 0
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            placeZerosToEnd(arr,n);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
 }
  public static void placeZerosToEnd(int[] arr,int n){
      int c=0;
      for(int i=0;i<n;i++){
          if(arr[i]!=0){
              arr[c++]=arr[i];
          }
      }
      while(c<n){
          arr[c++]=0;
      }
  }
}