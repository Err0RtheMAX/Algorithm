package Chapter02;

import java.io.IOException;
import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] a;
        a = new int[5];

        for(int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
