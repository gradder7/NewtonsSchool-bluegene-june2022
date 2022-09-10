package LinkedList.singlell;

public class removeDuplicates {
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

    public void deleteDuplicates(){
        Node temp = head;
        if(head==null){
            return;
        }
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else temp =temp.next;
        }
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
        removeDuplicates rd= new removeDuplicates();
        rd.deleteDuplicates();
        rd.print();

    }
}
