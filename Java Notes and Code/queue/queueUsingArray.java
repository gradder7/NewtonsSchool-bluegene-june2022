package queue;

import java.util.Deque;

public class queueUsingArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        queue(int size){
            arr= new int[size];
            this.size=size;
        }

        public  Boolean isEmpty() {
            return (rear==-1 && front==-1);
        }

        public Boolean isFull(){
            return (front==0&&rear==size-1);
        }

        //add O(1)
        public void enquie(int data){
            if(isFull()){
                System.out.println("Array is full");
                return;
            }
            else{
                if(front==-1 && rear==-1){
                    front=0;
                    rear=0;
                    arr[rear]=data;
                }
                else{
                    rear++;
                    arr[rear]=data;
                }

            }
        }


        //delete O(n)
        public int deque(){
            if(isEmpty()){
                System.out.println("noting to delete");
                return -1;
            }
            else if (front ==rear){
                front=rear=-1;
                return front;
            }
             else{
                // return front++;//front=front+1;
                int delfront= arr[0];
                for(int i=0;i<rear;i++){ //shift all elements back because one is deleted;
                    arr[i]=arr[i+1];
                }
                rear--;
                return delfront;
            }
            }

          // O(n)
        public int peek(){
            if(isEmpty()){
                System.out.println("noting to delete");
                return -1;
            }
            return arr[front];
        }


        public void print(){
            if(isEmpty()){
                System.out.println("Noting to print empty");
                return;
            }
            System.out.print("front-->");
             for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
             }
             System.out.println("<--rear");

            }
            public int getSize(){
                return rear;
            }


        }
        public static void main(String[] args) {
            queue q = new queue(16);
            q.enquie(5);
            q.enquie(6);
            q.enquie(7);
            q.enquie(8);
            q.enquie(9);
            q.enquie(10);
            q.print();
            q.deque();
            q.print();
            System.out.println(q.getSize());
            q.enquie(10);
            q.enquie(10);
            q.print();
            System.out.println(q.getSize());
            q.deque();
            q.print();
            System.out.println(q.getSize());
            System.out.println(q.peek());

        }
    }
   

