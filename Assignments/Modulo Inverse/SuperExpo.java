/* 
 * Super-Exponentation
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Modulo exponentiation is super awesome. But can you still think of a solution to the following problem?
Given three integers {a, b, c}, find the value of abc % 1000000007.
Here ab means a raised to the power b or pow(a, b). Expression evaluates to pow(a, pow(b, c)) % 1000000007.

(Read Euler's Theorem before solving this problem)
Input
The first input line has an integer t: the number of test cases.
After this, there are n lines, each containing three integers a, b and c.


Constraints
1≤ t ≤ 100
0 ≤ a, b, c ≤ 1000000000
Output
For each test case, output the value corresponding to the expression.
Example
Sample Input
3
3 7 1
15 2 2
3 4 5

Sample Output
2187
50625
763327764

Explaination:
In the first test, a = 3, b = 7, c = 1
bc = 71 = 7
abc = 37 = 2187
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            int m =1000000007;
            System.out.println(modCaclPower(a,b,c,m));
        }
    }
    //ferments little formula- A ^ (B ^ C) % M = (A ^ y ) %  M 
    // y= b^c %m-1;
    // ans = a^y %m;
    public static long powerModule(long x, long y, long m){
        long result=1;
         x= x%m;
        while(y>0){
            if(y%2==1){
                result = (result*x)%m;
            }
            x=(x*x)%m;
            y=y/2;
        }
        return result;
    }
    public static long modCaclPower(long a,long b,long c,long m){
        long result = powerModule(b,c,m-1);
        long ans = powerModule(a,result,m);
        return ans;
    }
}