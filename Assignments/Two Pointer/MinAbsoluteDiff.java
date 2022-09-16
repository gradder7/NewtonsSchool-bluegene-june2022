/* 
 * Minimum Absolute Difference
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
you have given two integer arrays A and B of length N sorted in non-decreasing order. Calculate the minimum possible difference between elements of A and B.
Solve this problem in O(N) complexity.
Input
first- line contains a single integer N
second and third lines contain N space- separated integer A[i] and B[i].
Output
Print the minimum absolute difference between two elements from A and B.
Example
Sample Input:
6
12 15 16 19 21 29
1 2 3 58 61 65

Sample Output:
9

Explanation : minimum absolute difference can be found between first element of first array and third element of second array.
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n =sc.nextInt();
                      int arr1[]  = new int[n];
                      int arr2[]  = new int[n];
                      for(int i=0;i<n;i++){
                          arr1[i]=sc.nextInt();
                      }

                      for(int i=0;i<n;i++){
                          arr2[i]=sc.nextInt();
                      }

                      int i=0,j=0;
                      int minDiff=Integer.MAX_VALUE;
                      while(i<n && j<n){
                        minDiff =Math.min(minDiff,Math.abs(arr1[i]-arr2[j]));
                         if(arr1[i]<arr2[j])
                         i++;
                         else
                         j++;
                      }
                      System.out.println(minDiff);
    }
}