/* 
 * Number of Merge
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an unsorted array of length n and must sort it using merge sort while also printing the amount of merges that occur throughout the sorting process.
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0<= n <=100000
Output
First- line should be the sorted array and the second should be the number of mergers that occurs when the array is sorted using merge sort.
Example
Sample Input:
5
5 1 2 7 3

Output:
1 2 3 5 7
4
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
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int x= sort(arr,0,n-1);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            System.out.println(x);

        }

        public static void merge(int arr[], int l , int mid,int h){
            int n1=mid-l+1;
            int n2 = h-mid;
            int left[]=new int[n1];
            int right[]=new int[n2];
            for(int i =0;i<n1;i++){
                left[i]=arr[l+i];
            }
            for(int i =0;i<n2;i++){
                right[i]=arr[mid+1+i];
            }
            int i=0,j=0,k=l;

            while(i<n1 && j<n2){
                if(left[i]<right[j]){
                    arr[k++] = left[i++];
                } else{
                    arr[k++] = right[j++];
                }
                
            }
            while(i<n1){
                    arr[k++] = left[i++];
            }

            while(j<n2){
                    arr[k++] = right[j++];
            }

        }
        public static int sort(int arr[], int l,int h){
            if(l<h){
            int mid = l+(h-l)/2;
            int leftM = sort(arr,l,mid);
            int rightM=  sort(arr,mid+1,h);
                merge(arr,l,mid,h);
                return leftM + rightM + 1;
            }
            return 0;
            
        }
        }