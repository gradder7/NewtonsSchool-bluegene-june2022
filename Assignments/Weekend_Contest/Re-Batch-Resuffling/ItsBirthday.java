/* 
 * It's Birthday
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has a string S of lowercase alphabets of size N. He want to gift this string to Alice since today is her birthday. But Alice will accept the string only when its length is N - K. So Bob will delete K characters from the string. Bob want to gift the largest string obtained in Dictionary order to Alice. Find that string.
In other terms, find the largest string in dictionary order that can be obtained by deleting K characters from S. Given that K < |S|.
Input
First line contains an integer N - the length of string
The next line contains a string S
The last line contains an integer K denoting the number of characters to be removed.

Constraints
1<= N <= 10000
0<= K < N
Output
Print a single line containing a string after deleting k characters and fulfilling above conditions.
Example
Sample Input 1:
10
helloworld
3

Output
loworld

Explanation:
Deleting the character 'h', 'e', 'l' gives us the largest possible string.

Sample Input 2:
5
india
4

Output
n

Explanation:
Deleting the character 'i', 'd', 'i', 'a' gives us the largest possible string.
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int k=sc.nextInt();
        System.out.println(largestAfterk(str,k,n));
    }

    public static String largestAfterk(String str,int k,int n){
    String result="";
    for(char i:str.toCharArray()){
        while(result.length()>0 && result.charAt(result.length()-1)<i && k>0){
            result=result.substring(0,result.length()-1);
            k--;
        }
        result+=i;
    }
    while(result.length()>0 && k>0){
        result=result.substring(0,result.length()-1);
        k--;
    }
    return result;

    }
}