import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int testCase= sc.nextInt();
                      while(testCase > 0){
                      int num = sc.nextInt();     
                      System.out.println(checkDivisor(num));
                      testCase--;
                      } 
    }
    public static int checkDivisor(int num){
        int count=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num % i==0 ){
                if(i % 2==0){
                count++;
                }  
                if(i*i !=num){
                    if((num/i)%2==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}