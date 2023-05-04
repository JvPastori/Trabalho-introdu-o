import java.util.Scanner;
import java.lang.Math;
public class quatorze{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int MaiorAb= (A+B+ Math.abs(A-B)) /2;
        int MaiorABC= (MaiorAb+C +Math.abs(MaiorAb - C)) /2;
        System.out.println(MaiorABC + " eh o maior");
    }
}
