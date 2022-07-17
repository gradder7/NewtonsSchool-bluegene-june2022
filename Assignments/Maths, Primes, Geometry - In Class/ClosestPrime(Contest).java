import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                        nearestPrime(n);
    }

    public static void nearestPrime(int n ) {
        if(n==2){
            System.out.println("3");
        }
        else if(n==1){
            System.out.println("2");
        }
        else if(isPrime(n)==true){
            System.out.println(n);
        }
        else if(n>=3){
            int i=1;  //below
            while(true){
                if(isPrime(n-i))
                break;
                i++;
            }

            int j=1;  //above
            while(true){
                if(isPrime(n+j))
                break;
                j++;
            }

            if(i<j || i==j ){
                 System.out.println(n-i);
            } else{
                 System.out.println(n+j);
            }
        }
    }
    public static boolean isPrime(int n){ 
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       } 
       return true;
   }  
    
}