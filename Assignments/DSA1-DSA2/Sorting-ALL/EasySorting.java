/* 
 * Easy sorting
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings, like in a dictionary.
Input
Input contains 5 strings of length 2 separated by spaces.
String contains only uppercase English letters.
Output
Print the sorted array.
Example
INPUT :
AS KF ER DD JK

OUTPUT :
AS DD ER JK KF
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.next();
        }
        for (int i = 1; i < strings.length; i++) {
            int cur = i;
            for (int j = i - 1; j >= 0; j--) {
                if (strings[j].charAt(0) > strings[cur].charAt(0) ||
                        (strings[j].charAt(0) == strings[cur].charAt(0)
                                && strings[j].charAt(1) > strings[cur].charAt(1))) {
                    String tmp = strings[j];
                    strings[j] = strings[cur];
                    strings[cur] = tmp;
                    cur = j;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
    }
}