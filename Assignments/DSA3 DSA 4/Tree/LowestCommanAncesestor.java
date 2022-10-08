/*
 * Lowest Common Ancestor in a BST
 * medium
 * Problem Statement
 * Given a Binary Search Tree and 2 node value n1 and n2, your task is to find
 * the lowest common ancestor(LCA) of the two nodes given.
 * It may happen that values n1 and n2 may or may be not present.
 * 
 * Note: Duplicates are not inserted in the BST.
 * Input
 * User Task:
 * This is a function problem. You don't have to take any input. You are
 * required to complete the function LCA() that takes root node, n1, n2 as
 * parameters and returns the node that is LCA of n1 and n2.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^4
 * 1 <= node values <= 10^4
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * 
 * For Custom Input:
 * First line of input should contains the number of test cases T. For each test
 * case, there will be two lines of input.
 * First line will be a string representing the tree as described below:
 * The values in the string are in the order of level order traversal of the
 * tree where, numbers denote node values, and a character “N” denotes NULL
 * child.
 * Second line will contain the values of two nodes
 * Note: If a node has been declared Null using 'N', no information about its
 * children will be given further in the array.
 * Second line will contain the values of two nodes
 * Output
 * For each testcase, you need to return the node containing LCA of n1 and n2.
 * The driver code will print the data. If any of the node values (n1, n2) is
 * not present then return null driver code will print -1 for that.
 * Example
 * Sample Input
 * 2
 * 5 4 6 3 N N 7 N N N 8
 * 7 8
 * 2 1 3
 * 1 3
 * 
 * Sample Output
 * 7
 * 2
 * 
 * Explanation:
 * Testcase1:
 * The BST in above test case will look like
 * 5
 * / \
 * 4 6
 * / \
 * 3 7
 * \
 * 8
 * Here the LCA of 7 and 8 is 7.
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
static Node LCA(Node node, int n1, int n2) 
{
   // Your code here 
   if(node==null){
       return null;
   }
   if(node.data>n1 && node.data>n2){
       return LCA(node.left,n1,n2);
   }

    if(node.data>n1 && node.data>n2){
       return LCA(node.right,n1,n2);
   }

   return node;
}