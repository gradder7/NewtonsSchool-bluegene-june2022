/* 
 * Inversion count
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Calculate inversion count of array of integers.
Inversion count of an array is quantisation of how much unsorted an array is. A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].
Input
The first line contain integers N.
The second line of the input contains N singly spaces integers.

1 <= N <= 100000
1 <= A[i] <= 1000000000
Output
Output one integer the inversion count.
Example
Sample Input
5
1 1 3 2 2

Sample Output
2

Sample Input
5
5 4 3 2 1

Sample Output
10
 */
import java.util.*;
class Main{
public static long merge(int[] arr, int[] aux, int low, int mid, int high){
        int k = low, i = low, j = mid +1;
        long inversionCount = 0;
        while (i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                aux[k++] = arr[i++];
            }
            else{
                aux[k++] = arr[j++];
                inversionCount += (mid - i + 1);
            }
        }
        while (i <= mid){
            aux[k++] = arr[i++];
        }
        for (i = low; i <= high; i++){
            arr[i] = aux[i];
        }
        return inversionCount;
    }
    public static long mergeSort(int[] arr, int[] aux, int low, int high){
        if (high <= low){
            return 0;
        }
        int mid = (low + (high - low)/ 2);
        long inversionCount = 0;
        inversionCount += mergeSort(arr, aux, low, mid);
        inversionCount += mergeSort(arr, aux, mid +1, high);
        inversionCount += merge(arr, aux, low, mid, high);
        return inversionCount;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = inputTaker.nextInt();
        }
        int[] aux = Arrays.copyOf(arr, arr.length);
        System.out.println(mergeSort(arr, aux, 0, arr.length-1));
    }
}