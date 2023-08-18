package ExercicioOito;

public class funcSomaImposto {

  public double SomaImposto(double taxaImposto, double custo) {

    double custoNovo = custo + (custo * taxaImposto / 100);

    return custoNovo;

  }

}
