/*
 * Searching an element in a sorted array
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.

Note: Use binary search to solve the problem
Input
The first line of input contains a number of test cases T. For each test case, first line of input contains a number of elements in the array, and the number K separated by space. The next line contains N elements.

Constraints:
1 <= T <= 10
1 <= N <= 100000
1 <= K <= 1000000000
1 <= arr[i] <= 1000000000

Sum of N over all test cases doesn't exceed 106
Output
For each testcase, if the element is present in the array print "1" (without quotes), else print "-1" (without quotes).
Example
Sample Input:
2
5 6
1 2 3 4 6
5 2
1 3 4 5 6

Sample Output:
1
-1
 */


static int isPresent(long arr[], int n, long k)
{
	    // Your code here
		int l=0,h=arr.length-1;
		while(l<=h){
			int mid = l+(h-l)/2;
			if(arr[mid]==k){
				return 1;
				
			}
			
			if(arr[mid]>k){
				h=mid-1;
			}
			else{
				l=mid+1;
			}
		}
		return -1;

}