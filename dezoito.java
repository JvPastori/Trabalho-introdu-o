import java.util.Scanner;
public class dezoito{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o tempo gasto na viagem(horas)");
        int time= sc.nextInt();
        System.out.println("Digite a velocidade media da  viagem (km/h");
        int vel= sc.nextInt();
        double dist= time*vel;
        double end= dist/12;
        System.out.printf("%.3f",end);
    }
}