import java.util.Scanner;

public class VerificarAcessoEAutorizacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você está autenticado?");
        String autenticado = scan.nextLine();

        System.out.println("A autorização é valida?");
        String autorizacaoValida = scan.nextLine();

        if (autenticado.equalsIgnoreCase("Sim") || autorizacaoValida.equalsIgnoreCase("Sim")) {
            System.out.println("Acesso validado!");
        }
        else{
            System.out.println("Acesso invalido!");
        }
    }
}
