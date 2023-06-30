package ContaCorrenteClass;

public class ContaCorrente {

  /*
   * Classe Conta Corrente: Crie uma classe para implementar uma conta corrente.
   * A classe deve possuir os seguintes atributos:
   * número da conta, nome do correntista e saldo.
   * 
   * Os métodos são os seguintes: alterarNome, depósito e
   * saque; No construtor, saldo é opcional, com valor default zero e os demais
   * atributos são obrigatórios
   */

  public double numeroDaConta;
  public String nomeDoCorrentista;
  public double saldo;

  public double deposito() {

    return saldo++;

  }

  public double saque() {

    return saldo--;

  }

  public ContaCorrente(double numeroDaConta, String nomeDoCorrentista, double saldo) {

    this.numeroDaConta = numeroDaConta;
    this.nomeDoCorrentista = nomeDoCorrentista;
    this.saldo = 0.0;
  }

}
