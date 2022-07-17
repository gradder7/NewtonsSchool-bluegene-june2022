import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                       int myArray[] = new int[n];
                       for(int i =0;i<myArray.length;i++){
                           myArray[i]=sc.nextInt();
                       }

                       long totalDonation= tDonatio(myArray);
                       //System.out.println();
                      // System.out.println(sum)
                      System.out.println(totalDonation);

    }
     public static long tDonatio(int[] myArray){
                        long totalDonation= 0;
                        int maxDonation = myArray[0];
                        for(int i=0;i<myArray.length;i++){
                            maxDonation= Math.max(maxDonation,myArray[i]);
                            totalDonation= totalDonation + maxDonation;
                            System.out.print((maxDonation-myArray[i])+" ");
                        }
                        System.out.println("");
                        return totalDonation;
                    }
}