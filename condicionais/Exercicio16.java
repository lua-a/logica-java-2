import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double total = 0;

        System.out.println("insira o numero de macas:");
        double numeroMacas = entrada.nextDouble();

        if (numeroMacas >= 12) {
            total = numeroMacas * 0.25;
            System.out.println("o valor total da compra foi " + total);
        } else {
            total = numeroMacas * 0.30;
           System.out.println("o valor total da compra foi " + total); 
        }
    }
}
