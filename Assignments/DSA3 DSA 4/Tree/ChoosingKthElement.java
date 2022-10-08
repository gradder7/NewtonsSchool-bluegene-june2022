/*
 * Choosing K elements
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array A of size N and an integer K. In one move, you can
 * choose any element from array and add 1 to it. Print the maximum product of
 * the array you can obtain. Print the product modulo 1e9 + 7.
 * Input
 * First line contains two integers N and K.
 * Next line contains N space separated integers denoting elements of array.
 * 
 * Constraints
 * 1 <= N, K <= 10^5
 * 1 <= Ai <= 10^5
 * Output
 * Print the maximum product you can obtain after K moves.
 * Example
 * Sample Input 1:
 * 3 3
 * 1 2 3
 * 
 * Output
 * 27
 * 
 * Explanation:
 * Add 2 to index 0 and 1 to index 1.
 * Array becomes {3, 3, 3}
 * Product = 27.
 * 
 * Sample Input 2:
 * 5 1
 * 3 6 6 9 1
 * 
 * Output
 * 1944
 * 
 * Explanation
 * Increment the element at index 4.
 * Array = {3, 6, 6, 9, 2}
 * Product = 1944
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(arr, k));
        // System.out.println(maxProduct(arr,n,k));
    }

    // 1 2
    // 1 3=3
    // 2 2=4

    // 1 2 3
    // 2 2 3 k=1
    // 3 2 3 k=2
    // 3 3 3 k=3

    // public static long maxProduct(int arr[],int n,int k){
    // for(int i=0;i<k;i++){
    // Arrays.sort(arr);
    // arr[0]+=1;
    // }
    // long prod=1;
    // for(int i=0;i<n;i++){
    // prod=(prod*arr[i])%1000000007;
    // }
    // return prod %1000000007;
    // }

    // ------------------------------------------------------------
    public static int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums)
            pq.add(num);
        while (k-- > 0) {
            int top = pq.poll() + 1;
            pq.add(top);
        }
        long res = 1;
        while (!pq.isEmpty()) {
            res = (res * pq.poll()) % 1000000007;
        }
        return (int) (res);
    }

}