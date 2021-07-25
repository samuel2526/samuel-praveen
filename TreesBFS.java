/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Node {
    int value;
    Node left;
    Node right;
    public Node(int val) {
        value = val;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;
}

class BinaryTreeOperations {
    public void printInOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        printInOrderTraversal(root.left);
        System.out.println(root.value);
        printInOrderTraversal(root.right);
    }
    
    public void levelOrderTraversal(Node root) {
        int height = 2;
        for(int i=1;i<=3;i++) {
            printCurrentLevel(root,i);
        }
    }
    
    public void printCurrentLevel(Node root,int level) {
        if(root == null) {
            return;
        } else {
            if(level == 1) {
                System.out.print(root.value);
            } else {
                printCurrentLevel(root.left,level-1);
                printCurrentLevel(root.right,level-1);
            }
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		BinaryTreeOperations operations = new BinaryTreeOperations();
		//operations.printInOrderTraversal(tree.root);
		operations.levelOrderTraversal(tree.root);
	}
}
