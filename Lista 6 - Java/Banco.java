public class Banco {

  public double saldo;

  public void DepositarValor(double valor) {

    saldo += valor;

    System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");

  }

  public void SacarValor(double valor) {

    if (saldo == 0) {

      System.out.println("O seu saldo não permite realizar uma operação de saque. Para isso, deposite um valor.");

    }
    if (valor <= 0) {

      System.out.println("Valor inválido para saque. Tente Novamente.");

    }

    if (valor > saldo) {

      System.out.println("Saldo insuficiente para realizar a operação");

    }

    if (valor < 5000) {

    System.out.println("Valor do saque acima do permitido.");

    }

    saldo -= valor;

    System.out.println("Saque de R$ " + valor + " realizado com sucesso.");

  }

  public void obterSaldoDisponível() {

    System.out.println("O saldo disponível é: " + saldo);

  }

}
