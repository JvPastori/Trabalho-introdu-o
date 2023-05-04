import java.util.Scanner;
import java.lang.Math;
public class doze {
public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        Double raio= sc.nextDouble();
        Double pi= 3.14159;
        Double volume= (4.0/3)*3.14159*Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f\n", volume);
        }
        }