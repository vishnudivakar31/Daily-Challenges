package edu.njit;

public class Main {

    public static void main(String[] args) {
	  BinaryTree bt = new BinaryTree();
	  for(int i = 1; i <= 5; i++) {
	      bt.addItem(i);
      }
	  bt.printInOrder();
	  System.out.println("-------------");
	  bt.printPreOrder();
	  System.out.println("-------------");
	  bt.printPostOrder();
    }
}
