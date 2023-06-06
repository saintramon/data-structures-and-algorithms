import java.lang.*;
import java.util.Random;
public class Main {

    Random rand = new Random();
    SortingAlgorithms sort = new SortingAlgorithms();
    SearchAlgorithms search = new SearchAlgorithms();

    public static void main(String[] args) {
        try{
            Main prog = new Main();
            prog.run();
        }catch(Exception e){
            System.out.println("An error occurred while executing the program");
            e.printStackTrace();
        }
        System.exit(0);
    }

    public void populateRandArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
    }

    /**
     * run() method will execute tht program
     * @throws Exception
     */
    public void run() throws Exception{
        int[] arr = new int[100];
        populateRandArr(arr);

        int key = rand.nextInt(100);
        System.out.println("KEY TO FIND: " + key);

        System.out.println("\n\nSearch by LINEAR SEARCH");
        System.out.println("Result: " + (search.linearSearch(key, arr) ? "FOUND!" : "NOT FOUND!"));

        System.out.println("\n\nSearch by BINARY SEARCH");
        System.out.println("RESULT: " + (search.binarySearch(key, sort.mergeSort(arr)) ? "FOUND!" : "NOT FOUND!"));

        System.out.println("\n\n\nORIGINAL ARRAY");
        sort.printArray(arr);


        System.out.println("\n\n\nSort by BALLOON SORT");
        sort.printArray(sort.balloonSort(arr));


        System.out.println("\n\n\nSort by BUBBLE SORT");
        sort.printArray(sort.bubbleSort(arr));


        System.out.println("\n\n\nSort by SELECTION SORT");
        sort.printArray(sort.selectionSort(arr));


        System.out.println("\n\n\nSort by MERGE SORT");
        sort.printArray(sort.mergeSort(arr));
    }


}
