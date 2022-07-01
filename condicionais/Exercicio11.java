import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double preco = 2.90;
        double mediaCons = 0;
        double lucro = 0;

        System.out.println("odômetro inicio do dia:");
        double kmInicio  = entrada.nextDouble();
        System.out.println("odômetro fim do dia:");
        double kmFim  = entrada.nextDouble();
        System.out.println("combustivel gasto:");
        double combustivelGasto = entrada.nextDouble();
        System.out.println("valor recebido:");
        double valorRe = entrada.nextDouble();

        mediaCons = (kmFim - kmInicio) / combustivelGasto;
        lucro = valorRe - (combustivelGasto * preco);

        System.out.println("a média de combustivel foi de " + mediaCons + " e o lucro foi de " + lucro);
    }
}
