package Chapter01;

import java.util.Scanner;

public class SumDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("n의 값을 입력하시오 : ");
            n = scan.nextInt();
        }while(n <= 0);

        int sum = 0;

        for(int i = 1; i <= n; i++)
            sum += i;

        System.out.println("총 합 : " + sum);
    }
}
