 public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.4;

        //Média calculada pelas 3 notas da Jack, Paulo e Suelen
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Nota: " + media);
        String sinopse;
        sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano de lançamento:""" + anoDeLancamento;
        System.out.println(sinopse);

        int avaliacao = (int) (media/2);  // o int do lado direito do "=" é uma "solicitação de conversão", um casting sobre o resultado da operação atribuída a var
        System.out.println(avaliacao);
    }
}