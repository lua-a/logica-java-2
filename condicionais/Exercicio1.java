import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o primeiro numero:");
        double numeroA = entrada.nextDouble();
        System.out.println("insira o segundo numero:");
        double numeroB = entrada.nextDouble();

        if(numeroA > numeroB){
            System.out.println(numeroA);
        } else if(numeroB > numeroA){
            System.out.println(numeroB);
        }else {
            System.out.println("Eles são iguais");
        }

    }
}