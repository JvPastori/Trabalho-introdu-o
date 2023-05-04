import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double pi = 3.14149;
        System.out.println("Digite o valor de raio");
        double raio= sc.nextDouble();
        Double A= (raio*raio) * pi;
        System.out.printf("A = %.2f" + A);
    }
}
