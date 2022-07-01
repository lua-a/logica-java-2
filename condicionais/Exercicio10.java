import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        double soma = 0;
        double total = 0;
        int contador = 0;

        while (contador < 4) {
            System.out.println("insira um número:");
            double num = entrada.nextDouble();

            if (num > 0 && num <= 10) {
                soma += num;
                numeros.add(num);
            }
            
            contador += 1;
        }

        total = soma / numeros.size();

        if (total >= 5) {
            System.out.println("Você passou no teste");
        } else {
            System.out.println("tente novamente");
        }

    }
}
