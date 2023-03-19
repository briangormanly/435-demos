import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Random random = new Random();

        long totalPermutations = 0;

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<12; i++) {
            list.add(random.nextInt(100));
        }

        while (!isSorted(list)) {
            totalPermutations++;
            Collections.shuffle(list); 
        }

        list.forEach(i -> System.out.println(i));
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Total permutations: " + totalPermutations);
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }

    public static boolean isSorted(List<Integer> list) {
        for (int i = 0; i < (list.size() -1); i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
    
