package edu.njit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the heap size: ");
        int size = scanner.nextInt();
        MaxHeap heap = new MaxHeap(size);
        for(int i = 1; i <= 5; i++) {
            heap.insertElem(i);
        }
        heap.displayHeap();
    }
}
