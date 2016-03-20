package Sorting;
public class BubbleSort {
    /**
     * bubbleSort sorts an array of integers using bubble sort
     * 
     * @param unsortedArray	an unsorted array of integers
     * @return the input array, sorted least to greatest
     */
    public static int[] bubbleSort(int[] unsortedArray) {
        int len = unsortedArray.length;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 1; i < len; i++) {
                // if this pair is out of order
                if (unsortedArray[i-1] > unsortedArray[i]) {
                    // swap them
                    int tmp = unsortedArray[i-1];
                    unsortedArray[i-1] = unsortedArray[i];
                    unsortedArray[i] = tmp;
                    swapped = true;
                }
            }
            len -= 1; // optimizes the for loop iteration
        }
        return unsortedArray;
    }
}
