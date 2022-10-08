/*
 * AND OR Operation
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given the following pseudocode:

code :
res = a
for i = 1 to k
if i is odd
res = res & b
else
res = res | b

You are also given the values of a, b and k. Find the value of res.
Input
First line contains of single integer t denoting number of test cases.
Each test cases consists of 3 lines where each line consists of a single integer denoting the values of a, b and k respectively.

Constraints
1<= T <= 1e5
1<= a, b, k <= 1e18
Output
Print the final value of res for each test case in a new line
Example
Sample Input :
1
4 5 1

Sample Output :
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
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            long res = a;
            for (int i = 1; i <= k; i++) {
                if (i % 2 != 0) { // (i|1)<=i greater than smaller or equal to i so odd
                    res = res & b;
                    // System.out.println(res);
                } else {
                    res = res | b;
                    // System.out.println(res);
                }
            }
            System.out.println(res);
        }
    }
}