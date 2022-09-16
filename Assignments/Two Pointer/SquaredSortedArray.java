/* 
 * Print Squared Sorted Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an sorted array Arr[] of size N, containing both negative and positive integers, you need to print the squared sorted output.

Note Try using two pointer approach
Input
The first line of input contains T, denoting the number of test cases. Each testcase contains 2 lines. The first line contains N size of array. Second line contains elements of array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10000
-10000 <= A[i] <= 10000

Sum of N over all testcases does not exceed 10^6
Output
For each test case you need to print the sorted squared output in new line
Example
Input:
1
5
-7 -2 3 4 6

Output:
4 9 16 36 49
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
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                arr[i]= arr[i]*arr[i];
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}