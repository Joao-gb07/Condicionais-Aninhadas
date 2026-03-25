import java.util.Scanner;

public class VerificarNacionalidadeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        //Renovar estratégia de leitura
        scan = new Scanner(System.in);


        System.out.println("Digite sua Nacionalidade: ");
        String nacionalidade = scan.nextLine();
        //&& = e 
        // || = ou

        if (idade >= 18 && nacionalidade.equals("Brasileiro")) {
            System.out.println("Acesso liberado!");
        }
        else{
            System.out.println("Acesso negado!");
        }

    }
}
