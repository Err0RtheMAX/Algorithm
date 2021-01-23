package Chapter02;
import java.util.Scanner;

class Card{
    public int cardConvr(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }
}


public class CardConvRev {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.printf("변환하는 음이 아닌 정수 : ");
                no = scan.nextInt();
            } while(no < 0);

            // String change = Integer.toBinaryString(no); 10진수를 2진수로 변신
           // int change2 = Integer.parseInt(change, 2); 2진수를 10진수로 변신
            do {
                System.out.print("몇 진수로 변환?? : ");
                cd = scan.nextInt();
            } while(cd < 0);

            Card card = new Card();

            dno = card.cardConvr(no, cd, cno);

            System.out.print(cd + " 진수로는 ");
            for(int i = dno - 1; i >= 0 ; i--)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한판 더 ㄱㄱㄱ? (1 : yes, 0 : no) : ");
            retry = scan.nextInt();


        } while(retry == 1);
    }
}
