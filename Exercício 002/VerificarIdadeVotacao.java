import java.util.Scanner;

public class VerificarIdadeVotacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        if (idade >=16 && idade <18) {
            System.out.println("Você pode votar!");
        }
        else if (idade >=18 && idade <21) {
            System.out.println("Você pode votar e dirigir!");
        }
        else if (idade >=21) {
            System.out.println("Você pode votar, dirigir e beber.");
        }   
        else if (idade <=14) {
            System.out.println("Você não pode votar, dirigir e muito menos beber.");
        }

    }
    
}