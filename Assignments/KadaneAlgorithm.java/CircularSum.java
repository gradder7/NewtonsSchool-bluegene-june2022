/* 
 * Max Circular Subarray Sum
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum containing at least 1 element.
Input
The first line of input contains a single integer T which denotes the number of test cases. The first line of each test case contains a single integer N which denotes the total number of elements. The second line of each test case contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
-10^6 <= Arr[i] <= 10^6

The Sum of N over all test cases is less than equal to 10^6.
Output
For each test case print the maximum sum obtained by adding the consecutive elements.
Example
Input:
4
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1
4
-1 -2 -3 -4

Output:
22
23
52
-1

Explanation:
Testcase 1: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives the maximum sum as 22.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long maxCircularSum(int a[]){
        long maxeh =a[0], max=a[0],mineh=a[0],min=a[0];
        long sum=a[0];
        for(int i=1;i<a.length;i++){
            maxeh = Math.max(maxeh+a[i], a[i]);
            max= Math.max(max, maxeh);
            mineh = Math.min(mineh+a[i], a[i]);
            min= Math.min(min, mineh);
            sum += a[i];
        }
        if(min == sum) return max;
        return Math.max(sum-min, max);

    }
    public static void main (String[] args)throws IOException {
    // Your code here
    /* Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int t=0; t<T;t++){
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxCircularSum(arr));
    }*/
    BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int t=0;t<T;t++){
        int N = Integer.parseInt(br.readLine());
        String str[] =br.readLine().trim().split(" ");   
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(maxCircularSum(arr));
    }

    }
}