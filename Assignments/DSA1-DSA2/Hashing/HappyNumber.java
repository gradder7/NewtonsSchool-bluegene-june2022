/* 
 * Happy Number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
Input
The first line of the input contains the number n.

Constraints
1 <= n <= 231-1
Output
Print true if it's a happy number otherwise false.
Example
Sample Input
19

Sample Output
true

Explanation
12 + 92 = 82
8 2 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n=sc.nextInt();
                     System.out.println(isHappy(n));
    }
    public static Boolean isHappy(int n){
        HashMap<Integer,Boolean>map = new HashMap<>();
        while(n!=1 && !map.containsKey(n)){
            map.put(n,true);
            n=getDigitSqSum(n);
        }
        if(n==1)
        return true;
        return false;
    }

    public static int getDigitSqSum(int n){
        int sum =0;
        while(n>0){
            int r = n%10;
            n=n/10;
            sum+=r*r;
        }
        return sum;
    } 
}