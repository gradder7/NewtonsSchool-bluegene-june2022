package LinkedList.singlell;
public class reverseLinkedList {
    Node head;
    private int size;

    reverseLinkedList(){
        this.size=0;
    }
  
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head= null;
            return;

        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode= lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next= null;
        System.out.println("deleted sucessfully"+secondLast.data);
        
    }

    public void deleteGiven(int data){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        size--;
        if(head.data==data){
            head= head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                return;
            }
            else temp=temp.next;

        }
        System.out.println("not present");

    }

    public void print(){
        if(head==null){
            System.out.println("List  is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }

    public void reverse(){
        if(head==null|| head.next==null){
            return;
        }
        Node prevNode= null;//head
        Node curNode= head;//head.next
        while(curNode!=null){
            Node nextNode = curNode.next;
            curNode.next= prevNode;

            //update
            prevNode= curNode;
            curNode= nextNode;
        }
         head.next= null;
         head= prevNode;
    }

    public static void main(String[] args) {
        reverseLinkedList rl = new reverseLinkedList();
        rl.addFirst(1);
        rl.addFirst(3);
        rl.addFirst(5);
        rl.addFirst(2);
        rl.addFirst(8);
        System.out.println(rl.getSize());
        rl.print();
        rl.deleteFirst();
        System.out.println(rl.getSize());
        rl.print();
        rl.deleteLast();
        System.out.println(rl.getSize());
        rl.print();
        rl.reverse();
        rl.print();
    }
}
