/*
 * Adjacent Window Sum
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array arr of size n and a window of size k your task is to find that whether two adjacent windows sum can be equal to the given sum. If yes print "YES" otherwise print "NO".
Input
The first line of the input contains n, k and sum.
Second line of the input contains the array arr.

Constraints
1 <= k < n <= 1e4
1 <= sum <= 1e8
1 <= arr[i] <= 1e3
Output
Print "YES" if the sum exists otherwise "NO".
Example
Sample Input 1:
5 3 21
1 2 4 3 5

Sample Output 1:
YES
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        checkTheSum(arr, n, k, s);
    }
    
    public static void checkTheSum(int arr[], int n, int k, int s){
        int sum = 0;
        int count = 0;
        boolean flag = false;

        HashSet<Integer> set = new HashSet<>(); 

        for(int i=0; i<n; i++){
            sum += arr[i];
            count++;

            if(count > k){
                sum -= arr[i-k];
                count--;
            }

            if(count == k){
                int check = s - sum;
                if(set.contains(check)){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
                set.add(sum);
            }
        }
        if(!flag){
            System.out.println("NO");
        }
    }

}