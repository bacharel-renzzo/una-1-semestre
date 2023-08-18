import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Banco pessoa = new Banco();

    System.out.println("Informe, por gentileza, o seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Informe, por gentileza, o número da sua conta: ");
    double numeroDaConta = scanner.nextDouble();

    System.out.println("Informe, por gentileza, seu saldo inicial: ");
    double saldoInicial = scanner.nextDouble();

    pessoa.DepositarValor(saldoInicial);

    System.out.println("Conta bancária criada com sucesso.");

    System.out.println("###### OPERAÇÕES ######");
    System.out.println("Digite (1) para Deposíto - (2) Para Saque - (3) Para obter o saldo disponível - (4) Para finalizar a operação");

    int opcao;

    do {
      opcao = scanner.nextInt();
      switch (opcao) {

        case 1:

          System.out.println("Digite o valor que deseja depositar: ");
          double valorDeposito = scanner.nextDouble();

          pessoa.DepositarValor(valorDeposito);
          break;

        case 2:

          System.out.println("Digite o valor que deseja sacar: ");
          double valorSaque = scanner.nextDouble();

          pessoa.SacarValor(valorSaque);
          break;

        case 3:

          pessoa.obterSaldoDisponível();
          break;

      }

    } while (opcao != 4);

  }

}