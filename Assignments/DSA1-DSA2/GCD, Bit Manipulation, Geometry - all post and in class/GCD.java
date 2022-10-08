/*
 * GCD
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given 2 non-negative integers m and n, find gcd(m, n)
GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n. Both m and n fit in a 32 bit signed integer.

NOTE: DO NOT USE LIBRARY FUNCTIONS
Input
Input contains two space separated integers, m and n

Constraints:-
1 < = m, n < = 10^18
Output
Output the single integer denoting the gcd of the above integers.
Example
Sample Input:
6 9

Sample Output:
3

Sample Input:-
5 6

Sample Output:-
1
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a, b));
    }

    public static long gcd(long a, long b) {
        if (a % b == 0)
            return b;

        return gcd(b, a % b);
    }
}