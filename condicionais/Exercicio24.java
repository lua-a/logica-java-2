import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double Jmaior  = 0;
        double Jmenor  = 0;
        double Gmaior   = 0;
        double Gmenor   = 0;

        System.out.println("insira a idade do javali:");
        double javaliA  = entrada.nextDouble();
        System.out.println("insira a idade do javali:");
        double javaliB  = entrada.nextDouble();
        System.out.println("insira a idade da girafa:");
        double girafaA  = entrada.nextDouble();
        System.out.println("insira a idade da girafa:");
        double girafaB  = entrada.nextDouble();


        if (javaliA > javaliB) {
            Jmaior = javaliA;
            Jmenor = javaliB;
        }
        else{
            Jmaior = javaliB;
            Jmenor =  javaliA;
        }
        if (girafaA > girafaB){
            Gmaior = girafaA;
            Gmenor = girafaB;
        }
        else {
            Gmaior = girafaB;
            Gmenor = girafaA;
        }
        System.out.println(Jmaior + Gmenor);
        System.out.println(Jmenor * Gmaior);
    }
}
