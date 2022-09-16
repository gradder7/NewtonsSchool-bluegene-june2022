
/* 
 * Priyanka and Her Crush
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Khusboo found a love letter in the class that her friend Priyanka has written to her boyfriend Khusboo is a prankster, so she decides to meddle with the letter. She changes all the words in the letter
into palindromes.
To do this, she follows two rules:
1. She can only reduce the value of a letter by 1, i. e. she can changed to c, but he cannot change c to d or d to b.
2. The letter may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Help Khusboo to find minimum number of operations required to convert a given string into a palindrome.
Example
s = cde
The following two operations are performed: cde → cdd → cdc. Return 2.
string s: the text of the letter
Input
The first line contains an integer the number of queries.
The next lines will each contain a string. m

Constraints
1 < q < 10
1 < s < 104
Output
Print the no. of operations integer in one line.
Example
Sample Input
3
abc
abcd
cba
Sample Output
2
4
2
Explanation
For the first query, abc → abb → aba.
For the second query, abcba is already a palindromic string.
For the third query, abcd → abcc → abcb → abca → abba.
For the fourth query, cba → bba → aba.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String str = sc.nextLine();
            int count = 0;
            for (int i = 0; i < str.length() / 2; i++) {
                count += Math.abs(str.charAt(i) - str.charAt(str.length() - 1 - i));
            }
            System.out.println(count);
        }
    }
}