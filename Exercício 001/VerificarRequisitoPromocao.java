import java.util.Scanner;

public class VerificarRequisitoPromocao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos anos você possui?");
        int idadePromocao = scan.nextInt();
        scan = new Scanner(System.in);
        // Renovando Estratégia de Leitura

        System.out.println("Qual é seu desempenho na empresa? (Bom, Regular ou Ruim)");
        String desempenhoFuncionario = scan.nextLine();

        if (idadePromocao >= 25 || desempenhoFuncionario.equalsIgnoreCase("Bom")) {
            System.out.println("Parabéns, você se encaixa nos critérios para Promoção.");
        } else {
            System.out.println("Infelizmente você não está elegível para promoção.");
        }

        scan.close();
    }
}
