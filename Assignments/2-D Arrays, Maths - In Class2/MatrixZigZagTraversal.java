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

                           

                          for(int i=0 ; i<row+col-1; i++){
                                for(int j=0;j<col;j++){
                                    for(int k=0;k<row;k++){
                                        if(j+k==i){
                                            System.out.print(myArray[k][j]+" ");
                                        }
                                    }

                                }
                                System.out.println("");
                          }
    }
}