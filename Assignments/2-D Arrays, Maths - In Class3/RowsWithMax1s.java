import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int row= sc.nextInt();
                          int col= sc.nextInt();
                          int [][] myArray= new int [row][col];
                          for(int i=0;i<row;i++){
                              for(int j=0;j<col;j++){
                                  myArray[i][j]= sc.nextInt();
                              }
                          }
                          int ans = countNumber(myArray,row,col);
                          System.out.println(ans);
                                    
    }
                 public static int countNumber(int [][] myArray, int row, int col){
                             for(int j=0;j<col;j++){
                              for(int i=0;i<row;i++){
                                    if(myArray[i][j]==1){
                                           return i;
                                    }
                              }
                          }
                              return -1;     
     }
                              
}