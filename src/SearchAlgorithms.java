/**
 * This class holds all search algorithm methods
 */
public class SearchAlgorithms {

    /**
     * Linear search concerning Integers
     * Time Complexity: O(n)
     */
    public boolean linearSearch(int key, int[] array){
        for (int i = 0; i < array.length; i++){
            if (key == array[i]){
                return true;
            }
        }
        return false;
    }


    /**
     * Binary search concerning Integers
     * Requirement: Sorted array
     * Time Complexity: O(log n)
     */
    public boolean binarySearch(int key, int[] array){
        int lowerLimit = 0;
        int upperLimit = array.length - 1;

        while (lowerLimit<= upperLimit){
            int mid = (lowerLimit + upperLimit) / 2;

            if (key == array[mid]){
                return true;
            } else if (key < array[mid]) {
                upperLimit = mid - 1;
            }else {
                lowerLimit = mid + 1;
            }
        }

        return false;
    }


}
