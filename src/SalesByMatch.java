import java.io.*;
import java.util.*;

public class SalesByMatch {

    int sockMerchant(int n, int[] ar) {  
        int pairCount = 0;
        int sockCount = 1;
        int currentColour = 0;
        int newPairs;
        
        Arrays.sort(ar);
        for(int i = 1; i < (n-1); i++) {
            if(ar[i] == ar[currentColour]) {
                sockCount++;
                currentColour ++;
            } else if (sockCount > 1) {
                newPairs = sockCount/2;
                pairCount += newPairs;
                currentColour ++;
                sockCount = 1;
            } else {
                currentColour ++;
            }
        }
        if (sockCount > 1) {
            newPairs = sockCount/2;
            pairCount += newPairs;
        }
        return pairCount;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        SalesByMatch s = new SalesByMatch();
        int result = s.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

