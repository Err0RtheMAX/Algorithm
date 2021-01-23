package Chapter02;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 2; i <= n; i++) {
            int divide = 0;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }

                else
                    divide = j;
            }
            if (i == divide)
                System.out.println(i);
        }


    }
}