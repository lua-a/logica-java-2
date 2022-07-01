import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira a nota:");
        double provaA = entrada.nextDouble();
        System.out.println("insira a nota:");
        double provaB = entrada.nextDouble();
        System.out.println("insira a nota:");
        double provaC = entrada.nextDouble();

        if (provaB < provaC){
            provaB = provaC;
        }
        else if (provaA < provaC){
            provaA = provaC;
        }

        double media = (provaA + provaB) / 2;

        if (media >= 6) {
            System.out.println("Aprovado");
        }
        else if (media >= 3 && media < 6) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
    }
}
