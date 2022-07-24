/*
 * Flowers (Contest)
 * 
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The flower shop near his house sells flowers of N types. It is found that the store has Ai flowers of the i-th type. We like odd numbers. Therefore, we have decided that there should be an odd number of flowers of each type in the bouquet, and the total number of flowers in the bouquet should also be odd.
Determine the maximum number of flowers the bouquet can consist of.
Input
The first line contains an integer N — the number of types of flowers that are sold in the store
The second line contains N integers— the number of flowers of each type

1 <= N <= 100000
1 <= Ai <= 1000
Output
Print one number — the maximum number of flowers the bouquet can consist of.
Example
Sample input
3
3 5 8

Sample output
15

Sample input
3
1 1 1

Sample output
3

//@Himanshu Mehra
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int arr[]= new int[n];
                      int sum =0;
                      int min=Integer.MAX_VALUE;;
                      for(int i=0;i<n;i++){
                          arr[i]= sc.nextInt();
                      }
                       for(int i=0;i<n;i++){
                          if(arr[i]%2==0){
                                arr[i]=arr[i]-1;
                          }
                          sum = sum+arr[i];
                      }
                    
                      for(int i=0;i<n;i++){
                          if(arr[i]<min){
                                min=arr[i];
                          }
                      }
                      if(n%2==0)
                      System.out.println(sum-min);
                      else
                      System.out.println(sum);
                      
    }
}