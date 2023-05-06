import java.util.Scanner;

public class vinte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moeda1,moeda50,moeda25,moeda10,moeda5,moeda,resto2;
        double valor,nota100, nota50, nota20, nota10, nota5, nota2,resto;
        System.out.println("Digite o valor monetario");
        valor = sc.nextDouble();

        nota100 = valor / 100;
        resto = valor % 100;

        nota50 = resto / 50;
        resto = resto % 50;

        nota20 = resto / 20;
        resto = resto % 20;

        nota10 = resto / 10;
        resto = resto % 10;

        nota5 = resto / 5;
        resto = resto % 5;

        nota2 = resto / 2;
        resto = resto % 2;

        moeda1 = resto / 1;
        resto2= resto % 1;

        moeda50 = resto2 / 0.50;
        resto2= resto2 % 0.50;

        moeda25= resto2/ 0.25;
        resto2 = resto2 % 0.25;

        moeda10= resto2/0.10;
        resto2 = resto2 % 0.10;

        moeda5 = resto2/0.05;
        resto2 = resto2 % 0.05;

        moeda= resto2/0.01;
        resto2 = resto2 % 0.01;

        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(moeda1 + " moeda(s) de R$ 1,00");
        System.out.println(moeda50 + " moeda(s) de R$ 0,50");
        System.out.println(moeda25+ " moeda(s) de R$ 0,25");
        System.out.println(moeda10 + " moeda(s) de R$ 0,10");
        System.out.println(moeda5 + " moeda(s) de R$ 0,05");
        System.out.println(moeda + " moeda(s) de R$ 0,01 ");
    }

}