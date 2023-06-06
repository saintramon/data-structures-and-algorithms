/**
 * This class holds all search algorithm methods
 */
public class SearchAlgorithms {

    /**
     * Linear search concerning Integers
     * Time Complexity: O(n)
     */
    public static boolean linearSearch(int key, int[] array){
        for (int i = 0; i < array.length; i++){
            if (key == array[i]){
                return true;
            }
        }
        return false;
    }


    /**
     * Binary search concerning Integers
     * Time Complexity: O(log n)
     */
    public static boolean binarySearch(int key, int[] array){

        int lowerIndex = 0;
        int upperIndex = array.length - 1;

        while(lowerIndex <= upperIndex){
            int midIndex = (lowerIndex + upperIndex) / 2;

            if (key > array[midIndex]){
                lowerIndex = midIndex + 1;
            } else if (key < array[midIndex]) {
                upperIndex = midIndex - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
