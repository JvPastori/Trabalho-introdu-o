import java.util.Scanner;
import java.lang.Math;
public class sla2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double delta= b*b - 4*a*c;

        double r1= (-b + Math.sqrt(delta)) / (2*a) ;
        double r2= (-b - Math.sqrt(delta)) / (2*a);

        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
             r1= (-b + Math.sqrt(delta)) / (2*a) ;
             r2= (-b - Math.sqrt(delta)) / (2*a);

            System.out.printf("R1 = %.5f",r1);
            System.out.printf("R2 = %.5f",r2);
        }

    }
}