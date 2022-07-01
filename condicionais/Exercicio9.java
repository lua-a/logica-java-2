import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        double soma = 0;
        int contador = 0;

        while (contador < 6) {
            System.out.println("insira um número:");
            double num = entrada.nextDouble();

            if (num < 72) {
                soma += num;
            }

            numeros.add(num);
            contador += 1;
        }

        System.out.println("os números são: " + numeros);
        System.out.println("A soma é: " + soma);
    }
}