package ExercicioTres;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);
  FuncTemperatura conversor = new FuncTemperatura();

  System.out.println("Informe, por gentileza, a temperatura em fahrenheit: ");
  double temperatureCelsius = scanner.nextDouble();

  double resultNewTemp = conversor.ConvertTemperatureFahrenheit(temperatureCelsius);

  System.out.printf("A temperatura convertida é: %.2f", resultNewTemp);

  scanner.close();

  }

}
