/* 
 * Merge array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two sorted array your task is to merge these two arrays into a single array such that the merged array is also sorted
Input
First line contain two integers N and M the size of arrays
Second line contains N separated integers the elements of first array
Third line contains M separated integers elements of second array

Constraints:-
1<=N,M<=10000
1<=arr1[], arr2[] <=100000
Output
Output the merged array
Example
Sample Input:-
3 4
1 4 7
1 3 3 9

Sample Output:-
1 1 3 3 4 7 9
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int arr1[]  = new int[n];
    int arr2[]  = new int[m];
    int arr3[] = new int[arr1.length+arr2.length];
    
    for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }

    for(int i=0;i<m;i++){
        arr2[i]=sc.nextInt();
    }
    //calling and printing.
    merge(arr1,arr2,arr3);
    for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i]+" ");
    }
    }
    public static void merge(int[]arr1,int arr2[],int arr3[]){
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
            arr3[k++]=arr1[i++];
            else
            arr3[k++]=arr2[j++];
        }
        //remanning of arr1
        while(i<arr1.length)
        arr3[k++]= arr1[i++];
        // remanning of arr2
        while(j<arr2.length)
        arr3[k++] = arr2[j++];
    }
}