import java.util.Scanner;
public class sete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do Aluno");
        Double A = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno");
        Double B = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno");
        Double C = sc.nextDouble();
        Double notaA = A * 2;
        Double notaB = B * 3;
        Double notaC = C * 5;


        Double media = (notaA + notaB  + notaC) / 10;
        System.out.printf("Media = " + media);
    }
}