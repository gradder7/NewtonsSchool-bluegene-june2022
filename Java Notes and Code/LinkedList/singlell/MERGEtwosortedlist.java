package LinkedList.singlell;
public class MERGEtwosortedlist {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //add
    public  void add(int data){
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

    //print
    public  void print(){
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

    //merge
    public  Node mergeIt(Node headA, Node headB ){
        Node dummy = new Node(0);
        Node tail= dummy;
        while(true){
            if(headA==null){
                tail.next=headB;
                break;
            }
            else if(headB==null){
                tail.next=headA;
                break;
            }
            if(headA.data<=headB.data){
                tail.next=headA;
                headA=headA.next;
            }
            else{
                tail.next=headB;
                headB=headB.next;
            }
            tail=tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MERGEtwosortedlist mg = new MERGEtwosortedlist();
        MERGEtwosortedlist mg2 = new MERGEtwosortedlist();
        mg.add(1);
        mg.add(3);
        mg.add(5);
        mg.add(7);
        mg.add(9);

        mg2.add(2);
        mg2.add(4);
        mg2.add(6);
        mg2.add(8);
        mg2.add(10);
        mg.print();
        mg2.print();

        mg.mergeIt(mg.head, mg2.head);
        mg.print();
    }
}
/*
 * public class MERGEtwosortedlist {
    public static void main(String[] args) {
        mycustome mg = new mycustome();
        mycustome mg2 = new mycustome();
        mg.add(1);
        mg.add(3);
        mg.add(5);
        mg.add(7);
        mg.add(9);

        mg2.add(2);
        mg2.add(4);
        mg2.add(6);
        mg2.add(8);
        mg2.add(10);
        mg2.add(11);
        mg.print();
        mg2.print();
        mg.mergeIt(mg.head, mg2.head);
        mg.print();
    }

}

class mycustome{
    Node head;

    //add
    public  void add(int data){
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

    //print
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

    //merge
    public  Node mergeIt(Node headA, Node headB ){
        Node dummy = new Node(0);
        Node tail= dummy;
        while(true){
            if(headA==null){
                tail.next=headB;
                break;
            }
            else if(headB==null){
                tail.next=headA;
                break;
            }
            if(headA.data<=headB.data){
                tail.next=headA;
                headA=headA.next;
            }
            else{
                tail.next=headB;
                headB=headB.next;
            }
            tail=tail.next;
        }
        return dummy.next;
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

 */
