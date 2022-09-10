package LinkedList.doublell;

public class DoubleLLOperations {
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data= data;
            next=null;
            prev=null;
            size++;
        }
    }
    DoubleLLOperations(){
        this.size=0;
    }

    //add in head
    public void addFirst(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        newNode.prev=null;
        
        //if inserting 1st time and previous is null
        if(head!=null){
            head.prev=newNode;
        }
        head =newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp =head;
        newNode.next=null;
        if(head==null){
            newNode.prev=null; //addFirst();
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp =temp.next;
        }
        temp.next =newNode;
        newNode.prev=temp;

    }
    public void addGivenPosition(int data,int pos){
        Node newNode= new Node(data);
        if(pos==1){
            addFirst(data);
           // size--;// size is increasing by 1;
            return;
        }
        // if(pos==size){
        //     addLast(data);
        // }
        Node temp = head;
        for(int i=2;i<pos;i++){
            temp= temp.next;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
    }
    public Node find(int prev_Node){
        Node temp =head;
        while(temp!=null){
            if(temp.data==prev_Node){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void addAfterGivenNode(int prev_Node,int data){
        
        Node p=find(prev_Node);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node newNode= new Node(data);
        newNode.next=p.next;
        p.next=newNode;
        newNode.prev=p;
        if(newNode.next!=null){
          newNode.next.prev=newNode;
        }
        
    }
    public void addBeforeGivenNode(int next_Node,int data){
        Node p =find(next_Node);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node newNode= new Node(data);
        newNode.prev=p.prev;
        p.prev=newNode;
        newNode.next=p;
        if(newNode.prev!=null)
        newNode.prev.next=newNode;
        head=newNode;
    }
    public void deleteGivenNode(int data){
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
        Node temp =head;
        while(temp.next!=null){
          if(temp.next.data==data){
            temp.next=temp.next.next;
            temp.next.prev=temp;
            return;
          }
          else{
            temp=temp.next;
          }
        }
        System.out.println(data+" not present");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
        head.prev=null;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        } 
        else if(head.next==null){
            head =null;
            size--;
            return;
        }
        size--;
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    public void deleteTheGivenPosition(int pos){
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
        if(pos==size){
            deleteLast();
            return;
        }
        size--;
        //before 1 position to delete
        while(pos>2){
            temp=temp.next;
            pos--;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        
        System.out.println("deleted Given");
    }
    public void printReverse(){
        Node last=null;
        Node temp =head;
        while(temp!=null){
            //System.out.print(temp.data+"-->");
            last=temp;
            temp =temp.next;
        }
        //System.out.println("null");

        while(last!=null){
            System.out.print(last.data+"-->");
            last=last.prev;
        }
        System.out.println("null");
    }
    public void reverse()
    {
        // Node temp = null;
        // Node current = head;
 
      
        // while (current != null) {
        //     temp = current.prev;
        //     current.prev = current.next;
        //     current.next = temp;
        //     current = current.prev;
        // }
 
        // /* Before changing head, check for the cases like
        //  empty list and list with only one node */
        // if (temp != null) {
        //     head = temp.prev;
        // }
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
    public void print(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp =temp.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    public Node deleteNthfromEnd(int n){
        //Node start = new Node(0);
         //start.next= head;
         Node fast= head;
         Node slow = head;
         size--;
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
         //deleting last;
         if(slow.next.next==null){
            slow.next=null;
            return head;
         }
          slow.next= slow.next.next;
          slow.next.prev=slow;
          return head;
     }
    public Node deleteNthNodeEnd2ndWaycount(int n){
        Node current = head;
        int count =0;
        size--;
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

        if(current.next.next==null){
            current.next=null;
            return head;
         }
        current.next=current.next.next;
        current.next.prev=current;

        return head;

    }
    public Node findMid(){
        Node slow=head;
        Node fast=head;
        boolean restrict1step= true;

        while(fast!=null && fast.next!=null){
            
            fast = fast.next.next;
            if(!restrict1step){
                slow= slow.next;
            }else{  
                    restrict1step= false;
            }
        }
        return slow;
    }
    public Node deleteMid(){
        if(head==null || head.next==null){
            return null;
        }   
        Node mid=findMid();
        mid.next=mid.next.next;
        mid.next.prev=mid;
        return head;
    }

    public static void main(String[] args) {
        DoubleLLOperations dl = new DoubleLLOperations();
        dl.addFirst(12);
        dl.addFirst(13);
        dl.addFirst(14);
        dl.addFirst(15);
        dl.print();
        dl.addLast(11);
        dl.print();
        dl.addGivenPosition(20, 2);
        dl.print();
        dl.addAfterGivenNode(15, 2);
        dl.print();
        dl.addBeforeGivenNode(15, 1);
        //dl.printReverse();
         //dl.deleteTheGivenPosition(8);
        dl.print();
        System.out.println(dl.getSize());
          dl.deleteGivenNode(20);
          dl.print();
          System.out.println(dl.getSize());
          //dl.reverse();
          dl.print();
          dl.deleteNthfromEnd(1);
          dl.print();
          System.out.println(dl.getSize());
          dl.deleteMid();
          dl.print();
          dl.deleteMid();
          dl.print();
    }
}
