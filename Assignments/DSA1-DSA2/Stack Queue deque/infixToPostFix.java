/* 
 * Infix to Postfix
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an infix expression, your task is to convert it into postfix.

Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'.

See example for better understanding.
Input
The input contains a single string of infix expression.

Constraints:-
1 <= |String| <= 40
Output
Output the Postfix expression.
Example
Sample Input:-
((A-(B/C))*((A/K)-L))

Sample Output:-
ABC/-AK/L-*

Sample Input:-
A+B

Sample Output:-
AB+
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
                      System.out.println(toPostfix(str));

    }
    public static String toPostfix(String str){
        Stack<Character> st = new Stack<Character>();
        char symbol;
        String postfix="";
        for(int i=0;i<str.length();i++){
            symbol=str.charAt(i);
            if(Character.isLetter(symbol)){
                postfix=postfix+symbol;
            }
            else if(symbol=='('){
                st.push(symbol);
            }

            else if(symbol==')'){
                while(st.peek()!='('){
                    postfix=postfix+st.pop();
                }
                st.pop(); // remove (
            }
            else{
                while(!st.isEmpty() && !(st.peek()=='(') && getPrefernce(symbol)<= getPrefernce(st.peek())){
                    postfix=postfix+st.pop();
                }
                st.push(symbol);
            }
        }
        while(!st.isEmpty()){
            postfix=postfix+st.pop();
        }
         return postfix;
    }

    public static int getPrefernce(char x){
        if (x == '+' || x == '-')  
        return 1;  
        if (x == '*' || x == '/' || x == '%')  
        return 2; 
        if(x=='^')
        return 3; 
        return 0;
    }
}