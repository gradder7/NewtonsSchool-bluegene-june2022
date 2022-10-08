/* 
 * MinMax
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer array of size N and an integer K.
Find out whether there exist an array pref of size X (X>0 and X < K) which is a prefix of arr and an array suf of size (K- X) which is a suffix of arr such that the following condition is true.

min(pref) = max(suf)

Note: min(arr) denotes minimum in the array arr. Similarly, max(arr) denotes maximum in arr.
Input
First line contains N and K.
Next line contains N integers denoting the array arr.

Constraints :
2 <= K <= N <= 10^5
1 <= arr[i] <= 10^9
Output
Print YES if there exists required arrays, otherwise NO.
Example
Input:
6 4
2 3 4 6 2 1

Output:
YES

Explanation:
pref = [ 2, 3] => min(pref) = 2
suf = [ 2, 1] => max(suf) = 2
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
        int k= sc.nextInt();
        long[] arr= new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        int i=0;
        int p= (int)Math.ceil(k/2.0);
        int j=(n-p);
        long pref =arr[i];
        long suf=arr[j];
        while(i<p && j<n){
            pref =Math.min(pref,arr[i]);
            suf=Math.max(suf,arr[j]);
            i++;
            j++;
        }
        if((pref!=suf)){
            System.out.println("NO");
        } else
        System.out.println("YES");
    }
}