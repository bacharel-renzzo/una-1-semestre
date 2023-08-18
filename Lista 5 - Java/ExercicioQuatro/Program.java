package ExercicioQuatro;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    MediaAritmetica mediaAritmetica = new MediaAritmetica();
    MediaGeometrica mediaGeometrica = new MediaGeometrica();
    MediaHarmonica mediaHarmonica = new MediaHarmonica();

    System.out.println(
        "Informe, por gentileza, a operacao que você deseja realizar: (1 - MÉDIA ARITMÉTICA) (2 - MÉDIA HARMONICA) (3 - MEDIA GEOMÉTRICA): ");
    int opcao = scanner.nextInt();

    switch (opcao) {

      case 1:
        System.out.println("Informe, por gentileza, o primeiro número: ");
        double n1ma = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o segundo número: ");
        double n2ma = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o terceiro número: ");
        double n3ma = scanner.nextDouble();

        double resultMa = mediaAritmetica.CalcularMediaAritmetica(n1ma, n2ma, n3ma);

        System.out.println("O resultado da média aritmética dos três números informados é: " + resultMa);

      case 2:

        System.out.println("Informe, por gentileza, o primeiro número: ");
        double n1mh = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o segundo número: ");
        double n2mh = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o terceiro número: ");
        double n3mh = scanner.nextDouble();

        double resultMh = mediaHarmonica.calcularMediaHarmonica(n1mh, n2mh, n3mh);

        System.out.println("O resultado da média harmônica dos três números informados é: " + resultMh);

      case 3:

        System.out.println("Informe, por gentileza, o primeiro número: ");
        double n1mg = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o segundo número: ");
        double n2mg = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o terceiro número: ");
        double n3mg = scanner.nextDouble();

        double resultMg = mediaGeometrica.calcularMediaGeometrica(n1mg, n2mg, n3mg);

        System.out.println("O resultado da média geométrica dos três números é: " + resultMg);

    }

    scanner.close();

  }

}
