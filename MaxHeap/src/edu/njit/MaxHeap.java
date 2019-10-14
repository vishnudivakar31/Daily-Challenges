package edu.njit;

public class MaxHeap {
    int[] data;
    int length;
    int size;

    public MaxHeap(int size) {
        data = new int[size];
        length = 0;
        this.size = size;
    }

    public void insertElem(int element) {
        if(length <= size) {
            data[length++] = element;
            maxHeap(length - 1);
        }
    }

    private void maxHeap(int index) {
        int element = data[index], root = index /2;
        while(root >= 0) {
            if(data[root] < element) {
                data[index] = data[root];
                data[root] = element;
            }
            if(root == 0) {
                root = -1;
            } else {
                root /= 2;
                element = data[root];
            }
        }
    }

    public void displayHeap() {
        for(int i = 0; i < length / 2; i++) {
            System.out.println("Root: " + data[i] + " , left: " + data[(i * 2) + 1] + " and right: " + data[(i * 2) + 2]);
        }
    }

}
