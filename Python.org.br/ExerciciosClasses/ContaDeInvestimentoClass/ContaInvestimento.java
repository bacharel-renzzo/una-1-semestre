package ContaDeInvestimentoClass;

public class ContaInvestimento {

  private double saldo;
  private double taxaJuros;

  public ContaInvestimento(double saldo, double taxaJuros) {

    this.saldo = saldo;
    this.taxaJuros = taxaJuros;

  }

  public void adicionarJuros() {

    double juros = saldo * (taxaJuros / 100);
    saldo += juros;

  }

  public double getSaldo() {

    return saldo;

  }

}
