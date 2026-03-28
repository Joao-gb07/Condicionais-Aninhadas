import java.util.Scanner;

public class VerificarContaEProcessamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sua conta está Ativa ou Inativa?");
        String situacaoDaConta = scan.nextLine();

        System.out.println("Tem solicitações pendentes");
        String numeroSolicitacoes = scan.nextLine();
        

        if (situacaoDaConta.equalsIgnoreCase("Ativa") || numeroSolicitacoes.equalsIgnoreCase("Sim")) {
            System.out.println("A solicitação pode ser processada");
        }
        else {
            System.out.println("A solicitação não pode ser processada");
        }

    }
}
