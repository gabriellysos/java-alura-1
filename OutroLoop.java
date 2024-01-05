import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);  //criação do scanner leitura, System.in define que será de entrada
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;


        while (nota != -1) {
            System.out.print("Digite sua nota para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }

        }

        System.out.print("A média de avaliações é " + (mediaAvaliacao/totalNotas));
    }
}
