/* 
 * Evaluate Expression using Stack
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a postfix expression, your task is to evaluate given expression.

Infix expression: The expression of the form a operator b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.
Input
The first line denotes the size of the string(which contains number or operand in form of string) i.e. N.
The next line contains string. The string contains an integer called operand or any of the four operators (+ - * /)

Constraints:-
1 <= n <= 40
1<=number<=500
Output
Output the value of arithmetic expression formed using reverse Polish Notation.
Example
Input 1:
5
2 1 + 3 *
Output 1:
9

Explaination 1:
starting from backside:
*: ( )*( )
3: ()*(3)
+: ( () + () )*(3)
1: ( () + (1) )*(3)
2: ( (2) + (1) )*(3)
((2)+(1))*(3) = 9

Input 2:
5
4 13 5 / +
Output 2:
6

Explaination 2:
+: ()+()
/: ()+(() / ())
5: ()+(() / (5))
1: ()+((13) / (5))
4: (4)+((13) / (5))
(4)+((13) / (5)) = 6
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
        sc.nextLine();
        // use next Line to read spaces also
        String str = sc.nextLine();
        
        // System.out.println(str.length());           
        // System.out.println(str);
        System.out.println(evalPostFix(str));
    }
    public static int evalPostFix(String str){
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }

           else if(Character.isDigit(ch)){
               int n= 0;
               //take the Character as digit and then store them in n;
               while(Character.isDigit(ch)){
                   n= n*10+(int)(ch-'0');
                   i++;
                   //ch=str.charAt(i);
                    if(i < str.length())
                        {
                            ch = str.charAt(i);
                        }
                        else
                        {
                            break;
                        }
               }
               i--;
               // we will push number to the stack not the ch because n contains digit numbers.
               st.push(n);
            }

            else{
                int val1= st.pop();
                int val2= st.pop();
                switch(ch)
                {
                    case '+':
                    st.push(val2+val1);
                    break;
                     case '-':
                    st.push(val2-val1);
                    break;
                     case '*':
                    st.push(val2*val1);
                    break;
                     case '/':
                    st.push(val2/val1);
                    break;
                    //  case '^':
                    // st.push(Math.pow(val2,val1));
                }
            }
        }
        return st.pop();
    }
}

/*
// for single digit;
public static int evalPostFix(String str){
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch - '0');
            }
            else{
                int val1= st.pop();
                int val2= st.pop();
                switch(ch)
                {
                    case '+':
                    st.push(val2+val1);
                    break;
                     case '-':
                    st.push(val2-val1);
                    break;
                     case '*':
                    st.push(val2*val1);
                    break;
                     case '/':
                    st.push(val2/val1);
                    break;
                    //  case '^':
                    // st.push(Math.pow(val2,val1));
                }
            }
        }
        return st.pop();
    }
}
*/