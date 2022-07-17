import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.DecimalFormat;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      double a = sc.nextFloat();
                      double b = sc.nextFloat();
                      double c = sc.nextFloat();
                      int chk =0;
                      double d = b*b - 4*a*c;
                      double root1;
                      double root2;
                      double x;
                      double y;
                      // System.out.println(d);
                      DecimalFormat df = new DecimalFormat("0.00");

                      if(d>0)
                        chk=1;
                      if (d<0)
                        chk=2;
                      if (d==0)
                      chk =3;

                      switch(chk){
                          case 1:
                          root1= (-b + Math.sqrt(d))/(2*a);
                          root2= (-b - Math.sqrt(d))/(2*a);
                          System.out.println(df.format(root1));
                          System.out.println(df.format(root2));

                          break;

                          case 2:
                          root1= -b/(2*a);
                          x= (Math.sqrt(-d))/(2*a);
                          
                          root2= root1;
                          y = x;
                           System.out.println(df.format(root1)+"+i"+df.format(x));
                           System.out.println(df.format(root2)+"-i"+df.format(y));
                           break;

                           case 3:
                           root1 = -b/(2*a);
                           root2=root1;
                           System.out.println(df.format(root1));
                           System.out.println(df.format(root2));
                           break;


                          
                      }

                      

                      
    }
}