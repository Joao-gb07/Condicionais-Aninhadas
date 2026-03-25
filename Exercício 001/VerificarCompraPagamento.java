import java.util.Scanner;

public class VerificarCompraPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("O produto está disponível no estoque?");
        String produtoEmEstoque = scan.nextLine();

        System.out.println("O pagamento foi confirmado?");
        String pagamentoConfirmado = scan.nextLine();

        if (produtoEmEstoque.equals("Sim") || produtoEmEstoque.equals("Sim")) {
            System.out.println("A compra foi finalizada");
        } 
        else {
            System.out.println("A compra não foi finalizada");
        }

    }
}
