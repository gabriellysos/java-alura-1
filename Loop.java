import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);  //criação do scanner leitura, System.in define que será de entrada
        double mediaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.print("Que nota você dá para o filme? ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.printf("A média de avaliações é %.2f", (mediaAvaliacao/3));
    }
}
