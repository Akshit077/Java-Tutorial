import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Reverse {

    /*
     * Complete the primeCount function below.
     */
    static int primeCount(long n) {
        int count=0;
         if(n==0||n==1)
            return 0;
        for(long i=2;i<n;i++)
        {
            if(n%i!=0)
            {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = primeCount(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
