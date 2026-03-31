import java.util.Scanner;

public class CalcularNumeroDivisivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Este número é divisível por 2 e por 3");
        } else if (numero % 2 == 0) {
            System.out.println("Esté número é divisível por 2");
        } else if (numero % 3 == 0) {
            System.out.println("Esté número é divisível por 3");
        } else {
            System.out.println("Este número não é divisível nem por 2 nem por 3");
        }

    }
}
