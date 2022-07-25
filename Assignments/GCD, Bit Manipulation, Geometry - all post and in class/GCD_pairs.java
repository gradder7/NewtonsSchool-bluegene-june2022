/*
 * GCD Pairs (Contest)
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N elements. Find the maximum value of GCD(Arr[i], Arr[j]) where i != j.
Input
First line of input contains a single integer N.
Second line of input contains N space separated integers, denoting array Arr.

Constraints:
2 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print the maximum value of GCD(Arr[i], Arr[j]) where i != j.
Example
Sample Input 1
5
2 4 5 2 2

Sample Output 1
2

Explanation: We can select index 1 and index 4, GCD(2, 2) = 2

Sample Input 2
6
4 3 4 1 6 5

Sample Output 2
4
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
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println(findGCD(myArray, n));
    }

    public static int findGCD(int[] arr, int n) {
        int high = 0;
        for (int i = 0; i < n; i++)
            high = Math.max(high, arr[i]);

        // Array to store the count of divisors
        // i.e. Potential GCDs
        int divisors[] = new int[high + 1];

        // Iterating over every element
        for (int i = 0; i < n; i++) {
            // Calculating all the divisors
            for (int j = 1; j <= Math.sqrt(arr[i]); j++) {
                // Divisor found
                if (arr[i] % j == 0) {
                    // Incrementing count for divisor
                    divisors[j]++;

                    // Element/divisor is also a divisor
                    // Checking if both divisors are
                    // not same
                    if (j != arr[i] / j)
                        divisors[arr[i] / j]++;
                }
            }
        }
        for (int i = high; i >= 1; i--)

            // If this divisor can divide at least 2
            // numbers, it is a GCD of at least 1 pair
            if (divisors[i] > 1)
                return i;
        return 1;

    }
}