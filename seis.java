import java.util.Scanner;
public class seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do Aluno");
        Double A = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno");
        Double B = sc.nextDouble();
        Double notaA = A * 3.5;
        Double notaB = B * 7.5;

        Double media = (notaA + notaB) / 11;
        System.out.printf("Media = %.2f" + media);
    }
}