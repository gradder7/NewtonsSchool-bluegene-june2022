package Stack;

import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String str = "((A-(B/C))*((A/K)-L))";
        System.out.println(toPostfix(str));

    }

    public static String toPostfix(String str){
        Stack<Character> st = new Stack<>();
        char symbols;
        String postFix="";
        for(int i=0;i<str.length();i++){
            symbols=str.charAt(i);
            if(Character.isLetter(symbols)){
                postFix=postFix+symbols;
            }
            else if(symbols=='('){
                st.push(symbols);
            }
            else if(symbols==')'){
                while(st.peek()!='('){
                    postFix=postFix+st.pop();
                }
                st.pop(); // remove (  bracket
                
            }
            else{
                while(!st.isEmpty() && st.peek()!='(' && getPreference(symbols)<=getPreference(st.peek())){
                    postFix= postFix+st.pop();
                }
                st.push(symbols); // if while loop not
            }
        }
        while(!st.isEmpty()){
            postFix=postFix+st.pop();
        }

        return postFix;
    
    }

    private static int  getPreference(char x) {
        if (x == '+' || x == '-')  
        return 1;  
        if (x == '*' || x == '/' || x == '%')  
        return 2; 
        if(x=='^')
        return 3; 
        return 0;
    }
}
