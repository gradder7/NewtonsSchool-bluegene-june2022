/*
 * Clean the room
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Nishu is trying to clean a room, which is divided up into an N by N grid of squares. Each square is initially either clean or dirty. She can sweep her broom over columns of the grid. Her broom is very strange:
if she sweeps over a clean square, it will become dirty, and if she sweeps over a dirty square, it will become clean.
She wants to sweep some columns of the room to maximize the number of completely clean rows. It is not allowed to sweep over the part of the column, Nishu can only sweep the whole column.

Return the maximum number of rows that she can make completely clean.
Input
The first line of the input contains a single integer N.
The next N lines will describe the state of the room. The i- th line will contain a binary string with N characters denoting the state of the i-th row of the room. The j- th character on this line is '1' if the j- th square in the i-th row is clean, and '0' if it is dirty.

Constraints:
1<=N<=100
Output
The output should be a single line containing an integer equal to a maximum possible number of rows that are completely clean.
Example
Sample Input 1:
4
0101
1000
1111
0101

Sample output 1:
2

Explanations:
Nishu can sweep the 1st and 3rd columns. This will make the 1st and 4th row be completely clean.
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

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();// nextLine not because
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            result = (Math.max(result, count));
        }
        System.out.println(result);

    }
}