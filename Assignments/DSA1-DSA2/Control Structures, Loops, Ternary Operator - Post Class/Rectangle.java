import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your coScade here
    
    Scanner sc= new Scanner(System.in);
   int M = sc.nextInt();
   int N = sc.nextInt();

    for(int i =1;i<=M;i++){
      for(int j=1;j<=N;j++){
        if(i==1||j==1||i==M||j==N){
          System.out.print("*");  
        } else
        System.out.print(" ");

      }
      System.out.println();
    }
    
   
    
	}
}