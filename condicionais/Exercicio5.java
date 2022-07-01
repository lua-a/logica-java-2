import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o primeiro número:");
        double numeroA = entrada.nextDouble();
        System.out.println("insira o segundo número:");
        double numeroB = entrada.nextDouble();

        if(numeroA > numeroB){
            System.out.println("primeiro é maior");
        } else if(numeroB > numeroA){
            System.out.println("segundo é maior");
        }else {
            System.out.println("números iguais");
        }

    }
}