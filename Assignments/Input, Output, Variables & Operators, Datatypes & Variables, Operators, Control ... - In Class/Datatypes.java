import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner scanner = new Scanner(System.in);
                      int x = scanner.nextInt();
                      long y = scanner.nextLong();
                      float z = scanner.nextFloat();
                      double a = scanner.nextDouble();
                      char c = scanner.next().charAt(0);

                      System.out.println(x);
                      System.out.println(y);
                      //System.out.printf("%.2f", z);
                      //System.out.println("");
                      System.out.println(String.format("%.2f", z));
                      //System.out.printf("%.4f", a);
                      //System.out.println("");
                      System.out.println(String.format("%.4f", a));
                      System.out.println(c);
                    

    }
}