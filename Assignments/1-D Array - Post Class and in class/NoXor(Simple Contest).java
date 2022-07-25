import java.io.*;
import java.util.*;
 
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long xorsum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=1;i<=n;i++){
            xorsum+=((n-i)^arr[i-1]);
        }
       System.out.println(xorsum);
    }
}