package queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    Stack<Integer> s1= new  Stack<>();
    Stack<Integer> s2= new  Stack<>();

    public void add(int data){
        while(!s1.isEmpty()){  
            s2.push(s1.pop());   //s1-> 5 4 3 2 1                       
        }                        //s2-> 
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
    
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.pop();
    }

    public int peek(){
        if(s1.isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.peek();
    }
    
    public static void main(String[] args) {

        QueueUsingTwoStack qu = new QueueUsingTwoStack();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }

        
    }
}
