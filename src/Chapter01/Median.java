package Chapter01;

class PrintClass {
    public final int Print(int a, int b, int c) {
        if(a >= b)
            if(b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
           return b;
    }
}

public class Median {
    public static void main(String[] args) {

        PrintClass printclass = new PrintClass();

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(printclass.Print(a, b, c));
    }
}
