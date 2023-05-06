import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;


        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
