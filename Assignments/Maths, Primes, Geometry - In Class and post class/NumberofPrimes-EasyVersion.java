import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int t = sc.nextInt();

                      while(t-->0){
                        int n = sc.nextInt();
                        int count=0;
                        for(int i=2;i<=n;i++){
                            if(checkprime(i)){
                                count++;
                            }
                        }
                        System.out.println(count);                      }
    }


    public static boolean checkprime(int n){
                     for(int i =2;i<=Math.sqrt(n);i++){
                     if(n%i==0){
                      return false;
                       }
                     }
                      return true;
                 }

}