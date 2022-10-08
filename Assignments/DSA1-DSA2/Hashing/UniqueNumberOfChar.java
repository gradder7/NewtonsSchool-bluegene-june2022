/* 
 * Unique number of characters
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, your task is to find the total number of unique characters in a string.
Input
The first line of the input contains a string s, Note s can also contains white spaces

Constraints
1 <= s. length() <= 105
Output
Print the total number of unique characters.
Example
Sample Input 1:
newton School

Sample Output 1:
10
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    HashMap<Character,Boolean> map = new HashMap<>();
    for(int i=0;i<str.length();i++){
        Character ch =  str.charAt(i);
        if(!map.containsKey(i)){
            map.put(ch,true);
        }
    }

    System.out.println(map.size());
                           
    }
}