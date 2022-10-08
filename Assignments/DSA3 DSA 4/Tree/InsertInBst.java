/*
 * Insertion in BST
 * easy
 * Problem Statement
 * Given a BST and some keys, the task is to insert the keys in the given BST.
 * Duplicates are not inserted. (If a test case contains duplicate keys, you
 * need to consider the first occurrence and ignore duplicates).
 * Input
 * User Task:
 * Since this will be a functional problem. You don't have to take input. You
 * just have to complete the function insertInBST() that takes "root" node and
 * value to be inserted as parameter. The printing is done by the driver code.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^3
 * 1 <= node values <= 10^4
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * Output
 * Return the node of BST after insertion.
 * Example
 * Input:
 * 2
 * 3
 * 2 1 3
 * 4
 * 8
 * 2 1 3 N N N 6 4
 * 1
 * 
 * Output:
 * 1 2 3 4
 * 1 2 3 4 6
 * 
 * Explanation:
 * Testcase 1: After inserting the node 4 the tree will be
 * 2
 * / \
 * 1 3
 * \
 * 4
 * Inorder traversal will be 1 2 3 4.
 * Testcase 2: After inserting the node 1 the tree will be
 * 2
 * / \
 * 1 3
 * / \ / \
 * N N N 6
 * /
 * 4
 * Inorder traversal of the above tree will be 1 2 3 4 6.
 */
/*
// Information about the Node class
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/
static Node insertInBST(Node root,int key)
{
   // Your code here 
   Node newNode=insertInBSTRecursive(root,key);
   return newNode;
}
static Node insertInBSTRecursive(Node root,int key){
      if(root==null){
       root=new Node(key);
       return root;   
    }
    if(root.data>key){
        root.left= insertInBST(root.left,key);
    }
    if(root.data<key){
        root.right= insertInBST(root.right,key);
    }

    return root;
}

static Node insertInBSTIterative(Node root,int key){
    Node newNode= new Node(key);
    Node curNode=root;
    Node parent =null;
    while(curNode!=null){
        //at last the parent will be at leaf Node and curNode is at null.
        parent=curNode;
        if(curNode.data > key){
            curNode=curNode.left;
        }
        else
        curNode=curNode.right;
    }

    //tree is empty than this case will work
    if(parent==null){
        return newNode;
    }
    //If the new key is less than the leaf node key(parent)
    // Assign the new node to be its left child
    else if(parent.data>key){
        parent.left=newNode;
    }
    else
    //same for the right also
    parent.right=newNode;
    return root;
}