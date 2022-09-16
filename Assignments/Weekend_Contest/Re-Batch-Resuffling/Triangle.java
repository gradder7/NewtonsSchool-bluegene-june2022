/* 
 * Triangles
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom has N sticks that are distinguishable from each other. The length of the i-th stick is L[i]. He is going to form a triangle using three of these sticks. Let a, b, and c be the lengths of the three sticks used. Here, all of the following conditions must be satisfied:

a < b+c
b < c+a
c < a+b

How many different triangles can be formed? Two triangles are considered different when there is a stick used in only one of them.
Input
The first line of input contains the number of sticks N, the next line contain N space separated integer where the ith integer shows the length of ith stick.

Constraints:-
3 ≤ N ≤ 1000
1 ≤ L[i] ≤ 1000
Output
Print the number of different triangles that can be formed.
Example
Sample Input 1
4
3 4 2 1

Sample Output 1
1

Sample Input 2
3
1 1000 1

Sample Output 2
0

Explanation:
Fortestcase1 the only triangle that can be formed is 2 3 4
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
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countTriangle(arr,n));

    }

    public static int countTriangle(int []arr,int n){
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<n-2;i++){
            int k=i+2;
            for(int j=i+1;j<n;j++){
                while(k<n && (arr[i]+arr[j])>arr[k]){
                    k++;
                }
                if(k>j){
                    count+=k-j-1;
                }
            }
        }
        return count;
    }
}