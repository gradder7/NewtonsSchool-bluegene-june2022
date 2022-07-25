/*
 * Travelling
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.
Input
The first line of input contains two integers N and X(initial position). The second line of input contains N space separated integers representing the location of cities.

Constraints:-
1 <= N <= 100000
1 <= City[] <= 100000000
Output
Print the maximum value of D such that you can visit all the cities.
Example
Sample Input:-
3 3
1 7 11

Sample Output:-
2

Sample Input:-
3 81
33 105 57

Sample Output:-
24
 */

import java.io.*; // for handling input/output..
import java.util.*; // contains Collections framework...

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int citiesnumber = scn.nextInt();
        int initialPosition = scn.nextInt();
        int differencePosition[] = new int[citiesnumber];
        int location[] = new int[citiesnumber];
        for (int i = 1; i < location.length; i++) {
            location[i] = scn.nextInt();
        }
        difference(location, differencePosition, initialPosition);

    }

    public static void difference(int[] location, int[] differencePosition, int initialPosition) {
        for (int i = 1; i < location.length; i++) {

            int a = Math.abs(location[i] - initialPosition);
            differencePosition[i] = a;
        }
        int temp = gcd(differencePosition[0], differencePosition[1]);
        for (int i = 1; i < location.length - 1; i++) {
            temp = gcd(temp, differencePosition[i + 1]);
        }
        System.out.println(temp);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}