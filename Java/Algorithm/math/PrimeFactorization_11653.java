package math;

import java.io.*;

public class PrimeFactorization_11653 {

    private static final int INITIAL_FACTOR = 2;
    private static final int MIN_PRIME = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input number
        int n = Integer.parseInt(br.readLine());

        n = findAndPrintFactors(n);

        // if the remaining number is greater than 1, then it's a prime number, so print it
        if (n > MIN_PRIME) {
            System.out.println(n);
        }

        br.close();
    }

    private static int findAndPrintFactors(int number) {
        // find factors greater than or equal to 2 and print them
        for (int i = INITIAL_FACTOR; i * i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }
        return number;
    }

}