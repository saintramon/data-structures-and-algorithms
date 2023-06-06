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
            arr[i] = rand.nextInt(100000);
        }
    }

    /**
     * run() method will execute tht program
     * @throws Exception
     */
    public void run() throws Exception{
        int[] arr = new int[100];
        populateRandArr(arr);

        System.out.println("ORIGINAL ARRAY");
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
