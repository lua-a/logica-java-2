import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double pesoIdeal = 0;

        System.out.println("insira o numero de lados :");
        int numeroLados = entrada.nextInt();

        if (numeroLados == 3){
            System.out.println("qual a medida do lado? ");
            double medida = entrada.nextDouble();
            System.out.println("TRIÂNGULO");
            System.out.println("o perímetro é: " + medida * 3);
        }
        else if (numeroLados == 4){
            System.out.println("qual a medida do lado? ");
            double medida = entrada.nextDouble();
            System.out.println("QUADRADO");
            System.out.println("o área é: " + medida * medida);
        }
        else if (numeroLados == 5){
            System.out.println("PENTÁGONO");
        }
        else if (numeroLados < 3){
            System.out.println("NÃO É UM POLÍGONO");
        }
        else if (numeroLados > 5){
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
    }

}
