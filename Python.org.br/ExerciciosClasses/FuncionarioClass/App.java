package FuncionarioClass;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Funcionario funcionarioUm = new Funcionario("Renzzo", 40000);
    Funcionario funcionarioDois = new Funcionario("Pedro", 2000);

    funcionarioUm.aumentarSalario(10);
    funcionarioDois.aumentarSalario(20);

    scanner.close();

  }

}
