import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fim = 0;
        double menor = 0;
        double maior = 0;

        while (fim < 5){
            System.out.println("insira um número: ");
            double numero = entrada.nextDouble();
            if (fim == 0){
            menor = numero;
            maior = numero;
            }
            if (numero > maior){
            maior = numero;
            }
            else if (numero < menor){  
            menor = numero;
            }
            fim ++;
        }

        System.out.println("o maior numero foi " + maior + " e o menor foi " + menor);

    }
}
