/*
 * Delete Node in a BST
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a root node reference of a BST and a key, delete the node with the
 * given key in the BST. Return the root node reference (possibly updated) of
 * the BST.
 * Basically, the deletion can be divided into two stages:
 * 1. Search for a node to remove.
 * 2. If the node is found, delete the node.
 * Input
 * User Task:
 * Since this will be a functional problem. You don't have to take input. You
 * just have to complete the function deleteNode() that takes "root" node as
 * parameter and target value to be deleted.
 * 
 * Constraint:
 * 1<= number of nodes <= 10000
 * 1 <= node values <= 100000, each values will be distinct
 * Output
 * Return the root of binary tree after deleting key from BST.
 * Example
 * Sample Input:
 * 5 3 6 2 4 null 7
 * 3
 * Sample Output
 * 5 4 6 2 null null 7
 * 
 * Explanation:
 * Given key to delete is 3. So we find the node with value 3 and delete it.
 * 
 * 5 5
 * / \ / \
 * 3 6 ------> 4 6
 * / \ \ / \
 * 2 4 7 2 7
 */
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
*/

public static TreeNode deleteNode(TreeNode root, int key) {
          // your code here
          if(root==null){
              return root;
          }
          if(root.val>key){
              root.left=deleteNode(root.left,key);
          }
          else if(root.val>key){
              root.right=deleteNode(root.right,key);
          }
          else{
              //1
              if(root.left==null && root.right==null){
                  return null;
              }
              //2
              if(root.left==null){
                  return root.right;
              }
              if(root.right==null){
                  return root.left;
              }
              //3
              TreeNode inOrderS= inOrderSucessor(root.right);
              root.val=inOrderS.val;
              root.right=deleteNode(root.right,inOrderS.val);
          }
          return root;   
}

public static TreeNode inOrderSucessor(TreeNode root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}