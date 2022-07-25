import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int size =Integer.parseInt(br.readLine());
            
                        while(size>0){
                           int n =Integer.parseInt(br.readLine());
                           String str[] = br.readLine().trim().split(" ");
                           printNumber(str);
                           size--;
                        }                
    }
    public static void printNumber(String [] myarray){
        int first=0;
        int second=0;
        int third=0;
        int num =0;
        for(int i=0;i<myarray.length;i++){
         num = Integer.parseInt(myarray[i]);
            if (num > first){
               third=second;
               second=first;
               first=num;
      }
      else if (num > second){
         third = second;
         second = num;
      }
      else if (num > third)
         third = num;
   }
   System.out.println(first+" "+second+" "+third);
        }
    }