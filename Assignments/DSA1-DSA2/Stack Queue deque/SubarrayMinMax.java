/* 
 * Sum of minimum and maximum elements of subarrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of size N, your task is to calculate the total sum of maximum and minimum elements in each subarray of size K.
See example for better understanding.
Input
First line of input contains an two space separated integers depicting values of N and K, next line contains N space separated integers depicting values of Arr[i].

Constraints:-
1 < = k < = N < = 100000
-100000 < = Arr[i] < = 100000
Output
Print the required sum
Example
Sample Input:-
5 3
1 2 3 4 5

Sample Output:-
18

Explanation:-
For subarray 1 2 3 :- 1 + 3 = 4
For subarray 2 3 4 :- 2 + 4 = 6
For subarray 3 4 5 :- 3 + 5 = 8
total sum = 4+6+8 = 18

Sample Input:-
7 4
2 5 -1 7 -3 -1 -2

Sample Output:-
18
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumMaxMin(arr,n,k));
    }

    public static long sumMaxMin(int[] arr,int n,int k){
    Deque<Integer> greater= new LinkedList<Integer>();
    Deque<Integer> smaller= new LinkedList<Integer>();
    long sum =0;
    //finding the greatest and smallest for first k window size and 
    //inserting it in deque
    for(int i=0;i<k;i++){
        //if greater than the last element in deque just remove
        while(!greater.isEmpty() && arr[i]>=arr[greater.peekLast()]){
            greater.removeLast();
        }
        //if smaller than the last element in deque just remove
        while(!smaller.isEmpty() && arr[i]<=arr[smaller.peekLast()]){
            smaller.removeLast();
        }
        //insert the given element
        greater.addLast(i);
        smaller.addLast(i);
    }
    //1 2 3 4 5 4 5
    //        -----
    // for the rest of the window to find max and min
    for(int i=k;i<n;i++){
        // here the sum of 1 st window will be cal.
        //and other windows also
        sum +=arr[greater.peekFirst()]+arr[smaller.peekFirst()];

        //shifting of windows.
        while(!greater.isEmpty() && greater.peekFirst()<=i-k){
            greater.removeFirst();
        }
        while(!smaller.isEmpty() && smaller.peekFirst()<=i-k){
            smaller.removeFirst();
        }

        // same operation like above find max and min
        while(!greater.isEmpty() && arr[i]>=arr[greater.peekLast()]){
            greater.removeLast();
        }
        while(!smaller.isEmpty() && arr[i]<=arr[smaller.peekLast()]){
            smaller.removeLast();
        }
        greater.addLast(i);
        smaller.addLast(i);
    }
    //sum for last window to add.
    sum +=arr[greater.peekFirst()]+arr[smaller.peekFirst()];
    return sum;
    }
}