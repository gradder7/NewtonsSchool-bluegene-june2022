/* 
 * Sort by Absolute Difference
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements and a number K. The task is to arrange array elements according to the absolute difference with K, i. e., element having minimum difference comes first and so on.


Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.
Input
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of test case contains two space separated integers N and K. Second line of each test case contains N space separated integers.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= K <= 10^4
1 <= A[i] <= 10^4

Sum of N over all test cases does not exceed 2*10^5
Output
For each test case print the given array in the order as described above.
Example
Input:
3
5 7
10 5 3 9 2
5 6
1 2 3 4 5
4 5
2 6 8 3

Output:
5 9 10 3 2
5 4 3 2 1
6 3 2 8

Explanation:
Testcase 1: Sorting the numbers accoding to the absolute difference with 7, we have array elements as 5, 9, 10, 3, 2.
Testcase 2: Sorting the numbers according to the absolute difference with 6, we have array elements as 5 4 3 2 1.
Testcase 3: Sorting the numbers according to the absolute difference with 5, we have array elements as 6 3 2 8.
 */
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

        // don't change the name of this class
        // you can add inner classes if needed
        class Main {
        public static void main (String[] args) {
                            // Your code here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sort(arr,0,n-1,k);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            }
        }

        public static void merge(int arr[], int l , int mid,int h,int x){
            int n1=mid-l+1;
            int n2 = h-mid;
            int left[]=new int[n1];
            int right[]=new int[n2];
            for(int i =0;i<n1;i++){
                left[i]=arr[l+i];
            }
            for(int i =0;i<n2;i++){
                right[i]=arr[mid+1+i];
            }
            int i=0,j=0,k=l;

            while(i<n1 && j<n2){
                if(Math.abs(left[i] - x)<=Math.abs(right[j] - x)){
                    arr[k++] = left[i++];
                } else{
                    arr[k++] = right[j++];
                }
     
            }
            while(i<n1){
                    arr[k++] = left[i++];
            }
            while(j<n2){
                    arr[k++] = right[j++];
            }

        }
        public static void sort(int arr[], int l,int h,int k){
            if(l<h){
            int mid = l+(h-l)/2;
            sort(arr,l,mid,k);
            sort(arr,mid+1,h,k);
            merge(arr,l,mid,h,k);
            }
        }
        }