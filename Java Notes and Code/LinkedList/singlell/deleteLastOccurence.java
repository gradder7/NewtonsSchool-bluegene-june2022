package LinkedList.singlell;

public class deleteLastOccurence {
    Node head;
    
    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data= data;
            this.next=null;// when new node create next will be null
        }
    }


    public void addLast(Integer data) {
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head; // why? if head becomes head next so we will lose prev head or starting head.
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;
    }

    public void deleteLastOcc(int val){
        if(head==null){
            return;
        }
        Node temp = head;
        Node ptr=null;
        while(temp!=null){
            if(temp.data==val){
                ptr=temp;
            }
            temp=temp.next;
        }

        //not found
        if(ptr==null){
            System.out.println("element not found");
            return;
        }
        if(ptr==head){
            head=head.next;
            return;
        }
    
        //delete last node
        if(ptr!=null && ptr.next==null){
             temp = head;
             while(temp.next!=ptr){
                temp=temp.next;
             }
             temp.next=null;
             return;
        }
        temp=head;
        while(temp.next!=ptr){
            temp=temp.next;
        }
        temp.next=temp.next.next;



    }
    public void print() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head; // why? if head becomes head next so we will lose prev head or starting head.
        while(temp!=null){ // to print last next so not use .next
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deleteLastOccurence dlo = new deleteLastOccurence();
        dlo.addLast(12);
        dlo.addLast(13);
        dlo.addLast(11);
        dlo.addLast(11);
        dlo.addLast(14);
        dlo.addLast(1);
        dlo.print();
        dlo.deleteLastOcc(12);
        dlo.print();
    }
}
