import java.util.Scanner;
import java.lang.Math;
public class dezesseis{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor de x1 e y1");
        double x1= sc.nextDouble();
        double y1= sc.nextDouble();
        System.out.println("Digite o valor de x2 e y2");
        double x2= sc.nextDouble();
        double y2= sc.nextDouble();

        double dist= Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("%.4f\n",dist);
        }
}

