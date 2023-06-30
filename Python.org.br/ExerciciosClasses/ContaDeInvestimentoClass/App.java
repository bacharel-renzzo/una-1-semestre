package ContaDeInvestimentoClass;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    ContaInvestimento contaInvestimento = new ContaInvestimento(1000, 10);

  
    for(int i = 0; i <= 5; i++){
     contaInvestimento .adicionarJuros();
    }

    System.out.println("Novo saldo: " + contaInvestimento.getSaldo());

    scanner.close();

  }

  
}
