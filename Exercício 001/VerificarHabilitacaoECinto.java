import java.util.Scanner;

public class VerificarHabilitacaoECinto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você possui CNH? ");
        String possuirHabilitacao = scan.nextLine();

        System.out.println("Você está utilizando o cinto de segurança?");
        String cintoSeguranca = scan.nextLine();

        if (possuirHabilitacao.equals("Sim") && cintoSeguranca.equals("Sim")) {
            System.out.println("Maravilha!, Você está de acordo com as normas de conduta, pode seguir sua viagem.");
        } else {
            System.out.println("Você não está de acordo com as normas de trânsito");
        }

    }
}
