/**
 * This class contains different sorting algorithms I currently have knowledge on
 *
 * This class also contains the method of creating a copy of the original array and a method
 * for printing an array
 *
 */
public class SortingAlgorithms {

    /**
     * This section contains the Balloon sort algorithm for integer arrays
     * Time Complexity: O(n^2)
     */
    public int[] balloonSort(int[] array){
        int[] sortedArray = copyArray(array);

        for (int i = 0; i < sortedArray.length; i++){

            for (int j = i + 1; j < sortedArray.length; j++){

                if (sortedArray[i] > sortedArray[j]){

                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;

                }
            }
        }

        return sortedArray;
    }

    /**
     * This section contains the Bubble Sort algorithm for integer arrays
     * Time Complexity: O(n^2)
     */
    public int[] bubbleSort(int[] array){
        int[] sortedArray = copyArray(array);

        for (int i = 0; i < sortedArray.length - 1; i++){
            for (int j = 0; j < sortedArray.length - i - 1; j++){
                if (sortedArray[j] > sortedArray[j+1]){
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j +1] = temp;
                }
            }
        }
        return sortedArray;
    }

    /**
     * This section contains the Selection Sort algorithm for integer arrays
     * Time Complexity: O(n^2)
     */
    public int[] selectionSort(int[] array){
        int minIndex = 0;

        int[] sortedArray = copyArray(array);

        for (int i = 0; i < sortedArray.length; i++){
            minIndex = i;

            for (int j = i + 1; j < sortedArray.length; j++){
                if (sortedArray[minIndex] > sortedArray[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[minIndex];
                sortedArray[minIndex] = temp;
            }

        }

        return sortedArray;
    }

    /**
     * This section contains the Merge Sort algorithm for integer arrays
     * Time Complexity: O(n log(n))
     */
    public int[] mergeSort(int[] array){
        int[] sorted = copyArray(array);

        if (sorted.length <= 1){
            return sorted;
        }

        int midIndex = sorted.length / 2;

        int[] left = new int[midIndex];
        int[] right = new int[sorted.length - midIndex];

        for (int i = 0; i < left.length; i++){
            left[i] = sorted[i];
        }
        for (int j = 0; j < right.length; j++){
            right[j] = sorted[midIndex + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        sorted = merge(left, right);

        return sorted;
    }
    private int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                merged[k] = left[i];
                i++;
            }else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }

    /**
     * This section contains the copy array method to manipulate the array without changing the original
     */
    public int[] copyArray(int[] array){
        int[] copiedArray = new int[array.length];

        for (int i = 0; i < array.length; ++i){
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    /**
     * This section contains the method of printing the array that I want to print
     */
    public void printArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
