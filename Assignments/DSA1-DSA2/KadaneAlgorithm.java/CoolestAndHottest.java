/* 
 * 
 * Coolest and Hottest Subarrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The coolness of the subarray of an array is the sum of elements in the subarray. The coolest subarray is the subarray having the maximum coolness, while the hottest subarray is the one having minimum coolness (obviously it can be negative). The coolest and the hottest subarrays are always non-empty.

Tono believes that cool and hot are happy together. The happiness of the array is the absolute difference between the coolness of its coolest and its hottest subarray.

Given an array A consisting of N elements, find its happiness.
Input
The first line of the input contains an integer N.
The next line contains N singly spaced integers A[1], A[2],...A[N]

Constraints
1 <= N <= 200000
-1000000000 <= A[i] <= 1000000000
Output
Output a single integer, the happiness of the array.
(The output may not fit into 32 bit integer datatype, use long long integer datatype instead).
Example
Sample Input
5
-1 2 -3 1 -5

Sample Output
9

Explanation: Coolest subarray of the array is [2], while the hottest subarray of the array is [-3, 1, -5]. The happiness of the array is 2-(-7)=9.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long coolness(long arr[]){
        long maxEnd=arr[0], max=arr[0],minEnd=arr[0],min=arr[0];
        // for(int i=1;i<n;i++){
        // maxEnd=Math.max(maxEnd+arr[i],maxEnd);
        // max=Math.max(maxEnd,max);

        // minEnd=Math.max(minEnd+arr[i],min);
        // min=Math.max(minEnd,min);
        // }

        //find cool(Max xontinious sum)
        for(int i=1;i<arr.length;i++){
            if(maxEnd>0) maxEnd +=arr[i];
            else maxEnd =arr[i];
            if(max<maxEnd) max=maxEnd;
        }

        // find negetive window(Hotness)
        for(int i=1; i<arr.length;i++){
            if(minEnd<0) minEnd += arr[i];
            else minEnd = arr[i];
            if(minEnd<min) min =minEnd;
        }
        long res = max -min;
        return res;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextLong();
        }
        System.out.print(coolness(arr));
                      
    }
}