import java.util.Scanner;
import java.lang.Math;
public class treze{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("De o valor de A");
        Double A= sc.nextDouble();
        System.out.println("De o valor de B");
        Double B= sc.nextDouble();
        System.out.println("De o valor de C");
        Double C= sc.nextDouble();
        Double pi= 3.14159;
        Double triangulo= (A*C) / 2;
        Double circulo=pi * Math.pow(C,2);
        Double trapezio=(A+B)*C/2;
        Double Quadrado= Math.pow(B,2);
        Double Retangulo= A*B;



        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", Quadrado);
        System.out.printf("RETANGULO: %.3f\n", Retangulo);
    }
}