import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int size = sc.nextInt();
                      int myarray[]= new int[size];
                      for(int i=0;i<myarray.length;i++){
                          myarray[i]=sc.nextInt();
                      }
                      chkpair(myarray);
                      
    }
    public static void chkpair(int myarray[]){
        Arrays.sort(myarray);
        int ans=0;
        int i=0, j=myarray.length-1;
        while(i<j){
            int temp= myarray[i]+myarray[j];
            if(ans<temp){
                    ans = temp;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}