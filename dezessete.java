import java.util.Scanner;
public class  dezessete{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a distancia (em Km)");
        int dist= sc.nextInt();

        int min= dist*2;
        System.out.println(min +  " minutos");
    }
}