package Chapter02;

import java.util.Scanner;
import java.lang.*;

class ArrayEqual {

    static boolean equals(int[] a, int[] b) {
        if(a.length != b.length)
            return false;

        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("입력할 변수의 갯수 : ");
        int n = scan.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for(int i = 0; i < array1.length; i++)
            array1[i] = scan.nextInt();

        for(int i = 0; i < array2.length; i++)
            array2[i] = scan.nextInt();

        System.out.println(equals(array1, array2));
        System.out.println(array1.equals(array2));
        // java.lang.* 패키지에 있는 equals 메소드를 이용하여 두 String이 같은지 바로 확인 가능


    }
}
