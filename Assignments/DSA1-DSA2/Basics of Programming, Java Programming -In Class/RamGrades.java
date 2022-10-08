import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code her
                 Scanner inputTaker = new Scanner(System.in);
        int a = inputTaker.nextInt();
        int b = inputTaker.nextInt();
        int c = inputTaker.nextInt();
        int d = inputTaker.nextInt();
        int percentage = (a+b+c+d)/4;
        System.out.println(percentage);
                      
    }
}