/* 
 * Implementing Quick Sort
easy
Problem Statement
Given an array A[] having N positive integers. You need to arrange these elements in increasing order using Quick Sort algorithm.
Input
User Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function quickSort() which contains following arguments.

A[]: input array
start: starting index of array
end: ending index of array

Constraints
1 <= T <= 1000
1 <= N <= 10^4
1 <= A[i] <= 10^5

Sum of "N" over all testcases does not exceed 10^5
Output
For each testcase you need to return the sorted array. The driver code will do the rest.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
 */
/*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
public static int[] quickSort(int arr[], int start, int end)
{
       // Your code here
      // You can create your own helper function
      while(start<end){
      int pivot = partision(arr,start,end);
      quickSort(arr,start,pivot-1);
      quickSort(arr,pivot+1,end);
      return arr;
      }
      return arr;
}
 public static int partision(int [] arr, int low, int high){
       int pivot1 = arr[high];
       int i=low;

       for(int j=low;j<high;j++){
             if(arr[j]<pivot){
                   int temp= arr[i];
                   arr[i] = arr[j];
                   arr[j]= temp;
                   i++;
             }
       }
          int temp= arr[i];
          arr[i] = arr[high];
          arr[high]= temp;
          return i;
 }