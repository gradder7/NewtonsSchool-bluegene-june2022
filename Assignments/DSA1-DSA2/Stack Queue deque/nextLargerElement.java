/* 
 * Next Larger Element
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, the task is to find the nearest greater element G[i] for every element of A[i] such that the element has index greater than i, If no such element exists, output -1.
More formally:
G[i] for an element A[i] = an element A[j] such that
j is minimum possible AND
j > i AND
A[j] > A[i]
Input
Each test case consists of two lines. The first line contains an integer N denoting the size of the array. The Second line of each test case contains N space separated positive integers denoting the values/elements in the array A.

Constraints:
1 <= N <= 10^5
1 <= Ai <= 10^9
Output
For each test case, print the next greater element for each array element separated by space in order.
Example
Sample Input
4
1 3 2 4

Sample Output
3 4 4 -1

Sample Input
4
4 3 2 1

Sample Output
-1 -1 -1 -1
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
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findNextLarger(arr,n);
    }
    public static void findNextLarger(int arr[],int n){
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int a =arr[i];
            while(!stack.empty() && stack.peek()<=a){
                stack.pop();
            }
            if(stack.empty()){
                arr[i]=-1;
            }
            else
            arr[i]=stack.peek();

            stack.push(a);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}