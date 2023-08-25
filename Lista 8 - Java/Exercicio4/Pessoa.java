package Exercicio4;

public class Pessoa {

  public String nome;
  public int idade;
  public double peso;
  public double altura;

  public void envelhecer() {

    idade++;

  }

  public void engordar() {

    peso++;

  }

  public void emagrecer() {

    peso--;

  }

public void crescer(){

if(idade < 21){

altura += 0.5;

}

altura++;

}

}
