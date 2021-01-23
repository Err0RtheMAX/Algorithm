package Chapter02;

import java.io.*;


public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {
        int temp = idx1;
        idx1 = idx2;
        idx2 = temp;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, a.length - 1 - i);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print("입력할 변수의 갯수 : ");
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d 번째로 입력할 숫자를 입력하세요. : ", i + 1);
            array[i] = Integer.parseInt(br.readLine());
        }
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        br.close();
        bw.close();
    }
}