/*This java program is runnig fine and passing all the test cases.
 * The 2 test cases showing MLE(Memory limit exceed).
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int size= sc.nextInt();
                      int [][] myarray= new int[size][size];
                      int a=0;
                      int b=0;

                      for(int i=0;i<size;i++){
                          for(int j=0;j<size;j++){
                            myarray[i][j]=sc.nextInt();
                              int x= (i+j)&1;
                              if(myarray[i][j]==x)
                              a+=1;
                              if(myarray[i][j]!=x)
                              b+=1;
                             }
                         
                      } 
                      if(a<b)
                      System.out.println(a);
                      else
                      System.out.println(b);
    }
}