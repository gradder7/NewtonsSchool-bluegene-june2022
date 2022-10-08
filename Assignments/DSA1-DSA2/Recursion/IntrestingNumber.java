/* 
 * Interesting Numbers
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bobs love interesting numbers, According to him, a number is interesting if it follows the given conditions:
The number is positive
The digits of the number when considered from left to right, they form an alternate odd even sequence. A sequence is an alternate odd even sequence when the numbers present on even indices in the sequence are odd, and the numbers present on the odd indices are even, where the sequence is having 1 based indexing.

You are given the number K.

Task
Determine the Kth smallest interesting number.

Note
Answer should not contain any leading zeros.
Input
The first line of the input contains T i.e the number of testcases.
Next T lines contains the value of K

Constraints
1 <= T <= 1e5
1 <= K <= 1e5
Output
Print the required number.
Example
Sample Input 1:
1
3

Sample Output 1:
6

Explanation
The first three interesting numbers are [2, 4, 6]. So the 3rd smallest number is 6.
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
        while(t > 0){
            int k = sc.nextInt();
            evenFlag = true;
            String number;
            if(k <= 4){
                number = ""+even[k];
            }else{
                number = finder(k);
            }
            System.out.println(number);
            t--;
        }
    }
    static boolean evenFlag;
    static int[] even = {0,2,4,6,8};
    static int[] odd =  {1,3,5,7,9};
    public static String finder(int k){
        int quo = k/even.length;
        int rem = k%even.length;
        if( quo < even.length){
        String baseCaseAns = quo == 0?
                        "" + odd[rem]:
                        "" + even[quo] + odd[rem];
            return baseCaseAns;
        }
        String recursiveAns = finder(quo);
        recursiveAns += evenFlag ?  even[rem] : odd[rem];
        // flip the flag
        evenFlag = !evenFlag;

        return recursiveAns;
    }
    
}