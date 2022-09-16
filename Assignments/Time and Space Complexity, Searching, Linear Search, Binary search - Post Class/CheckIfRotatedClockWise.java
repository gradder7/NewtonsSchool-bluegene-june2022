/*
 * Check if array is sorted and rotated clockwise
 * easy
 * hint
 * Hint
 * 
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array arr[] of N distinct integers, check if this array is Sorted
 * and Rotated clockwise.
 * A sorted array is not considered as sorted and rotated, i.e., there should be
 * at least one rotation.
 * 
 * Note:-Array can be sorted both increasingly and decreasingly
 * Input
 * The first line of input contains number of testcases T. Each testcase
 * contains 2 lines, the first line contains N, the number of elements in array,
 * and second line contains N space separated elements of array.
 * 
 * Constraints:
 * 1 <= T <= 50
 * 3 <= N <= 10^3
 * 1 <= A[i] <= 10^4
 * 
 * 
 * 
 * Output
 * Print "Yes" if the given array is sorted and rotated, else Print "No",
 * without Inverted commas.
 * Example
 * Sample Input:
 * 2
 * 4
 * 3 4 1 2
 * 3
 * 1 3 2
 * 
 * Sample Output:
 * Yes
 * Yes
 * 
 * Explanation:
 * Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
 * Testcase 2: The array is sorted (3, 2, 1) and rotated once (1, 3, 2).
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            boolean x = checkIfSortedRotated(arr, n);
            if (x == true)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }

    public static boolean checkIfSortedRotated(int[] arr, int n) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1])
                x++;
            else
                y++;
        }
        if (x == 1 || y == 1) {
            if (arr[n - 1] < arr[0])
                x++;
            else
                y++;
            if (x == 1 || y == 1)
                return true;
        }
        return false;
    }
}