import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

                Scanner sc = new Scanner(System.in);
                int t= sc.nextInt();

                while(t-->0){
                int n= sc.nextInt();
                if(chkPrime(n)){
                    System.out.println("Yes");
                } else{
                    System.out.println("No");
                }

                }
                
    }
    public static boolean chkPrime(int n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}