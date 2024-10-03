package Target;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int numero = sc.nextInt();
        sc.close();

        boolean pertence = pertenceSequenciaFibonacci(numero);
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

    }
public static boolean pertenceSequenciaFibonacci(int numero) {
    int a = 0;
    int b = 1;
    int proximo = 0;

    if (numero == a || numero == b) {
        return true;
    }
    while (proximo < numero) {
    proximo = a + b;
    a = b;
    b = proximo;
    }
    return proximo == numero;
}
}

