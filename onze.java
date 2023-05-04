import java.util.Scanner;
public class onze {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Codigo do produto 1");
        int code1= sc.nextInt();
        System.out.println("Numero de unidades");
        int units= sc.nextInt();
        System.out.println("Valor do produto1");
        Double value1= sc.nextDouble();

        System.out.println("Codigo do produto ");
        int code2= sc.nextInt();
        System.out.println("Numero de unidades");
        int units2= sc.nextInt();
        System.out.println("Valor do produto");
        Double value2= sc.nextDouble();

        Double TotalValue=units*value1 + units2*value2;
        System.out.printf("Valor a pagar: R$ %.2f\n", TotalValue);
    }
}