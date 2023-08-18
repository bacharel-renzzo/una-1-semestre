package ExercicioNove;

public class FuncReverse {

  public int reversoNumero(int numero) {
    int reverso = 0;

    while (numero > 0) {

        int digito = numero % 10;
        reverso = reverso * 10 + digito;
        numero /= 10;
    }

    return reverso;
}

}
