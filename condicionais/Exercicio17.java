import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira a senha:");
        int senha = entrada.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
           System.out.println("ACESSO NEGADO"); 
        }
    }
}
