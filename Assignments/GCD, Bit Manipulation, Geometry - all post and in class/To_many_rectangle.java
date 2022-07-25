/*
 * Too many rectangles? (Group Contest: April '21)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Why Geometry?? ?

You are given 4*N+1 distinct points on the cartesian plane. Out of these points, 4*N points represent the end points of N rectangles (with axis parallel to co-ordinate axis), while one point does not belong to any of the rectangles. Report the coordinates of the point that does not belong to any of the N rectangles.
Input
The first line of the input contains an integer N.
The next 4*N+1 lines contain two integers X and Y, the coordinates of the given points.

Constraints
1 <= N <= 100000
0 <= X, Y <= 1000000
The given points always represent N rectangles and an extra point
Output
Output space separated X and Y coordinates of the extra point.
Example
Samle Input
1
1 3
1 1
3 1
1 4
3 3

Sample Output
1 4

Explanation: (1, 1), (1, 3), (3, 1), and (3, 3) represent the end of a rectangle, while (1, 4) is the extra point.

 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        int x5 = 0;
        int y5 = 0;

        for (int i = 0; i < 4 * n + 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x5 ^= x;
            y5 ^= y;
        }
        System.out.println(x5 + " " + y5);
    }

    // fast FastReader

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

                } catch (IOException e) {

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

                } else {

                    str = br.readLine();

                }

            } catch (IOException e) {

                e.printStackTrace();

            }

            return str;

        }

    }

}