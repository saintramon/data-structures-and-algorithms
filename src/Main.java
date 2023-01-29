/**
 * This will be the main method class of the whole repository in which several data structures and algorithms will be tested and executed
 */

public class Main {
    public static void main(String[] args) {

        int[] sampleIntArray = {2, 1, 5, 3, 4, 10, 6, 8, 7, 9};
        String[] sampleStringArray = {"Benny", "Eve", "Cole", "Allen", "Demetrius" };

        SortingAlgorithms.printArray(sampleStringArray);
        System.out.println();
        SortingAlgorithms.printArray(SortingAlgorithms.selectionSort(sampleStringArray));

    }
}
