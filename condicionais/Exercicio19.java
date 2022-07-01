import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double pesoIdeal = 0;

        System.out.println("gols gremio:");
        int gremio = entrada.nextInt();
        System.out.println("gols internacional:");
        int inter = entrada.nextInt();


        if (gremio > inter) {
            System.out.println("gremio"); 
        } else if (inter > gremio) {
            System.out.println("internacional");
        } else {
            System.out.println("empate"); 
        }


    }
}
