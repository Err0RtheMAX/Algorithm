package Chapter02;
import java.io.IOException;
import java.util.Scanner;

class Height {
    int max = 0;

    public int maxOf(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
        }

        return max;
    }
}


public class MaxOfArray {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < height.length; i++)
            height[i] = scan.nextInt();

        Height height1 = new Height();

        System.out.println(height1.maxOf(height));

    }
}
