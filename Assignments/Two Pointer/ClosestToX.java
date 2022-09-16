/* 
 * Closest to x
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two arrays and an integer x. Calculate the minimum absolute difference between sum of pair of elements (one from each array) and the integer x.
Input
First line of input contains the length of the array N
Second line contains first array elements
Third line contains second array elements
Last line contains the value of x

Constraints:-
1<=N<=10000
1<=elements<=100000
1<=x<=100000
Output
Output a single line containing the minimum difference
Example
Sample Input:-
4
1 4 5 7
10 20 30 40
32

Sample Output:-
1

Explanation:
Required pair is 30,1.
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
        int arr1[]  = new int[n];
        int arr2[]  = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int result = minDiff(arr1,arr2,n,x);
        System.out.println(result);

    }  

public static int minDiff(int arr1[],int arr2[],int n,int x){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int i =0,j=n-1,minDifference=Integer.MAX_VALUE;
    while(i<n && j>=0){
        int ans = Math.abs(arr1[i]+arr2[j]-x);
        minDifference=Math.min(ans,minDifference);
        if(arr1[i]+arr2[j]<x)
        i++;
        else j--;
    }
    return minDifference;
    }      
    }