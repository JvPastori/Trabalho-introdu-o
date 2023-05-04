import java.util.Scanner;
public class nove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do funcionario");
        int func= sc.nextInt();
        System.out.println("Digite o numero de horas trabalhadas");
        int hour= sc.nextInt();
        System.out.println("Digite o valor recebido por horas trabalhadas");
        double value= sc.nextDouble();

        Double total= hour*value;
        System.out.println("NUMBER = " + func);
        System.out.println("SALARY = U$" + total);
    }
}