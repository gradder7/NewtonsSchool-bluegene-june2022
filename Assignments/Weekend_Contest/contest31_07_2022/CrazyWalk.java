/* 
 * Crazy Walk (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sky (the blue ranger) wants to replace Jack (the red ranger) from his position. For this, he needs to conquer the entire Base.
The Base can be represented as an M*N grid, and Sky needs to conquer it cell by cell. Sky starts conquering the Base from the cell (1, 1). In each move, he conquers the cell, and moves to an adjacent non- conquered cell (he cannot move if there is no adjacent non- conquered cell). Now, there is a catch, the last cell he needs to conquer is (M, N) so as to complete the quest for the red ranger tag!

Please let us know if Sky can replace Jack by conquering all the cells in the Base.

Note: The diagonal cells are not considered as adjacent cells.
Input
The first and the only line of input contains two integers M and N.

Constraints
1 <= M, N <= 1000
Output
Output "YES" (without quotes) if Sky can conquer the entire Base to replace Jack, else output "NO" (without quotes).
Example
Sample Input
2 2

Sample Output
NO

Explanation
The possible journeys of Sky ending at (2, 2) can be:
(1, 1) - > (1, 2) - > (2, 2)
(1, 1) - > (2, 1) - > (2, 2)
Since, in each of the path that Sky takes, the total cells covered are not 4, hence Sky cannot conquer the entire base.

Sample Input
3 3

Sample Output
YES
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int x = sc.nextInt();
                      int y = sc.nextInt();

                      if(x%2!=0 || y%2!=0)
                      System.out.println("YES");
                      else
                      System.out.println("NO");
    }
}