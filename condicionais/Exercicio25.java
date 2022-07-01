import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o primeiro valor:");
        double numA  = entrada.nextDouble();
        System.out.println("insira o segundo valor:");
        double numB  = entrada.nextDouble();
        System.out.println("insira a operacao usando 1 = Adicao, 2 = Subtracao, 3 = Divisao, 4 = Multiplicacao:");
        int operacao  = entrada.nextInt();

        if (operacao == 1) {
            System.out.println(numA + numB);
        }
        else if (operacao == 2){
            System.out.println(numA - numB);
        }
        else if (operacao == 3){
            System.out.println(numA / numB);
        }
        else if (operacao == 4){
            System.out.println(numA * numB);
        }
    }
}
