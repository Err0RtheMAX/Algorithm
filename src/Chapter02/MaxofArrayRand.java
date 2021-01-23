package Chapter02;

import java.util.Scanner;

class RandomGame {

    public int rand(int[] a){
        int max = a[0];

        for(int i = 0; i < a.length; i++)
            if(max < a[i])
                max = a[i];

        return max;
    }
}

public class MaxofArrayRand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);
            // 1에서 1000까지의 랜덤한 수 추출하여 각 array의 배열에 배정하
            for(int j = 0; j < i ; j++)
                if(array[i] == array[j])
                    i--; // 만약 랜덤하게 생성한 수에서 중복값이 나오면 그 수에 대해서 제거하는 작업 하기
                // 중복하지 않는 랜덤한 수 생성하기
        }
        RandomGame randomGame = new RandomGame();

        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
        System.out.println("가장 큰 값은 " + randomGame.rand(array));
        // 랜덤하게 생성한 수 중에서 가장 큰 값이 무엇인지 RandomGame 클래스를 이용하여 생성된 randomGame 인스턴스의 rand 메소드를 이용하여 구하
    }
}
