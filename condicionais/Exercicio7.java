import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o primeiro número:");
        double numeroA = entrada.nextDouble();
        System.out.println("insira o segundo número:");
        double numeroB = entrada.nextDouble();
        System.out.println("insira o terceiro número:");
        double numeroC = entrada.nextDouble();
        System.out.println("insira o quarto número:");
        double numeroD = entrada.nextDouble();

        System.out.println("o primeiro número foi: " + numeroA);
        System.out.println("o último número foi: " + numeroD);

        if(numeroA > numeroB && numeroA > numeroC && numeroA > numeroD){
            System.out.println("o maior número é: " + numeroA);
        } else if(numeroB > numeroA && numeroB > numeroC && numeroB > numeroD){
            System.out.println("o maior número é: " + numeroB);
        } else if(numeroC > numeroA && numeroC > numeroB && numeroC > numeroD){
            System.out.println("o maior número é: " + numeroC);
        } else {
            System.out.println("o maior número é: " + numeroD);
        }

    }
}