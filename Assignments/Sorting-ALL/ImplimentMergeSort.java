/* 
 * Implementing Merge Sort
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 10^4
1 <= Arr[i] <= 10^5

Sum of 'N' over all test cases does not exceed 10^6
Output
You need to return the sorted array. The driver code will print the array in sorted form.
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
public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose
      
        while(start<end){
        int mid = start+(end-start)/2;
        implementMergeSort(arr,start,mid);
        implementMergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
        return arr;
      }
      return arr;
      } 
     

    public static void merge(int arr[], int start , int mid,int end){
      int n1 = mid-start+1;
      int n2 = end-mid;
      int left[]=new int[n1];
      int right[]=new int[n2];
        for(int i =0;i<n1;i++){
            left[i]=arr[start+i];
            }
        for(int i =0;i<n2;i++){
            right[i]=arr[mid+1+i];
            }
            int i=0,j=0,k=start;
            while(i<n1 && j<n2){
              if(left[i]<right[j]){
                arr[k++]=left[i++];
              } else{
               arr[k++]=right[j++];
              }
            }
            //remaing elemnts on left
            while(i<n1){
              arr[k++]=left[i++];
            }
            while(j<n2){
              arr[k++]=right[j++];
            }
    }