import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int size= sc.nextInt();
                      int [][] arr= new int [size][size];

                      for(int i=0;i<size;i++){
                          for(int j=0;j<size;j++){
                                arr[i][j]= sc.nextInt();
                          }
                      }
                      int sum1=0;
                      int sum2=0;
                      for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
     
                              if (i == j)
                              sum1 += arr[i][j];

                                if ((i + j) == (size - 1))
                                 sum2 += arr[i][j];
                          }
                           }
                          System.out.println(sum1+" "+sum2);
      }
    }