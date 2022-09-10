package LinkedList.singlell;


public class deleteNnodefromend {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        Node newNode=new Node(data);
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

    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public Node deleteNthfromEnd(int n){
       //Node start = new Node(0);
        //start.next= head;
        Node fast= head;
        Node slow = head;
        for(int i=1;i<=n;i++){
            if(fast.next==null){
                //return head.next;
                head = head.next;
                return head;
            }
            fast=fast.next;
        }

        while(fast.next!=null){
            fast= fast.next;
            slow=slow.next;
        }
         slow.next= slow.next.next;
         return head;
    }

    public Node delete2ndWaycount(int n){
        Node current = head;
        int count =0;
        while(current!=null){
            current= current.next;
            count++;
        }
        current=head;
        if(n==count){
            head= head.next;
            return head;
        }

        for(int i=1;i<count-n;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;

    }
    
    public static void main(String[] args) {
        deleteNnodefromend dl= new deleteNnodefromend();
        dl.add(1);
        dl.add(2);
        dl.add(3);
        dl.add(4);
        dl.add(5);
        dl.print();
        int n=4;
        dl.deleteNthfromEnd(1);
        //dl.delete2ndWaycount(n);
        dl.print();
        
    }
}


//size-n+1
