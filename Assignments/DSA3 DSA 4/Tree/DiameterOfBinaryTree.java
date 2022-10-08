/*
 * Diameter of Binary Tree
 * easy
 * Problem Statement
 * Given a Binary Tree, find diameter of it. The diameter of a tree is the
 * number of nodes on the longest path between two leaves in the tree. The
 * diagram below shows two trees each with diameter nine, the leaves that form
 * the ends of a longest path are shaded (note that there is more than one path
 * in each tree of length nine, but no path longer than nine nodes).
 * 
 * Input
 * User Task:
 * Since this will be a functional problem. You don't have to take input. You
 * just have to complete the function getDiameter() that takes "root" node as
 * parameter.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^4
 * 1 <= node values <= 10^3
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * 
 * For Custom Input:
 * First line of input should contains the number of test cases T. For each test
 * case, there will be two lines of input.
 * First line contains number of nodes N. Second line will be a string
 * representing the tree as described below:
 * The values in the string are in the order of level order traversal of the
 * tree where, numbers denote node values, and a character “N” denotes NULL
 * child.
 * Note: If a node has been declared Null using 'N', no information about its
 * children will be given further in the array.
 * Output
 * Return the diameter of the tree.
 * Example
 * Sample Input:
 * 2
 * 3
 * 1 2 3
 * 5
 * 10 20 30 40 60
 * 
 * Sample Output:
 * 3
 * 4
 * 
 * Explanation:
 * Test Case1: The tree is
 * 1
 * / \
 * 2 3
 * The diameter is of 3 length.
 * Test Case2: The tree is
 * 10
 * / \
 * 20 30
 * / \
 * 40 60
 * The diameter is of 4 length.
 */
/*
// Information about the class Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

*/
public static int getDiameter(Node root) 
{
    // Your code here
    // you can create your own helper function
    if(root==null){
        return 0;
    }
    int leftDiameter=getDiameter(root.left);
    int rightDiameter=getDiameter(root.right);
    int throughtOutDiameter=height(root.left)+height(root.right)+1;

    return Math.max(leftDiameter,Math.max(rightDiameter,throughtOutDiameter));
 }

 public static int height(Node root){
     if(root==null){
         return 0;
     }
     int leftheight=height(root.left);
     int rightheight=height(root.right);

     return Math.max(leftheight,rightheight)+1;
 }