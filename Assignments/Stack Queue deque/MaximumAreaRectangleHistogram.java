/* 
 * Maximum Rectangular Area in a Histogram
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Black widow is on a mission to get more information about hydra's whereabouts. She comes across a room where laser lines intersect to form containers. A message pops up on the screen in front of her mocking her saying that she won't be able to find the information she needs. But there's a hint too, the container with maximum water has the intel she needs. The water is polluted with a substance that causes it to become invisible so that no one can make out by seeing how much water is in the container. Help Black Widow solve the mystery and get more intel about hydra.
Find the largest rectangular area that contains most water in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.
Input
First line contains an integer 'N' denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array. The elements of the array represents the height of the bars.

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^9
Output
Print a single line denoting the maximum rectangular area possible from the contiguous bars.
Example
Input
7
6 2 5 4 5 1 6

Output
12

Input
4
6 3 4 2

Output
9
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
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxRectAreaHistogram(arr,n));
    }

    public static int maxRectAreaHistogram(int arr[],int n){
        int max =Integer.MIN_VALUE;
        int[] prev_Smaller_Arr=previousSmaller(arr,n);
        int[] next_Smaller_Arr=nextSmaller(arr,n);
        for(int i=0;i<n;i++){
            int currentAreaHisto= (next_Smaller_Arr[i]-prev_Smaller_Arr[i]-1)*arr[i];
            max=Math.max(max,currentAreaHisto);
        }
        return max;
    }

    public static int[] previousSmaller(int arr[],int n){
        int ps[]=new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i]=-1;
            } else{
                ps[i]= st.peek();
            }
            st.push(i);
        }
        return ps;
    }
        public static int[] nextSmaller(int arr[],int n){
        int ns[]=new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i]=arr.length;
            } else{
                ns[i]= st.peek();
            }
            st.push(i);
        }
        return ns;
    }
}