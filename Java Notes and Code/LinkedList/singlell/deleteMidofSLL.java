package LinkedList.singlell;
public class deleteMidofSLL {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
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

    public Node midDeltNode() {
        if(head==null || head.next==null){
            return null;
        }
        Node mid= findMid();
        mid.next=mid.next.next;
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
    public static void main(String[] args) {
        deleteMidofSLL rl = new deleteMidofSLL();
        rl.add(1);
        rl.add(3);
        rl.add(5);
        rl.add(2);
        rl.add(8);
        rl.print();
        rl.midDeltNode();
        rl.print();

    }
}
