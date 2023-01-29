/**
 * This class contains different sorting algorithms I currently have knowledge on
 *
 * This class also contains the method of creating a copy of the original array and a method
 * for printing an array
 *
 */
public class SortingAlgorithms {

    /**
     * This section contains the balloon sort algorithm for both integers and string arrays
     */
    public static int[] balloonSort(int[] array){
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
    public static String[] balloonSort(String[] array){
        String[] sortedArray = copyArray(array);

        for (int i = 0; i < sortedArray.length; i++){
            for (int j = i + 1; j < sortedArray.length; j++){
                if (sortedArray[i].compareTo(sortedArray[j]) >= 1){
                    String temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }

    /**
     * This section contains the bubble sort algorithm for both integers and string arrays
     */
    public static int[] bubbleSort(int[] array){
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
    public static String[] bubbleSort(String[] array){
        String[] sortedArray = copyArray(array);

        for (int i = 0; i < sortedArray.length - 1; i++){
            for(int j = 0; j < sortedArray.length - i -1; j++){
                if (sortedArray[j].compareTo(sortedArray[j+1]) >= 1){
                    String temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        return sortedArray;
    }

    /**
     * This section contains the selection sort algorithm for both integers and string arrays
     */
    public static int[] selectionSort(int[] array){
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
    public static String[] selectionSort(String[] array){

        String[] sortedArray = copyArray(array);

        int minIndex;

        for (int i = 0; i < sortedArray.length; i++){
            minIndex = i;
            for (int j = i + 1; j < sortedArray.length; j++){
                if (sortedArray[minIndex].compareTo(sortedArray[j]) > 0){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                String temp = sortedArray[i];
                sortedArray[i] = sortedArray[minIndex];
                sortedArray[minIndex] = temp;
            }

        }

        return sortedArray;
    }


    /**
     * This section contains the copy array method to manipulate the array without changing the original
     */
    public static int[] copyArray(int[] array){
        int[] copiedArray = new int[array.length];

        for (int i = 0; i < array.length; ++i){
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
    public static String[] copyArray(String[] array){
        String[] copiedArray = new String[array.length];

        for (int i = 0; i < array.length; i++){
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    /**
     * This section contains the method of printing the array that I want to print
     */
    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + ", ");
        }
    }
    public static void printArray(String[] array){
        for (String i : array){
            System.out.print(i + ", ");
        }
    }
}
