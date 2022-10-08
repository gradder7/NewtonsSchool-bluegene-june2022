/*
 * Deletion in BST
 * medium
 * Problem Statement
 * Given a Binary Search Tree (BST) and a node x, your task is to delete the
 * node 'x' from the BST.
 * If no node with value x exists then, do not make any changes
 * Input
 * User Task:
 * Since this will be a functional problem. You don't have to take input. You
 * just have to complete the function deletInBST() that takes "root" node and
 * the value to be deleted as parameter. The printing is done by the driver
 * code.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^3
 * 1 <= node values <= 10^4
 * 1 <= K <= 10^3
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * Output
 * Return the node of BST after deletion.
 * Example
 * Input:
 * 2
 * 3
 * 2 1 3 N N N N
 * 2
 * 9
 * 1 N 2 N 8 5 11 4 7 9 12
 * 9
 * 
 * Output:
 * 1 3
 * 1 2 4 5 7 8 11 12
 * 
 * Explanation:-
 * Fortest1:-
 * before deletion:-
 * 2
 * / \
 * 1 3
 * 
 * after deletion:-
 * 1
 * \
 * 3
 */
/*
// Information about the class
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
public static Node deleteInBST(Node root, int value) 
{
    if(root==null){
        return root;
    }
    if(root.data>value){
        root.left=deleteInBST(root.left,value);
    }

    else if(root.data<value){
        root.right=deleteInBST(root.right,value);
    }
    else{
        //if(root.data==val)
        //3 cases to do deletion deleteInBST
       // case 1-> if its aleaf Node
       if(root.left==null && root.right==null){
           return null;
       }
       //case 2 -> when we have only one child either left or right
       if(root.left==null){
           return root.right;
       }
       if(root.right==null){
           return root.left;
       }
       //if both childs are present
       //we find inorder sucessor of bst and delete it eith value;
       Node inOrderS=inOrderSucessor(root.right);
       root.data=inOrderS.data;
       root.right=deleteInBST(root.right,inOrderS.data);
    }
    return root;
}

public static Node inOrderSucessor(Node root){
    while(root.left!=null){
        root= root.left;
    }
    return root;
}