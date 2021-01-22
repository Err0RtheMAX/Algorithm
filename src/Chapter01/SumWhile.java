package Chapter01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n의 값을 입력하시오 : ");
        int n = scan.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }

        System.out.println("총 합 : " + sum);
    }
}
