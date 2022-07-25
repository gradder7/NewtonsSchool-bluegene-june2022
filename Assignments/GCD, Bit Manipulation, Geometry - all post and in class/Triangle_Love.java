/*
 * Triangles love
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara loves triangles. Whenever she sees three points she connects them by straight lines to form a triangle. In triangles, her favorite one is a right-angled triangle. If the triangle is not right-angled but it can be converted into one by moving one of the points exactly by distance 1 so, that all the coordinates remain integer, she calls such triangles "Special".
Given three points A, B, and C your task is to check if the formed triangle is "Right", "Special" or "Simple".
Input
The first line of input contains the position of A(Ax, Ay). The second line of input contains the position of B(Bx, By). The third line of input contains the position of C(Cx, Cy).

Constraints:-
|X|, |Y| <= 10^9
Output
Print "Right" if the triangle is right- angled, print "Special" if the triangle can be formed into a right- angled by moving one of the points exactly by distance 1, else print "Simple".
Example
Sample Input:-
0 0
2 0
0 1

Sample Output:-
Right

Sample Input:-
-1 0
2 0
0 1

Sample Output:-
Special

Sample Input:-
-1 0
2 0
10 10

Sample Output:-
Simple
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
public static int sq(int side){
                return side*side;
        }
 public static boolean check(int coordinates[]){
                int a,b,c;
a=sq(coordinates[0]-coordinates[2])+sq(coordinates[1]-coordinates[3]);
b=sq(coordinates[0]-coordinates[4])+sq(coordinates[1]-coordinates[5]);
c=sq(coordinates[2]-coordinates[4])+sq(coordinates[3]-coordinates[5]);
                if (a==0 || b==0 || c==0)
                        return false;
                if (a+b==c||a+c==b||b+c==a){
                        return true;
                }
            return false;
        }
        public static void main(String s[])
          {
            Scanner sc = new Scanner(System.in);
            int coordinates[]=new int[6];
            for(int i=0;i<6;i++)
                coordinates[i]=sc.nextInt();
            if(check(coordinates)){
                    System.out.println("Right");
                    return ;
            }
for(int i=0;i<6;i++){
 coordinates[i]++;
                if(check(coordinates)){
 System.out.println("Special");
                    return ;
                }
        coordinates[i]--;   
        coordinates[i]--;
        if(check(coordinates)){
        System.out.println("Special");
        return ;
                }
  coordinates[i]++; 
            }

 System.out.println("Simple");
}
}