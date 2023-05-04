import java.util.Scanner;
public class cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B");
        int B = sc.nextInt();
        int Prod = A * B;
        System.out.println("Prod = " + Prod);
    }
}