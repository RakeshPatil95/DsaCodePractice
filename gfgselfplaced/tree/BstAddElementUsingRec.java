package gfgselfplaced.tree;

class BST {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node trav = root;
        while (true) {
            if (newNode.value < trav.value) {
                if (trav.left == null) {
                    trav.left = newNode;
                    System.out.println("added node " + newNode.value);
                    return;
                } else {
                    trav = trav.left;
                }
            } else {
                if (trav.right == null) {
                    trav.right = newNode;
                    System.out.println("added node " + newNode.value);
                    return;
                } else {
                    trav = trav.right;
                }
            }
        }
    }
}

public class BstAddElementUsingRec {
    public static void main(String[] args) {
        //create an empty BST
        BST t1 = new BST();
        //Input Order for BST : 50 20 90 85 10 45 30 100 15 75 95 120 5 50

        t1.addNode(50);
        t1.addNode(20);
        t1.addNode(90);
        t1.addNode(85);
        t1.addNode(10);
        t1.addNode(45);
        t1.addNode(30);
        t1.addNode(100);
        t1.addNode(15);
        t1.addNode(75);
        t1.addNode(95);
        t1.addNode(120);
        t1.addNode(5);
        t1.addNode(50);
    }
}
