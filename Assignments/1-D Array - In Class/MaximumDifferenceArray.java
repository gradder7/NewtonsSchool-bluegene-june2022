import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

                      Scanner sc= new Scanner(System.in);
                      int n = sc.nextInt();
                      int A[] = new int[n];
                      for(int i=0;i<A.length;i++){
                          A[i]=sc.nextInt();
                      }
                    
                     int[] lmin = new int[n];
                     int[] rmax = new int[n];
                     lmin[0] = A[0];
                     for(int i = 1; i < n; i++) {
                            lmin[i] = Math.min(A[i],lmin[i-1]);
                              }
                     rmax[n-1] = A[n-1];
                    for(int i = n-2; i >= 0; i--) {
                        rmax[i] = Math.max(A[i],rmax[i+1]);

                    }
                     int i = 0;
                     int j = 0;
                     int ans =-1;
                     while(i <n && j<n)
                     {
                         if(lmin[i]< [j]){
                             ans=Math.max(ans,j-i);
                             j++;
                         } else{
                             i++;
                         }
                     
              }
         System.out.println(ans);
    
}
}