/* 
 * Array generator
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have an array A of N+1 integers where the first element is always zero. You passed this array to a generator function. This generator generates an array B of N elements where B[i]=A[i+1]-A[i].
You are given the array B. Generate the array A of N+1 elements.
Note: A[0] is always equal to 0. You need to print all N+1 elements of A.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array B.

Constraints
1 <= N <= 10^5
-10^5 <= Bi <= 10^5
Output
Print N+1 space separated integers denoting elements of array A. A[0] should be equal to 0.
Example
Sample Input 1:
5
-5 1 5 0 -7

Output
0 -5 -4 1 1 -6

Explanation:
A = {0, -5, -4, 1, 1, -6}
A[1] - A[0] = -5
A[2] - A[1] = 1
A[3] - A[2] = 5
A[4] - A[3] = 0
A[5] - A[4] = -7
So, we generated array B using this array A.

Sample Input 2:
7
-4 -3 -2 -1 4 3 2

Output
0 -4 -7 -9 -10 -6 -3 -1

Explanation:
A= {0, -4, -7, -9, -10, -6, -3, -1}
A[1] - A[0] = -4
A[2] - A[1] = -3
A[3] - A[2] = -2
A[4] - A[3] = -1
A[5] - A[4] = 4
A[6] - A[5] = 3
A[7] - A[6] = 2
So, we generated array B using this array A.

 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int[] B = new int[n];
        for(int i=0;i<n;i++)
        B[i] = s.nextInt();

        int[] A = new int[n+1];  
        arrayGenerator(B,n,A);
        for(int i=0;i<n+1;i++){
            System.out.print(A[i] + " ");
        }          
    }
    public static void arrayGenerator(int[] B, int n, int[] A){
        int sum = 0;
        A[0] = 0;
        int i = 0;
        int k = A[0];
        while(i<n){
            sum += B[i];
            A[k+1] = sum;
            k++;
            i++; 
        }
        
    }
}