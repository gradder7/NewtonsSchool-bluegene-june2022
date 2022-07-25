/*
 * Nth number made of prime digits
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number 'N'. The task is to find the Nth number whose each digit is a prime number(<10) i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
Input
The first line contains a single integer T i.e. the number of test cases. The first and only line of each test case consists of a single integer N.

Constraints:
1 <= T <= 100
1 <= N <= 100000
Output
For each testcase print the nth number of the given sequence made of prime digits in a new line.
Example
Input:
2
10
21

Output:
33
222

Explanation:
Testcase 1: 10th number in the sequence of numbers whose each digit is prime is 33.
Testcase 2: 21th number in the sequence of numbers whose each digit is prime is 222.
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(chkPrime(n));

        }
    }

    public static String chkPrime(int n) {
        int rem;
        String num = "";
        while (n > 0) {
            rem = n % 4;
            switch (rem) {
                case 1:
                    num += '2';
                    break;

                case 2:
                    num += '3';
                    break;

                case 3:
                    num += '5';
                    break;

                case 0:
                    num += '7';
                    break;
            }
            if (n % 4 == 0) {
                n--;
            }
            n = n / 4;
        }
        return new StringBuilder(num).reverse().toString();
    }
}