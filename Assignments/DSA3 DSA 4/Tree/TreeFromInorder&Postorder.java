
/*
 * Tree from Inorder and Postorder
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given inorder and postorder traversals of a Binary Tree. The task is to
 * construct the binary tree from these traversals. It is given that 1 is the
 * root of the tree.
 * Input
 * The first line of input contains a single integer N, denoting the number of
 * nodes in the tree. The next line contains N integers denoting the inorder
 * traversal of the tree. The next line contains N integers denoting the
 * postorder traversal of the tree.
 * 
 * Constraints
 * 1 <= N <= 100000
 * Output
 * Print the preorder traversal of the given tree.
 * Example
 * Sample Input 1:
 * 8
 * 4 8 2 5 1 6 3 7
 * 8 4 5 2 6 7 3 1
 * 
 * Sample Output 1:
 * 1 2 4 8 5 3 6 7
 * 
 * Explanation:
 * For the given inorder and postorder traversal, the resultant binary tree will
 * be
 * 1
 * / \
 * 2 3
 * / \ / \
 * 4 5 6 7
 * \
 * 8
 * 
 * Sample Input 2:
 * 5
 * 9 5 2 3 4
 * 5 9 3 4 2
 * 
 * Sample Output 2:
 * 2 9 5 4 3
 * 
 * Explanation:
 * For the given inorder and postorder traversal, the resultant binary tree will
 * be
 * 2
 * / \
 * 9 4
 * \ /
 * 5 3
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inOrder[] = new int[n];
        for (int i = 0; i < n; i++) {
            inOrder[i] = sc.nextInt();
        }
        int postOrder[] = new int[n];
        for (int i = 0; i < n; i++) {
            postOrder[i] = sc.nextInt();
        }
        Node root = buildTreeFromPostAndInOrder(inOrder, postOrder, 0, n - 1, 0, n - 1);
        preOrderPrint(root);

    }

    public static Node buildTreeFromPostAndInOrder(int inOrder[], int postOrder[], int inOrderStart, int inOrderEnd,
            int postOrderStart, int postOrderEnd) {
        // base case
        if (inOrderStart > inOrderEnd) {
            return null;
        }
        // creating a new Node
        // as in post order last is always the root
        Node root = new Node(postOrder[postOrderEnd]);
        // finding the root index in inOrder
        // if we fing the index or element in inorder which is root in postOrder
        // its left side will be left of tree and vice versa.

        // int
        // rootIndexInInorder=seacrchIndexInInorder(inOrder,inOrderStart,inOrderEnd,root.data);
        int rootIndexInInorder = inOrderStart;
        for (; rootIndexInInorder <= inOrderEnd; rootIndexInInorder++) {
            if (inOrder[rootIndexInInorder] == root.data)
                break;
        }
        // finding the left tree and right tree size
        int leftTreeSize = rootIndexInInorder - inOrderStart;
        int rightTreeSize = inOrderEnd - rootIndexInInorder;

        // here we are passing the size of start and end of the post order and in order
        // tree
        // so to calculate the left and right
        root.left = buildTreeFromPostAndInOrder(inOrder, postOrder,
                inOrderStart, rootIndexInInorder - 1,
                postOrderStart, postOrderStart + leftTreeSize - 1);
        root.right = buildTreeFromPostAndInOrder(inOrder, postOrder,
                rootIndexInInorder + 1, inOrderEnd,
                postOrderEnd - rightTreeSize, postOrderEnd - 1);
        return root;

    }

    // public static int seacrchIndexInInorder(int inOrder[],int start,int end,int
    // value){
    // int i=0;
    // for(i=0;i<=end;i++){
    // if(inOrder[i]==value){
    // break;
    // }
    // }
    // return i;
    // }

    public static void preOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }
}