import java.util.Scanner;
public class quinze{
public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a distancia total percorrida");
        int x= sc.nextInt();
        System.out.println("Digite o combustivel gasto");
        double y= sc.nextDouble();

        double cons= x/y;
        System.out.printf("%.3f km/l\n",cons);
        }
        }