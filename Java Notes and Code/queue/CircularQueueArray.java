package queue;

public class CircularQueueArray {
    private int arr[];
    private int size;
    private int front;
    private int rear;
    CircularQueueArray(int size){
        arr=new int[size];
        this.size=size;
        front=-1;
        rear=-1;
    }
    public  Boolean isEmpty() {
        return (rear==-1 && front==-1);
    }

    public Boolean isFull(){
        return (rear+1)%size==front;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("No size available");
            return;
        }
        //1st element add
        if(front==-1){ //is empty
            front=0;
        }
        rear= (rear+1)%size;
        arr[rear]= data;
    }

    //O(n) delete
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Nothing to delete");
            return -1;
        }
        int delfront=arr[front];
        //single element
        if(rear==front){
            front=-1;
            rear=-1;
        }
        else{
            //increase front by 1 using this conditon
            front = (front+1)%size;
        }
        return delfront;
        
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
       return arr[front];
    }
    public void print(){
        if(isEmpty()){
            System.out.println("nothing to print empty");
            return;
        }
        int i;
        System.out.println("front-->"+arr[front]);
        for(i=front;i!=rear;i=(i+1)%size){
            System.out.print(arr[i]+" ");
         }
         System.out.println(arr[i]);
        //  System.out.println();
         System.out.println("rear-->"+arr[rear]);
    }
    

    public static void main(String[] args) {
        CircularQueueArray q= new CircularQueueArray(6);
            q.enqueue(5);
            q.enqueue(6);
            q.enqueue(7);
            q.enqueue(8);
            q.enqueue(9);
            q.enqueue(10);
            q.print();
            q.dequeue();
            q.print();
            q.enqueue(23);
            q.print();
            System.out.println(q.peek());
           
          
    }
}
