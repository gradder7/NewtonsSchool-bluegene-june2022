/* 
 * Find a pair with the given sum in an array
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted integer array having distinct integers, find a pair with the given sum in it.
First element of pair > second element of pair
Input
First line of input contains a single integer N, next line contains N space separated integers depicting the values of array and third line consist target sum.

Constraints:
2<=N<=5*(10^5)
1<=A[i], target<=2*(10^9)
Target
Output
Print the pair of integers which sum is target.
Example
Sample Input1:-
6
8 7 4 5 3 1
10

Sample Output:-
Pair found (7, 3)


Sample Input2:
6
5 2 6 8 1 9
12

Sample Output:
Pair not found
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int target =sc.nextInt();
        checkPairsum(arr,n,target);
    }
    public static void quick(int arr[],int l,int h){
        if(l<h){
            int pivot= partition(arr,l,h);
            quick(arr, l, pivot-1);
            quick(arr, pivot+1, h);
        }
    }
    public static int partition(int arr[],int l, int h) {
        int pivot = arr[h];
        int i = l;

        for (int j = l; j < h; j++) 
            if(arr[j]<pivot){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
            }
        int temp = arr[i];
        arr[i]= arr[h];
        arr[h]= temp;
        return i; 
    }
public static void checkPairsum(int arr[], int n,int target){
quick(arr,0,n-1);
//for(int i=0;i<n;i++)
    //System.out.println(arr[i]+" ");
    int sum =0;
    int i=0;
    int j=n-1;
    while(i<j){
    sum=arr[j]+arr[i];
    if(sum==target){
        System.out.print("Pair found "+"("+Math.max(arr[i],arr[j])+", "+Math.min(arr[i],arr[j])+")");
        return;
    }
    else if (sum<target)
    i++;
    else 
    j--;
    }
    System.out.println("Pair not found");
    }
    }