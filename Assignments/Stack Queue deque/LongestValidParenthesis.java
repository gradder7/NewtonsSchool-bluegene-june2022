/* Longest valid Parenthesis
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.
Input
Each test case have one line string S of character '(' and ')' of length N.

Constraints:
1 <= N <= 10^5
Output
Print the length of the longest valid parenthesis substring.
Example
Input
((()

Output
2

Input
)()())

Output
4 
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

        //first create a stack
        Stack<Integer> st = new Stack<>();

        //push -1 to stack so that to provide base 
        //for other values in stack
        st.push(-1);
        int max =0;
        //traverse over the string
        for(int i=0 ;i < str.length(); i++){
            char ch = str.charAt(i);
            //if its a opening push the index to stack
            if(ch == '('){
                st.push(i);
            } 
            //if its a ')' closing one
            //pop the element from the stack 
            else{ 
            st.pop();
            
            //if stack is empty push current element index to stack
            if(st.isEmpty()){
                st.push(i);
            }
            //if not empty than find the length and 
            //find max of the longest vaild parenthesis.
            else{
                max =Math.max(max,i-st.peek());
            }
            }
            
        }
        System.out.println(max);
    }
}