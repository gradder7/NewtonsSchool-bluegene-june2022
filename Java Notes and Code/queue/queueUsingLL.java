package queue;

public class queueUsingLL {
    private Node front;
    private Node rear;
    private int size;

    queueUsingLL(){
        this.size=0;
     }

    class Node{
        Node next;
        int data;

    Node(int data){
        this.data=data;
        this.next=null;
        size++;
    }
 }


 public boolean isEmpty(){
    return (front==null && rear ==null);
 }

// Node need to check is full

 public void enqueue(int data){
    Node newNode= new Node(data);
    if(isEmpty()){
        front=newNode;
        rear=newNode;
        return;
    }

        rear.next=newNode;
        rear=newNode; // rear = rear.next;

 }

 public int dequeue(){
    if(isEmpty()){
        System.out.println("List is empty");
        return -1;
    }
    size--;
    Node temp = front;
   
    front=front.next;
    
    if(front==null){
        rear=null;
    }
    return temp.data;
 }


 public int peek(){
    if(isEmpty()){
        System.out.println("No element");
        return -1;
    }
    return front.data;
 }

 public int getSize(){
    return size;
 }

 public void print() {
    if(isEmpty()){
        System.out.println("List is empty");
        return;
    }
    Node temp = front; // why? if head becomes head next so we will lose prev head or starting head.
    while(temp!=null){ // to print last next so not use .next
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("null");
}

 public static void main(String[] args) {
    queueUsingLL qu = new queueUsingLL();
    qu.enqueue(1);
    qu.enqueue(2);
    qu.enqueue(3);
    qu.enqueue(4);
    qu.enqueue(5);
    qu.dequeue();

   // System.out.println(qu.peek());
   System.out.println(qu.getSize());
    // while(!qu.isEmpty()){
    //     System.out.println(qu.peek());
    //     qu.dequeue();
    // }
    System.out.println(qu.getSize());
    qu.print();
 }


}
