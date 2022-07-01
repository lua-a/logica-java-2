import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.println("insira um número:");
            double num = entrada.nextDouble();

            soma += num;
            contador += 1;
        }
        System.out.println("A soma é: " + soma);
    }
}