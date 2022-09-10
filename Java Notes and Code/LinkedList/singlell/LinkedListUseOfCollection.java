package LinkedList.singlell;
import java.util.*;
public class LinkedListUseOfCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();// format to create list
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        list.addLast("list");
        list.add("ok");//add in last default
        System.out.println( list.size()); // for size
        System.out.println(list);

        //loop for list
        for(int i=0;i<list.size();i++){
            // for search we can do 
            // if(list.gety(i)==value);// search
            System.out.print(list.get(i)+"-->"); // to get the values
        }
        System.out.println("null");
        list.removeFirst(); //delete first
        System.out.println(list);
        list.removeLast(); // delete last
        System.out.println(list);
        list.remove(2);// remove index value
        System.out.println(list);
    }
}
