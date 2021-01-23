package Chapter02;

public class IntArrayInit {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        // int[] a = new int[] {1, 2, 3, 4, 5};
        // 다음처럼 더욱 명확하게 표현할 수 있다.
        for(int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
