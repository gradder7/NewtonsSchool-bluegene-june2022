/* 
 * Magic number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
Given a number N, your task is to find the closest Magic number from the given number N.

Note:- If more than one answer exists return the minimum one
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function MagicNumber() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return a magic number closest to the given number N.
Example
Sample Input:-
8

Sample Output:-
79

Sample Input:-
900

Sample Output:-
897
 */
static int MagicNumber(int n){
    //Enter your code here
    int i=0;
    while(check(n-i)==true && check(n+i)==true){
        i++;
    }
    if(check(n-i)==false){
        return n-i;
    }
    else
    return n+i;
    
    }
    
    static boolean check(int n){
        boolean s=false;
        boolean p =false;
        while(n>0){
            if(n%10==7){
                s=true;
            }
            if(n%10==9){
                p=true;
            }
            n=n/10;
        }
        if(s && p){
            return false;
        }
        return true;
    }