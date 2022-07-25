/*
 * 
 * Divisibility Test
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a big number in form of a string A of characters from 0 to 9.
Return 1 if it's divisible by 30 and 0 otherwise.
Input
The first argument is the string A.
Output
Return 1 if it is divisible by 30 and 0 otherwise.
Note It's a functional Problem you just have to return 0 or 1.
Example
Sample Input :
3033330

Sample Output:
Yes
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.endsWith("0")) {
            char[] ch = str.toCharArray();// to convert to char toCharArray
            int sum = 0;
            for (int i = 0; i < ch.length; i++) {
                char chdigit = ch[i];
                sum += (chdigit - '0');
            }
            if (sum % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }
}