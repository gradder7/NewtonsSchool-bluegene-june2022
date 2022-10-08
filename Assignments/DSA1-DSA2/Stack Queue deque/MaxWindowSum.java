/* 
 * Max Widow Sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of integers arr of size n, a window of size k. Your task is to find the sum of the maximum element from each window.
Input
The first line contains the input of n, k ie the size of array and the size of the window.
Next line contains the input of the array.

Constraints
1 <= k < n <= 1e5
1 <= arr[i] <= 1e5
Output
Print the single line containing the maximum sum.
Example
Sample Input 1:
5 3
1 2 3 4 5

Sample Output 1:
12

Sample Input 2:
6 2
2 3 1 7 8 3

Sample Output 2:
29
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long sum = getMaxsumWindow(arr,n,k);
        System.out.println(sum);
    }

    public static long getMaxsumWindow(int arr[],int n,int k){
        Deque<Integer> qu = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!qu.isEmpty() && arr[i]>arr[qu.peekLast()]){
                qu.removeLast();
            }
            qu.addLast(i);
        }
        long result=0;

        for(int i=k;i<n;i++){
            //window sum
            result+= arr[qu.peekFirst()];
             while(!qu.isEmpty() && qu.peekFirst()<=i-k){
                qu.removeFirst();
            }

             while(!qu.isEmpty() && arr[i]>arr[qu.peekLast()]){
                qu.removeLast();
            }
             qu.addLast(i);
        }
        //finding maximum window sum
        result+= arr[qu.peekFirst()];
        return result;
    }
}