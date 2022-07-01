import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o ano em que você nasceu:");
        double anoNasc = entrada.nextDouble();

        double idade = 2022 - anoNasc;

        if (idade >= 18) {
            System.out.println("pode votar");
        } else {
           System.out.println("nao poderá votar"); 
        }
    }
}
