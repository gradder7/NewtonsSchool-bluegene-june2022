package Stack;

import java.util.Stack;

public class StackUsingArray {
    private int top;
    private int arr[];
    private int capasity;

    StackUsingArray(int size){
        this.capasity=size;
        top =-1;
        arr=new int[size];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capasity-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack over flow OverFlow");
            return;
        }
        System.out.println("inserting "+ x);
        top++;
        arr[top]=x;
    }
     public int pop() {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        System.out.println("deleting" + peek());
        return arr[top--];
     }

     public int peek(){
        if(!isEmpty()){
            return arr[top];
        } else
        return -1;
     }

     public void print(){
        for(int j=top;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
     }


    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        stack.push(1);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        System.out.println(stack.size());
        stack.print();
        System.out.println(stack.peek());
        stack.pop();
        stack.print();
        System.out.println(stack.size());
    }
}
