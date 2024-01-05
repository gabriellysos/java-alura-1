public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.4;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println(("Filme retrô que vale a pena assistir!"));
        }

        if (incluidoNoPlano && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado.");
        } else {
            System.out.println("Você deve pagar a locação.");
        }
    }
}
