package BombaCombustivel.CarroClass;

import java.util.Scanner;

public class BombaCombustivel {

  Scanner scanner = new Scanner(System.in);

  private String tipoCombustivel;
  private double valorLitro = 5;
  private double quantidadeCombustivel;

  public String getTipoCombustivel() {

    return tipoCombustivel;

  }

  public double getValorLitro() {

    return valorLitro;

  }

  public double getQuantidadeCombustivel() {

    return quantidadeCombustivel;

  }

  public void setTipoCombustivel(String tipoCombustivel) {

    this.tipoCombustivel = tipoCombustivel;

  }

  public void setValorLitro(double valorLitro) {

    this.valorLitro = valorLitro;

  }

  public void setQuantidadeCombustivel(double quantidadeCombustivel) {

    this.quantidadeCombustivel = quantidadeCombustivel;

  }

  public void abastecerPorValor() {

    System.out.println("Informe, por gentileza, o valor em reais que você deseja abastecer: ");
    double valorASerAbastecido = scanner.nextDouble();

    double quantidadeDeLitrosVeiculo = valorASerAbastecido / valorLitro;
    System.out.println("A quantidade de litros que você colocou no carro é: " + quantidadeDeLitrosVeiculo);

  }

  public void abastecerPorLitro() {

    System.out.println("Informe, por gentileza, a quantidade de litros que você deseja abastecer: ");
    double quantidadeLitros = scanner.nextDouble();

    double precoASerPago = quantidadeLitros / valorLitro;

    System.out.println("O valor a ser pago é: " + precoASerPago);

  }

  public void alterarValor(double novoValorLitro) {

    this.valorLitro = novoValorLitro;

  }

  public void alterarCombustivel(String tipoDoCombustivel) {

    switch (tipoDoCombustivel) {

      case "A":
        this.tipoCombustivel = tipoDoCombustivel;
        System.out.println("O tipo escolhido de combustível é: Álcool");
        break;

      case "G":
        this.tipoCombustivel = tipoDoCombustivel;
        System.out.println("O tipo escolhido de combustível é: Gasolina");
        break;

    }

  }

  public void alterarQuantidadeCombustivel(double valorAlterarQuantidadeCombustivel) {

    this.quantidadeCombustivel = valorAlterarQuantidadeCombustivel;

  }

}
