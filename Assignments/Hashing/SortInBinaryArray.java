/* 
 * Sorting in Binary Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary array A[] of size N. The task is to arrange an array in increasing order.
(O(N) time complexity solution)
Input
Every test case contains two lines, first line contains an integer N (size of array) and second line contains space separated elements of array.

1 <= N <= 20
0 <= A[i] <= 1
Output
Print a single line containing space separated elements of sorted arrays.
Example
Input:
5
1 0 1 1 0

Output:
0 0 1 1 1
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
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sortBinaryArray(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
       
    }

    public static void sortBinaryArray(int a[], int n)
    {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 1) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;    q   
            }
        }
    }
}