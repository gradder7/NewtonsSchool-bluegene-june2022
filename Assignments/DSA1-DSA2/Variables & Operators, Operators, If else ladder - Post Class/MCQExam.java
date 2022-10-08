import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int a = sc.nextInt();
                      int b = sc.nextInt();
                      int c = sc.nextInt();
                      int d = sc.nextInt();
        if (a+b+c+d==100){
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(a);
                } else{
                    System.out.println(d);
                } 
            }
        } else if(b>c){
            if(b>d){
                System.out.println(b);
            } else {
                System.out.println(d);
            }
        }  else if (c>d){
            System.out.println(c);
        }
        else{
            System.out.println(d);
        }



        }
    }
}