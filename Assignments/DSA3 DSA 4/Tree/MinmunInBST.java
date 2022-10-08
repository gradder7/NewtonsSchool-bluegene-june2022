/*
 * Minimum in BST
 * medium
 * Problem Statement
 * Given a Binary Search Tree. The task is to find the minimum element in this
 * given BST. If the tree is empty, there is no minimum element, so print -1 in
 * that case.
 * Input
 * User Task:
 * Since this will be a functional problem. You don't have to take input. You
 * just have to complete the function minValue() that takes "root" node as
 * parameter and returns the minimum value(-1 in case tree is empty). The
 * printing is done by the driver code.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^3
 * 1 <= node values <= 10^4
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * Output
 * For each testcase you need to return the minimum element in BST.
 * Example
 * Input:
 * 2
 * 5 4 6 3 N N 7 1
 * 9 N 10 N 11
 * 
 * Output:
 * 1
 * 9
 * 
 * Explanation:
 * Testcase 1: We construct the following BST by inserting given values one by
 * one in an empty BST.
 * 5
 * / \
 * 4 6
 * / \
 * 3 7
 * /
 * 1
 * 
 * The minimum value in the given BST is 1.
 * Testcase 2: We construct the following BST by inserting given values one by
 * one in an empty BST.
 * 9
 * \
 * 10
 * \
 * 11
 * The minimum value in the given BST is 9.
 */
/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
static int minValue(Node node)
 {
   // Your code here   
   if(node==null){
     return -1;
   }   
   while(node.left!=null){
     node=node.left;
   }
   return node.data;
 }