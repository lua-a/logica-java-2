import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("comprimento da pista:");
        double comprimentoPista = entrada.nextDouble();
        System.out.println("numero de voltas:");
        double numeroVoltas = entrada.nextDouble();
        System.out.println("reabastecimento");
        double reabastecimento = entrada.nextDouble();
        System.out.println("consumo do combustivel:");
        double consumoCombustivel = entrada.nextDouble();

        double conversao = (comprimentoPista * numeroVoltas) /1000;
        double litros = (conversao / reabastecimento) * consumoCombustivel;
        double litrosTotal = conversao * consumoCombustivel;

        System.out.println("o numero minimo para cada reabastecimento é de " + litros + " litros, " + " chegando ao total de " + litrosTotal + " litros.");
    }
}
