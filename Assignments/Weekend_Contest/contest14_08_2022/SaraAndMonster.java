/* 
 * Sara and Monsters (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is playing a game in which there are N monsters standing in a circle and the ith (1 <= i <= N) monster has A[i] HP.
Rules:-
At the end of each second, all the monster's HP decreases by 1 if it is not 0.
At the end of each second, the player will jump to the next monster (monster standing to the right of the current).
The game ends when the current monster has 0 health.

If the player starts at index 1 then find the index at which the game ends.
Input
First line of input contains a single integer N. The next line of input contains N space-separated integers depicting the values of the array.

Constraints:-
1 <= N <= 100000
0 <= A[i] <= 1000000000
Output
Print a single index at which the game ends.
Example
Sample Input:-
5
3 2 3 2 1

Sample Output:-
4

Explanation:-
[ 3(P), 2, 3, 2, 1] - > [2, 1(P), 2, 1, 0] - > [1, 0, 1(P), 0, 0 ] - > [0, 0, 0, 0(P), 0]

Sample Input:-
3
10 10 10

Sample Output:-
2
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int count =0, i =0;
    while(true){
        if(arr[i]-count<=0){
            System.out.println((i+1)%n);
            break;
        }
        else{
            i=(i+1)%n;
            count++;
        }
    }
    }
}