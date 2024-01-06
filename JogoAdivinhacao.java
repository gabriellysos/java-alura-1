import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);  //gera um número aleatório de 0 a 100
        Scanner input = new Scanner(System.in);
        int tentativas = 5;

        System.out.println("""
                Bem-vindo ao Jogo de Adivinhação!
                Tente adivinhar o número entre 0 e 100.
                ---------------------------------------""");

        while (tentativas > 0) {
            System.out.println("Tentativas disponíveis: " + tentativas);
            System.out.print("Digite seu palpite: ");
            int numEscolhido = input.nextInt();

            if (numEscolhido == numero) {
                System.out.println("\nParabéns! Você adivinhou meu número :)");
                return;
            } else if (numEscolhido < numero) {
                System.out.println("Hm, não... o número digitado é menor que o número gerado.\n");
            } else {
                System.out.println("Hm, não... o número digitado é maior que o número gerado.\n");
            }

            tentativas--;
        }

        if (tentativas == 0) {
            System.out.printf("Poxa, você esgotou suas tentativas. O número gerado era %d.", numero);
        }
    }
}
