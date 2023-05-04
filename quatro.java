import java.util.Scanner;
public class quatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B");
        int B = sc.nextInt();
        int Soma = A + B;
        System.out.println("Soma = " + Soma);
    }
}