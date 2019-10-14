package edu.njit;

import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    private Node root;
    private int length;

    public BinaryTree() {
        root = null;
        length = 0;
    }

    public void addItem(int data) {
        Node newNode = new Node(data);
        length++;
        if(root == null) {
            root = newNode;
        } else {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()) {
                Node currentNode = stack.pop();
                if(currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else if(currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    stack.push(currentNode.right);
                    stack.push(currentNode.left);
                }
            }
        }
    }

    public void printInOrder() {
        if(root != null) {
            Stack<Node> stack = new Stack<>();
            Node currNode = root;
            while(currNode != null || !stack.isEmpty()) {
                if(currNode != null) {
                    stack.push(currNode);
                    currNode = currNode.left;
                } else {
                    currNode = stack.pop();
                    System.out.println(currNode.data);
                    currNode = currNode.right;
                }
            }
        }
    }

    public void printPreOrder() {
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;
        while(currentNode != null || !stack.isEmpty()) {
            if(currentNode != null) {
                System.out.println(currentNode.data);
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                currentNode = currentNode.right;
            }
        }
    }

    public void printPostOrder() {
        postOrderRecur(root);
    }

    private void postOrderRecur(Node root) {
        if(root != null) {
            postOrderRecur(root.left);
            postOrderRecur(root.right);
            System.out.println(root.data);
        }
    }
}
