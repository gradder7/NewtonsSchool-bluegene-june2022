package Stack;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String str= "(]";
       System.out.println(isBalanced(str));

    }

    public static boolean isBalanced(String str){
        if(str==null && str.length()%2==1){
            return false;
        }
        Stack<Character> st= new  Stack<Character>();
        for(int i=0;i<str.length();i++){
            char bracket= str.charAt(i);
            if(bracket=='(' || bracket=='{' || bracket=='['){
                st.push(bracket);
            }
            else{
                if((st.isEmpty())){
                    return false;
                }
                char top=st.pop();
                if((top=='(' && bracket!=')')||(top=='{' && bracket!='}')||(top=='[' && bracket!=']')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
