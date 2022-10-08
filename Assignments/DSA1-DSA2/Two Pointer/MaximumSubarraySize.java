/* 
 * Max subarray sum (size K)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers A and a number K, find maximum sum of a subarray of size K.
Input
The first line of input contains two integers N and K, denoting the number of elements in the array and the subarray size respectively.
The next line contains N integers denoting the elements of the array respectively.

1 <= K <= N <= 200000
-200000 <= A[i] <= 200000
Output
Print a single integer denoting the maximum sum of subarray of size K.
Example
Sample Input:
4 2
-1 5 2 -3

Sample Output:
7

Explanation:
Three subarrays of size 2, their sum are 4, 7, -1
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
    int k =sc.nextInt();                      
    int arr1[]  = new int[n];
    for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    System.out.println(maxSumCalc(arr1,k));
}
public static int maxSumCalc(int arr1[],int k){
    int sum =0;
    for(int i=0;i<k;i++){
        sum +=arr1[i];
    }
    int maxSum=sum;
    int startIdx=0;
    for(int i =k;i<arr1.length;i++){
        maxSum+= arr1[i]-arr1[startIdx++];  //arr1[i-k];
        sum =Math.max(sum,maxSum);
    }
    return sum;
}
}