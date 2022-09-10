package LinkedList.doublell;

import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='l'){
                result+=1;
            }
            if(ch=='V'){
                if(ch=='V' && str.charAt(i-1)=='l'){
                    result= 5-1;
                }
            }
        }
    }
    
}
