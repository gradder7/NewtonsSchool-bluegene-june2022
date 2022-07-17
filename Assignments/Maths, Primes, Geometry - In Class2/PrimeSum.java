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
                          int m = sc.nextInt();

                          System.out.println(getPrimeSum(n,m));
                      }
                    }

                     public static int getPrimeSum(int n, int m){
                         int sum =0;
                        for(int i=n;i<=m;i++){
                            if(checkprime(i)){
                                int x=i;
                                sum += (i%100)/10;
                            }
                        }
                        return sum;
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