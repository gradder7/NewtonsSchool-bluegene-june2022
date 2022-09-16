/* 
 * Replace element
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements, your task is to update every element with multiplication of previous and next elements with following exceptions:-
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.

See example for more clarity
Input
First line of input contains the size of array N, next line contains N space separated integers denoting values of array.

Constraints:-
2 < = N < = 100000
1 < = arr[i] < = 100000
Output
Print the modified array
Example
Sample Input :-
5
2 3 4 5 6

Sample Output:-
6 8 15 24 30

Explanation:-
{2*3, 2*4, 3*5, 4*6, 5*6}

Sample Input:-
2
3 4

Sample Output:-
12 12
 */
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

        // don't change the name of this class
        // you can add inner classes if needed
        class Main {
        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int arr[]= new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
        arrayModify(arr,a);  
        for(int i =0;i<a;i++)
        System.out.print(arr[i]+" "); 

        }

        public static void arrayModify(int arr[], int a){
        if(a<=1)
        return;

        int previous=arr[0];
        arr[0]=arr[0]*arr[1];
        for(int i = 1;i<a-1;i++){
        int current = arr[i];
        arr[i]= previous*arr[i+1];
        previous = current;
        }
        arr[a-1]=previous*arr[a-1];


        }
        }