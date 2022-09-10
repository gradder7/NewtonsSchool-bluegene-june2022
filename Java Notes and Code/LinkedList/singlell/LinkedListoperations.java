package LinkedList.singlell;

public class LinkedListoperations {
    Node head;
    private int size; //null not count
    LinkedListoperations(){
        this.size=0;
    }
    // we can also create node class outsise the Linkedlist class
    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data= data;
            this.next=null;// when new node create next will be null
            size++;
        }
    }
    
    //add first, last
    public void addFirst(Integer data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head= newNode;
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

    public void addGivenPositon(Integer data, int pos){
        Node newNode= new Node(data);
        if(pos==1){
            addFirst(data);
            size--;// size is increasing by 1;
            return;
        }
        // if(pos==size){
        //     addLast(data);
        // }
        Node temp = head;
        for(int i=2;i<pos;i++){
            temp= temp.next;
        }

        // while(pos>2){ // start from second position.
        //     temp=temp.next;
        //     pos--;
        // }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //print
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


    public void deleteFirst() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head= head.next;// to delete first;
        System.out.println("first deleted sucessfullt");
    }
   
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;// written here because we have delete head also;

        if(head.next==null){ // single node
            head=null;
            return;
        }
        // Node secondLast = head;
        // Node lastNode = head.next;
        // while(lastNode.next!=null){
        //   lastNode= lastNode.next;
        //   secondLast= secondLast.next;
        // }
        // secondLast.next=null;
        // System.out.println("Last deleted sucessfully");
        Node temp =head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteGiven(Integer data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.data==data){
            head = head.next;
            System.out.println("Head is deleted "+ data);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                System.out.println("Deleted sucessfuullt "+ data);
                return;
            }
            else
            temp=temp.next;
        }
        System.out.println(data+" not present");
    }

    public void deleteTheGivenPosition(int pos){
        size--;
        if(pos==1){
            deleteFirst();
            return;
        }
        Node temp = head;
        // for(int i=1;i<pos;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // System.out.println("deleted Given");

        while(pos>2){
            temp=temp.next;
            pos--;
        }
        temp.next=temp.next.next;
        System.out.println("deleted Given");
        
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        LinkedListoperations list = new LinkedListoperations();
        list.addLast(1);
        list.print();
        list.addFirst(2);
        list.print();
        list.deleteLast();
        list.print();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.print();
        list.deleteGiven(5);
        list.print();
        System.out.println(list.getSize());
        list.addFirst(10);
        System.out.println(list.getSize());
        list.deleteGiven(10);
        System.out.println(list.getSize());
        list.print();
        list.addLast(5);
        list.addLast(7);
        list.print();
        System.out.println(list.getSize());
        list.addGivenPositon(0, 0);
        list.print();
        list.addGivenPositon(0, 6);
        list.print();
        list.addGivenPositon(1, 1);
        list.print();
        System.out.println(list.getSize());
        list.addGivenPositon(1, 8);
        list.print();
        System.out.println(list.getSize());
        list.deleteTheGivenPosition(9);
        list.print();
        list.addGivenPositon(1, 8);
        list.print();
        list.addGivenPositon(5, 1);
        list.addFirst(23);
        list.print();
        System.out.println(list.getSize());
        list.deleteGiven(1);
        list.print();
        list.deleteGiven(1);
        list.print();
        list.addGivenPositon(10, 2);
        list.print();
        list.deleteGiven(1);
        list.print();
        list.addGivenPositon(100, 10);
        list.print();
        list.addGivenPositon(13, 1);
        list.print();
        list.deleteTheGivenPosition(11);
        list.print();
        list.deleteLast();
        list.print();
    }


}