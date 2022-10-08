/*
 * A Boolean Matrix Problem
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.
Input
The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
For each testcase, in a new line, print the modified matrix.
Example
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0

Explanation:
Testcase1: rows = 5 and columns = 4
The given matrix is
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
The final matrix is
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        FastReader sc = new FastReader();
        int size = sc.nextInt();
        while (size > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] myArray = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    myArray[i][j] = sc.nextInt();
                }
            }
            matrixNew(myArray, row, col);
            printMatrix(myArray, row, col);
            size--;
        }
    }

    

    public static void matrixNew(int[][] myArray, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (myArray[i][j] == 1) {
                    for (j = 0; j < col; j++) {
                        myArray[i][j] = 1;
                    }
                }
            }
        }
    }
    // FastReader inputTaker = new FastReader();

    public static void printMatrix(int[][] myArray, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println("");
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble()

        {

            return Double.parseDouble(next());

        }

        String nextLine()

        {

            String str = "";

            try {

                if (st.hasMoreTokens()) {

                    str = st.nextToken("\n");

                }

                else {

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