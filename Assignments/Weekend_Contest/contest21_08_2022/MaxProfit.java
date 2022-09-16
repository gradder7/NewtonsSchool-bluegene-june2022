/* 
 * Max Profit
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The cost of stock on each day is given in an array A[] of size N. If you can only perform at most two transactions what is the maximum profit you can gain.

Note:- The second transaction can only start after the first one is complete (Sell- >buy- >sell- >buy).
Input
The first line of input contains a single integer N. The next line of input contains N space-separated integers depicting the values of A[].

Constraints:-
2 <= N <= 10000
1 <= A[i] <= 1000000000
Output
Print the maximum profit gain in at most two transactions.
Example
Sample Input:-
5
3 5 2 8 3

Sample Output:-
8

Explanation:-
Buy at index 1, sell at index 2, Buy at index 3, sell at index 8.

Sample Input:-
4
1 2 4 5

Sample Output:-
4
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxTwoBuySell(arr,n));

    }
    public static int maxTwoBuySell(int arr[], int n){
        int first_buy = Integer.MIN_VALUE;
        int first_sell = 0;
        int second_buy = Integer.MIN_VALUE;
        int second_sell = 0;
        for(int i = 0; i<n; i++){
            first_buy = Math.max(first_buy,-arr[i]);
            first_sell = Math.max(first_sell, first_buy+arr[i]);
            second_buy = Math.max(second_buy,first_sell - arr[i]);
            second_sell = Math.max(second_sell,second_buy+arr[i]);
        }

return second_sell;
    }
}