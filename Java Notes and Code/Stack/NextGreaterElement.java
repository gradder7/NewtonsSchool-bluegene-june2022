package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findNextLarger(arr,n);
    }

    private static void findNextLarger(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i= n-1;i>=0;i--){
            int a = arr[i];
            while(!stack.isEmpty()&& stack.peek()<=a){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i]=-1;
            } else
            arr[i]=stack.peek();
            stack.push(a);
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        
    }
}
