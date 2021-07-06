import java.io.*;
public class QuickSortString {
    static String names[];
       public static void main(String[] args) throws IOException{
        QuickSortString sqs = new QuickSortString();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the strings");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        names = words;
        sqs.quickSort(0,n-1);
          System.out.println("After applying Quicksort on the strings");
        for (String  i : words) {
            System.out.println(i);
           
        }
    }
   
    void quickSort(int lower, int upper) {
        int lb = lower;
        int ub = upper;
        String pivot = names[lower + ( upper - lower) / 2];

        while (lb <= ub) {
            while (names[lb].compareToIgnoreCase(pivot) < 0) {
                lb++;
            }

            while (names[ub].compareToIgnoreCase(pivot) > 0) {
                ub--;
            }

            if (lb <= ub) {
                swap(lb, ub);
                lb++;
                ub--;
            }
        }
      
        if (lower < ub) {
            quickSort(lower, ub);
        }
        if (lb <  upper) {
            quickSort(lb,  upper);
        }
    }

    void swap(int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
}