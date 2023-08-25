package Exercicio5;

public class ContaCorrente {

  public String numeroDaConta;
  public String nomeDoCorrentista;
  public double saldo = 0;

  public ContaCorrente(String numeroDaConta, String nomeDoCorrentista, double saldo) {

    this.numeroDaConta = numeroDaConta;
    this.nomeDoCorrentista = nomeDoCorrentista;
    this.saldo = saldo;

  }

  public void alterarNome(String nomeDoCorrentista) {

    this.nomeDoCorrentista = nomeDoCorrentista;

  }

  public double saque(double valorASerSacado) {

    return saldo - valorASerSacado;

  }

  public double deposito(double valorASerDepositado) {

    return saldo + valorASerDepositado;

  }

}
