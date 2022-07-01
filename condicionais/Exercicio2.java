import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um numero:");
        double numeroA = entrada.nextDouble();

        if(numeroA > 0){
            System.out.println("positivo");
        } else if(0 > numeroA){
            System.out.println("negativo");
        }else {
            System.out.println("zero");
        }

    }
}