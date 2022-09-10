package Stack;
import java.util.Stack;

/**
 * Stack-(LIFO)last in first out
 * push-> top of stack O(1)
 * pop-> remove top element O(1) delete and return
 * peek-> get value of top element.O(1)
 * 
 */

public class stackLearning {
    static Node top;
    private int size;

    stackLearning(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
            size++;

        }
    }
    //is empty 
    public static boolean isEmpty() {
        return top ==null;
    }
    //push
    public void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        
        int head = top.data;
        top = top.next;
        size--;
        return head;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int head = top.data;
        return head;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        stackLearning s = new stackLearning();
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s.getSize());
        while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
        }
        System.out.println(s.getSize());
        

    }

}
