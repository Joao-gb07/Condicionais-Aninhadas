import java.util.Scanner;

public class VerificarEscolaridadeExperiencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você tem diploma?");
        String nivelEscolaridade = scan.nextLine();

        System.out.println("Qual seu nível de experiência?");
        int nivelExperiencia = scan.nextInt();
        scan = new Scanner(System.in);

        if (nivelEscolaridade.equalsIgnoreCase("Sim") && nivelExperiencia >= 2) {

            System.out.println("Você é qualificado!");
        } else {
            System.out.println("Você não é qualificado.");
        }

        scan.close();
    }
}