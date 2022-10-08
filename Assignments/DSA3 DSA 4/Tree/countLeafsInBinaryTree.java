/*
 * Count Leaves in Binary Tree
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a binary tree, count the number of leaves in it. A node having no child
 * node is called a leaf.
 * Input
 * The first line contains the integer N, denoting the number of nodes in the
 * binary tree.
 * Next N lines contain two integers, denoting the left and right child of the
 * i-th node respectively.
 * If the node doesn't have a left or right child, it is denoted by '-1'
 * 
 * 1 <= N <= 100000
 * Output
 * Print the number of leaves in the binary tree
 * Example
 * Sample Input 1:
 * 7
 * 2 4
 * 5 3
 * -1 -1
 * -1 7
 * 6 -1
 * -1 -1
 * -1 -1
 * 
 * Sample output 1:
 * 3
 * 
 * Explanation: Given binary tree
 * 1
 * / \
 * 2 4
 * / \ \
 * 5 3 7
 * /
 * 6
 * Node 3, 6, 7 are the leaves here
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }
}

class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] arr = new Node[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Node(i + 1);
        }
        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left != -1) {
                arr[i].left = arr[left - 1];
            }
            if (right != -1) {
                arr[i].right = arr[right - 1];
            }
        }
        // int x= countLeafs(arr[0]);
        int x = countLeafsIterative(arr[0]);
        System.out.println(x);
    }

    public static int countLeafs(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafs(root.left) + countLeafs(root.right);
    }

    // --------------------------------------------------

    public static int countLeafsIterative(Node root) {
        if (root == null) {
            return 0;
        }
        int countLeaf = 0;
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            Node curNode = qu.remove();
            if (curNode.left != null) {
                qu.add(curNode.left);
            }
            if (curNode.right != null) {
                qu.add(curNode.right);
            }
            if (curNode.left == null && curNode.right == null) {
                countLeaf++;
            }
        }
        return countLeaf;
    }
}