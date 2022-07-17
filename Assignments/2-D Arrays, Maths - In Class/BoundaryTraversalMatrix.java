import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here'
                      Scanner sc = new Scanner(System.in);
                      int size= sc.nextInt();

                      while(size>0){
                          int row= sc.nextInt();
                          int col= sc.nextInt();
                          int [][] myArray= new int [row][col];
                          for(int i=0;i<row;i++){
                              for(int j=0;j<col;j++){
                                  myArray[i][j]= sc.nextInt();
                              }
                          }
                          displayBoundary(myArray,row,col);
                          size--;
                      }
    }

    public static void displayBoundary(int [][] myArray, int row, int col){
            for(int i =0;i<row;i++){
                for(int j=0;j<col;j++){
                    if((i==0)||(j==0)||(j==col-1||i==row-1)){
                        System.out.print(myArray[i][j]+" ");
                  }
                      else {
                          System.out.print(" "); }   
              }
                  System.out.println("");
                }

   }
}