package Chapter02;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[2] = 191;

        System.out.print("a = ");
        for(int i = 0; i < a.length; i++)
            System.out.print(" " + a[i]);

        System.out.println();
        System.out.print("b = ");

        for(int i = 0; i < b.length; i++)
            System.out.print(" " + b[i]);

        // clone 메소드를 이용하여 a배열을 복사하여 b배열로 붙어넣기 하고 b배열의 일부의 원소를 변경할 수 있다.
    }
}
