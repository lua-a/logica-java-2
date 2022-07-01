import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double pesoIdeal = 0;

        System.out.println("digite seu sexo utilizando '1' para feminino e '2' para masculino:");
        int sexo = entrada.nextInt();
        System.out.println("digite sua altura:");
        double altura = entrada.nextDouble();

        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        }

        System.out.println(pesoIdeal); 
    }
}
