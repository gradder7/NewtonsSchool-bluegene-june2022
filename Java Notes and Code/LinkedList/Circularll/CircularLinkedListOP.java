package LinkedList.Circularll;

public class CircularLinkedListOP {
    Node head;
    private int size;
    
    CircularLinkedListOP(){
        this.size=0;
    }
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
            
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            newNode.next=head;
            return;
        }
        
        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        head = newNode;
        temp.next=newNode;


    }

    public void insert(int val){
        Node newNode=new Node(val);
        if(head==null){
            head = newNode;
            newNode.next=head;
      
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
   
    }

    public void addGivenPosition(int data, int pos){
        Node newNode=new Node(data);
        if(pos==1){
          addFirst(data);
          size--; // to decrease the size
       
          return;
        }
        Node temp = head;
        for(int i=2;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }


    public void delete(int data){
        //if null
        if(head==null){
            System.out.println("Nothng to delete list is empty");
            return;
        }
        
        //only one Node
        size--;
        if(head.next==head && head.data==data){
            head=null;
            System.out.println("There was only single Node so deleted");
        
            return;
        }

        //to delete head 
        if(head.data==data){
            Node temp = head;
            //to find last
            while(temp.next!=head){
                temp=temp.next;
            }
            head= head.next;
            temp.next=head;
            System.out.println("Sucessfully deleted head");
        
            return;
        }

        //find required Node
        Node temp=head;
        while(temp.next!=head){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                System.out.println("Deleted the given Node");
                return;
            }
            temp=temp.next;
        }

    }

    public void deleteNthNodeposition(int pos){
           size--;
            if(pos==1){
                Node temp= head;
                while(temp.next!=head){
                    temp=temp.next;
                }
                head = head.next;
                temp.next=head;
                System.out.println("The node was at 1st positon hence the head is deleted");
                return;
            }
            Node temp= head;
            for(int i=2;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            System.out.println("deleted given");
        

    }

    public void print() {
        
            Node temp = head;
            if (head != null) {
                do {
                    System.out.print( temp.data+"-->");
                    temp = temp.next;
                } while (temp != head);
            }
            System.out.println("head");
        }


    public void checkIscircular(){
        if(head==null){
            System.out.println("yes it is circular");
            return;
        }
        Node temp = head;
        while(true){
            if(temp.next==null){
                System.out.println("Not circular");
                return;
            }
            if(temp.next==head){
                System.out.println("yes it is circular");
                return;
            }
            temp=temp.next;
        }
    }
    public int getSize(){
        Node current=head;
        int count =0;
        if(current==null){
            return 0;
        }
        while(current!=null){
            count++;
            current= current.next;
        }
      return count;
    }
    public int getnewSize(){
        return size;
    }

    
    public static void main(String[] args) {
        CircularLinkedListOP cr= new CircularLinkedListOP();
        cr.insert(1);
        cr.insert(2);
        cr.insert(3);
        cr.insert(4);
        cr.insert(5);
        cr.print();
        cr.checkIscircular();
        cr.delete(1);
        cr.print();
        cr.deleteNthNodeposition(1);
        cr.addGivenPosition(25, 1);
        cr.addFirst(12);
        cr.addGivenPosition(100, 6);
        cr.print(); 
        System.out.println(cr.getnewSize());
    }
}
