/* 
 * Bubble sort in pair array
easy
Problem Statement
Given a array of pair, your task is to sort the array elements on the basis of first element of pairs in descending order

Note:-If first element are equal in two or more pairs then give preference to second element having higher value.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SortPair() that takes the array of pair and the integer N(size of array) as a parameter.

Custom Input
The first line of input will be a single integer N. The next line of input contains 2*N space separated integers where unique adjacent elements are pairs. Custom input for 1st sample:-
4
1 2 3 4 5 6 7 8

Constraints:-
1<=N<=1000
1<=value<=100000
Output
Return the sorted array of pairs.
Example
Sample Input:
4
(1, 2), (3, 4), (5, 6), (7, 8)

Sample Output:
(7, 8), (5, 6), (3, 4), (1, 2)

Sample Input:
3
(1, 1), (2, 2), (3, 3)

Sample Output:
(3, 3), (2, 2), (1, 1)

Sample Input:
3
(1, 1), (1, 2), (3, 3)

Sample Output:
(3, 3), (1, 2), (1, 1)
 */
/*
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/ 

static Pair[] SortPair(Pair arr[], int n)  { 
    //enter your code here
   for(int i=0;i<n-1;i++){
       for(int j=i+1;j<n;j++){
        if(arr[i].x<arr[j].x){
       Pair temp =arr[i];
       arr[i]=arr[j];
        arr[j]=temp;
        }
         else if(arr[i].x==arr[j].x){
                  if(arr[i].y<arr[j].y){
   
       Pair temp =arr[i];
       arr[i]=arr[j];
        arr[j]=temp;
   
   }
         }
       }
   }
   return arr;
   
    }