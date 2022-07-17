import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int size = sc.nextInt();
                      int [] myArry = new int [size];
                      
                      for(int i=0; i<myArry.length; i++){
                          myArry[i]= sc.nextInt();
                      }
                      int sqr=0;
                      double mean=0;
                      double root=0;
                      for (int i=0; i< myArry.length;i++){
                          sqr+= Math.pow(myArry[i],2);
                      }
                      mean= (double)sqr/size;
                      root= Math.sqrt(mean);
                      System.out.println("%.6f",root);

    }
}