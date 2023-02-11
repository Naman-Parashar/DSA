package Heap;

import java.util.ArrayList;

public class Heap {
    private static void swap(ArrayList<Integer> arr,int i , int largest){
        int temp = arr.get(largest);
        arr.set(largest, arr.get(i));
        arr.set(i, temp);
    }
    private static void maxHeapify(ArrayList<Integer> arr, int i) {
        int largest = i;
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        if (leftChildIndex <  arr.size() && arr.get(leftChildIndex) > arr.get(largest))
            largest = leftChildIndex;
        if (rightChildIndex <  arr.size() && arr.get(rightChildIndex) > arr.get(largest))
            largest = rightChildIndex;

        if (largest != i) {
            swap(arr,i,largest);
            maxHeapify(arr, largest);
        }
    }


}
