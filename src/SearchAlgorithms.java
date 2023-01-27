/**
 * This class holds all search algorithm method
 */
public class SearchAlgorithms {

    public static boolean linearSearch(int key, int[] array){
        for (int i = 0; i < array.length; i++){
            if (key == array[i]){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearch(String key, String[] array){

        for (int i = 0; i < array.length; i++){
            if(key.equals(array[i])){
                return true;
            }
        }

        return false;
    }

    public static boolean binarySearch(int key, int[] array){

        int lowerIndex = 0;
        int upperIndex = array.length - 1;
        int midIndex = (lowerIndex + upperIndex) / 2;

        while(lowerIndex <= upperIndex){
            midIndex = (lowerIndex + upperIndex) / 2;

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

    public static boolean binarySearch(String key, String[] array){

        int lowerIndex = 0;
        int upperIndex = array.length - 1;
        int midIndex = (lowerIndex + upperIndex) / 2;

        while(lowerIndex <= upperIndex){
            midIndex = (lowerIndex + upperIndex) / 2;

            if(key.compareTo(array[midIndex]) >= 1){
                lowerIndex = midIndex + 1;
            } else if (key.compareTo(array[midIndex]) <= -1) {
                upperIndex = midIndex - 1;
            } else {
                return true;
            }

        }
        return false;
    }
}
