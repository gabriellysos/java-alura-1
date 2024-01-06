import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cliente = "Gabrielly Soares";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        String dadosIniciais = String.format("""
                *******************************************
                DADOS INICIAIS DO CLIENTE

                Nome:              %s
                Tipo de conta:     %s
                Saldo inicial:     R$%.2f
                *******************************************
                """, cliente, tipoConta, saldo);
        System.out.println(dadosIniciais);

        String menuOpcoes = ("""
                OPERAÇÕES
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:\s""");

        while (opcao != 4) {
            System.out.print(menuOpcoes);
            opcao = input.nextInt();

            if (opcao == 1){
                System.out.printf("O saldo atual é R$%.2f\n-------------------------------------------\n\n", saldo);
            } else if (opcao == 2) {
                System.out.print("Informe o valor a receber: ");
                double valor = input.nextDouble();
                saldo += valor;
                System.out.printf("SALDO ATUALIZADO: R$%.2f\n-------------------------------------------\n\n", saldo);
            } else if (opcao == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double valor = input.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para realizar essa transferência.\n-------------------------------------------\n");
                } else {
                    saldo -= valor;
                    System.out.printf("SALDO ATUALIZADO: R$%.2f\n-------------------------------------------\n\n", saldo);
                }
            } else if (opcao != 4){
                System.out.println("OPÇÃO INVÁLIDA.\n-------------------------------------------\n");
            }
        }
    }
}
