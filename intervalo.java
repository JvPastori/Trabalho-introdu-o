import java.util.Scanner;
public class intervalo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();

        if (0<a && a<=25){
            System.out.println("intervalo [0,25]");
        }else if (25<a && a<=50){
            System.out.println("Intervalo (25,50)");
        }else if (50<a && a<=75){
            System.out.println("Intervalo (50,75]");
        }else if (75<a && a<=100){
            System.out.println("Intervalo (75,100]");

        }else{
            System.out.println("Fora de intervalo");
        }









    }
}
