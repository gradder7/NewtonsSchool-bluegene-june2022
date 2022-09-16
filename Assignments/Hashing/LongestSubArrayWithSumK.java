/* 
 * Longest Sub-Array with Sum K
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array containing N integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.
Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case contains two integers N and K and the second line contains N space-separated elements of the array.

Constraints:-
1<=T<=500
1<=N,K<=10^5
-10^5<=A[i]<=10^5

Sum of N over all test cases does not exceed 10^5
Output
For each test case, print the required length of the longest Sub-Array in a new line. If no such sub-array can be formed print 0.
Example
Sample Input:
3
6 15
10 5 2 7 1 9
6 -5
-5 8 -14 2 4 12
3 6
-1 2 3

Sample Output:
4
5
0
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    // Your code hereS
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sumSubArrayLegth(arr,n,k);
    }                 
    }
    public static void sumSubArrayLegth(int arr[],int n, int k){
        int result =0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum +=arr[i];
            if(sum==k){
                result=i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                if(result<(i-map.get(sum-k))){
                result= i-map.get(sum-k);
            }
            }
        }
        System.out.println(result);
    }
}   