/*
 * Median of Two sorted Arrays
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given two sorted arrays A and B of size n and m respectively, return the
 * median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n))
 * Input
 * First line of input contains n, m the length of array A and B.
 * Next two lines contains input of array A and B.
 * 
 * Constraints
 * 1 <= n, m <= 1000
 * -1e6 <= A[i], B[i] <= 1e6
 * Output
 * Print the median of two sorted arrays upto two decimal places.
 * Example
 * Sample Input :
 * 2 1
 * 1 3
 * 2
 * 
 * Sample Output :
 * 2.00
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a1 = new int[m];
        int[] a2 = new int[n];
        for (int i = 0; i < m; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.printf("%.2f", findMedianSortedArrays(a1, a2));

    }

    public static double findMedianSortedArrays(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(a2, a1);
        }
        int l = 0;
        int h = n1;
        while (l <= h) {
            int m1 = (l + h) / 2;
            int m2 = (n1 + n2 + 1) / 2 - m1;
            // [0.........m1-1 ] left of a1, [m1....... n1-1] right of a1
            // [ 0 .......m2-1] left og a2, [m2........n2-1] right of a2

            int max1 = m1 == 0 ? Integer.MIN_VALUE : a1[m1 - 1];
            int max2 = m2 == 0 ? Integer.MIN_VALUE : a2[m2 - 1];

            int min1 = m1 == n1 ? Integer.MAX_VALUE : a1[m1];
            int min2 = m2 == n2 ? Integer.MAX_VALUE : a2[m2];

            if (max1 <= min2 && max2 <= min1) {
                if ((n1 + n2) % 2 == 0) {
                    return ((double) Math.max(max1, max2) + (double) Math.min(min1, min2)) / 2;
                } else {
                    return (double) Math.max(max1, max2);
                }
            } else if (max2 > min1) {
                l = m1 + 1;
            } else {
                h = m1 - 1;
            }
        }
        return 0.00;
    }
}