import java.util.Scanner;

public class dez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();


        double totalSalario = salario + vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", totalSalario);

        sc.close();
    }
}