/* 
 * Matrix Queries
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a N x M integer matrix A and Q queries of form X1 Y1 X2 Y2. Print the sum of A[i][j], for X1 <= i <= X2 and Y1 <= j <= Y2.
Input
The first line contains two integer N and M, denoting the size of the matrix.
Next N line contains M integers denoting elements of the matrix.
Next line contains a single integer Q, denoting the number of queries.
Next Q lines lines four integers X1 Y1 X2 Y2, denoting the query as mentioned in problem statement

1 <= N, M <= 100
1 <= A[i][j] <= 100
1 <= Q <= 100000
1 <= X1 <= X2 <= N
1 <= Y1 <= Y2 <= M
Output
Print Q lines containing the answer to each query.
Example
Sample Input:
2 2
1 5
2 3
3
1 1 1 1
1 1 1 2
1 1 2 2

Sample Output:
1
6
11

Explanation:
Q1: 1
Q2: 1 + 5 = 6
Q3: 1 + 5 + 2 + 3 = 11
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      FastReader sc = new FastReader();
                      int N = sc.nextInt();
                      int M = sc.nextInt();
                      //taking input & make array prefix sum
                      int arr[][] = new int[N+1][M+1];
                      for(int i=1;i<=N;i++){
                          for(int j=1;j<=M;j++){
                              arr[i][j] = sc.nextInt();
                              //making prefix sum
                              arr[i][j] += arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
                          }
                      }
                      int test = sc.nextInt();
                      for(int t=0;t<test;t++){
                          int x1 = sc.nextInt();
                          int y1 = sc.nextInt();
                          int x2 = sc.nextInt();
                          int y2 = sc.nextInt();
                          
                          int sum=0;  
                          sum =  arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1];
                          System.out.println(sum);         
                      }
                      
    }
        static class FastReader {

BufferedReader br;

StringTokenizer st;

public FastReader()

{

br = new BufferedReader(

new InputStreamReader(System.in));

}

String next()

{

while (st == null || !st.hasMoreElements()) {

try {

st = new StringTokenizer(br.readLine());

}

catch (IOException e) {

e.printStackTrace();

}

}

return st.nextToken();

}

int nextInt() { return Integer.parseInt(next()); }

long nextLong() { return Long.parseLong(next()); }

double nextDouble()

{

return Double.parseDouble(next());

}

String nextLine()

{

String str = "";

try {

if(st.hasMoreTokens()){

str = st.nextToken("\n");

}

else{

str = br.readLine();

}

}

catch (IOException e) {

e.printStackTrace();

}

return str;

}

}
}