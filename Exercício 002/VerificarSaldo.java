import java.util.Scanner;

public class VerificarSaldo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o saldo da sua conta bancárias: ");
        float saldoConta = scan.nextFloat();

        if (saldoConta < 0) {
            System.out.println("SALDO NEGATIVO !");
        }
        else if (saldoConta < 1000) {
            System.out.println("SALDO BAIXO !");
        }
        else if (saldoConta >= 1000 && saldoConta < 10000) {
            System.out.println("SALDO MÉDIO !");
        }
        else {
            System.out.println("SALDO ALTO !");
        }

    }
}
