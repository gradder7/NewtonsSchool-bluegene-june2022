/* 
 * Ying Yang Festival
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
New Year festival of Ying Yang is approaching. There are N spaces available for stalls to be put up. The ith stall's price is pi. You have X amount of money with you right now and you want to buy atleast 2 stalls from this money. Find whether it is possible. Print "YES" if it is possible, else print "NO", without the quotes.
Input
First line of the input contains two integers N, the number of stall spaces and X, the amount of money you have.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= X <= 109
1 <= pi <= 109
Output
Print "YES" if it is possible for you to buy atleast two spaces in the festival, else print "NO", without the quotes.
Example
Sample Input:
5 10
3 6 5 8 11

Sample Input:
YES

Explaination:
You can buy stall no. s 1 and 2 (1- based indexing) to bring the total amount to 3 + 6 = 9, which is less than 10.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int x = sc.nextInt();
                      int arr[]=new int[n];
                      for(int i=0;i<n;i++){
                          arr[i]= sc.nextInt();
                      }

                Arrays.sort(arr);
                if(arr[0]+arr[1]<=x){
                    System.out.println("YES");
                }
                else
                System.out.println("NO");
    }
}