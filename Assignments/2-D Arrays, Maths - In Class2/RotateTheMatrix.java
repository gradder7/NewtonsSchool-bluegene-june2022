import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int size = sc.nextInt();
                      int [][] arr= new int [size][size];
                      for(int i=0;i<size;i++){
                          for(int j=0;j<size;j++){
                              arr[i][j]= sc.nextInt();
                          }
                      }
                     // transpose(arr,size);
                      reverse(arr,size);
                      display(arr,size);
                      System.out.println("");
                     // transpose(arr,size);
                      reverse(arr,size);
                      display(arr,size);
    }
/*
    public static void transpose(int [][] arr, int size){
                        for(int i=0;i<size;i++){
                          for(int j=i;j<size;j++){
                             int temp= arr[i][j];
                              arr[i][j]= arr[j][i];
                              arr[j][i]= temp;
                          }
                      }
    }
*/
     public static void reverse(int [][] arr, int size){
                        /* for(int i=0;i<arr.length;i++){
                             int k= arr.length-1;
                          for(int j=0;j<arr.length/2;j++){
                              int temp =arr[i][j];
                              arr[i][j]=arr[i][k-j];
                              arr[i][k-j]=temp;
                          }
                      } */

                      for (int j = 0; j < size; j++)
        {
            for (int i = size - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
     }


      public static void display(int [][] arr, int size){
                        for(int i=0;i<size;i++){
                          for(int j=0;j<size;j++){
                              System.out.print(arr[i][j]+" ");
                          }
                          System.out.println("");
                      }
      }

}