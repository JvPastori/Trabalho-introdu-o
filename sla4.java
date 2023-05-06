import java.util.Scanner;
import java.lang.Math;

public class sla4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.printf("Digite o codigo do item: \n");
        int cod = s.nextInt();

        System.out.printf("Digite a quantidade desejada: \n");
        int quant = s.nextInt();

        int total;

        if (cod == 1){
            total = quant * 4;
            System.out.printf("Seu pedido foi de " + quant + " Cachorro-Quente, dando total de R$ " + total + ",00");}

        else if (cod == 2){
            total = (quant * 9)/2;
            System.out.printf("Seu pedido foi de " + quant + " X - Salada, dando total de R$ " + total + ",00");}

        else if (cod == 3){
            total = quant * 5;
            System.out.printf("Seu pedido foi de " + quant + " X - Bacon, dando total de R$ " + total + ",00");}

        else if (cod == 4){
            total = quant * 2;
            System.out.printf("Seu pedido foi de " + quant + " Torrada Simples, dando total de R$ " + total + ",00");}

        else if (cod == 5){
            total = (quant * 3) /2;
            System.out.printf("Seu pedido foi de " + quant + " Refrigerante, dando total de R$ " + total + ",00");}

        else
            System.out.printf("Ainda nao temos o codigo deste produto disponivel!");

    }
}