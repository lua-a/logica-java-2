import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valor = 18230;

        System.out.println("insira o número de parcelas: ");
        double parcelas = entrada.nextDouble();

        double precoParcelas = valor / parcelas;

        System.out.println(precoParcelas);

    }
}
