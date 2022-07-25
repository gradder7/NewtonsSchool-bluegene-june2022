/*
 * Good Array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer array A of size N. The array is Good if the GCD (Greatest Common Divisor) of all elements of array is a multiple of 2. You need to make the array Good. You can perform only increment operations (if the array value is A[i] make it A[i]+1) on array elements. Find the minimum number of operations needed to make the array Good.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 10^5
0 <= Ai<= 10^5
Output
Print the minimum number of operations needed to make the array Good.
Example
Sample Input 1:
3
1 2 3

Output
2

Explanation:
Increment elements at index 0 and 2.
Array ={2, 2, 4}
Gcd of array is 2 which is a multiple of 2.
So, minimum moves required is 2.

Sample Input 2:
6
3 6 6 9 3 3

Output
4

Explanation
Increment elements at index 0,3,4,5
Array ={4, 6, 6, 10, 4, 4}
GCD of array is 2. So, minimum operations needed are four.
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(goodArray(arr));
    }

    public static int goodArray(int[] arr) {
        int min_operation = 0;
        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] > 2) {
                min_operation += arr[i] % 2;
            } else {
                min_operation += 2 - arr[i];
            }
        }
        return min_operation;
    }
}