import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                     // Scanner sc = new Scanner(System.in);
                     // int num = sc.nextInt();
                     

                     Scanner sc = new Scanner(System.in);
                     int num = sc.nextInt();

                     int val = num>0 ? 1:-1;

                     switch (val){
                         case 1:{
                         System.out.println("Positive");
                         break;
                         }

                         case -1:{
                             if(num == 0){
                                 System.out.println("Zero");
                             }
                         else{
                         System.out.println("Negative");

                         }
                         break;

                         }
                        // default:{
                            // System.out.println("Zero");
                       //  }

                     }                    
    }
}