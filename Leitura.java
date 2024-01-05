import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);  //criação do scanner leitura, System.in define que será de entrada

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();  //String filme recebe a próxima linha que será digitada no scanner leitura
        System.out.print("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();   //nº inteiro anoDeLancamento recebe o próximo nº inteiro que será digitado no scanner leitura
        System.out.print("Que nota você dá para esse filme? ");
        double avaliacao = leitura.nextDouble();

        System.out.printf("%s, %d\nNota: %.1f", filme, anoDeLancamento, avaliacao);
    }
}
