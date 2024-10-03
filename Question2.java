package Target;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma string:");
        String str = sc.nextLine();
        sc.close();

    int quantidade = verificaLetraA(str);
        if (quantidade > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + quantidade + " vezes na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }
    }

    public static int verificaLetraA(String str) {
        int quantidade = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
}
