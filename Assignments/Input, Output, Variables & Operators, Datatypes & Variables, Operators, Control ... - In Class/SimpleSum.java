import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner scanner = new Scanner(System.in);
                      int a= scanner.nextInt();
                      int b= scanner.nextInt();
                      int c= scanner.nextInt();
                      int sum= a+b+c;
                      System.out.println(sum);
    }
}