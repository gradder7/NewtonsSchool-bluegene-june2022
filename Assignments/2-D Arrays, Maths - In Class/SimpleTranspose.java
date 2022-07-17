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

                      for(int i=0;i<size;i++){
                          for(int j=0;j<size;j++){
                              myarray[i][j]=sc.nextInt();
                          }
                      }

                      for(int i=0;i<size;i++){
                          for(int j=0;j<size;j++){
                              System.out.print(myarray[j][i]+" ");
                          }
                          System.out.println();
                      }
    }
}