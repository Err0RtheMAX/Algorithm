package Chapter01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n까지 모두 합치기 : ");
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("총 합은 " + sum);
    }
}
