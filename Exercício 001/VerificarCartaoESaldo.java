import java.util.Scanner;

public class VerificarCartaoESaldo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você está com seu cartão de crédito?");
        String possuirCartaoCredito = scan.nextLine();

        System.out.println("Seu saldo é de quanto?");
        float saldoCartao = scan.nextFloat();

        if (possuirCartaoCredito.equalsIgnoreCase("Sim") && saldoCartao >= 50) {
            System.out.println("A compra foi aprovada");
        } else {
            System.out.println("O compra não pode ser efetuada");
        }
    }
}
