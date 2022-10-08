import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int size= sc.nextInt();
                          
                          int [][] myArray= new int [size][size];

                          for(int i=0;i<size;i++){
                              for(int j=0;j<size;j++){
                                  myArray[i][j]= sc.nextInt();
                              }
                          }
                          int upperTSum=0;
                          int lowerTSum=0;

                          for(int i=0;i<size;i++){
                              for(int j=0;j<size;j++){
                                  if(i<=j){
                                      upperTSum += myArray[i][j];
                                  }

                                  if(j<=i){
                                      lowerTSum += myArray[i][j];
                                  }
                              }
                          }
                          
                          System.out.println(upperTSum + " "+ lowerTSum);

    }
}