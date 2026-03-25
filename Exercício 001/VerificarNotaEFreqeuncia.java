import java.util.Scanner;

public class VerificarNotaEFreqeuncia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = scan.nextInt();

        scan = new Scanner(System.in);

        // && = e
        // || = ou

        System.out.println("Digite sua frequência: ");
        String frequenciaAluno = scan.nextLine();

        if (nota >= 60 && frequenciaAluno.equals("Alta")) {
            System.out.println("Aluno Aprovado!");
        }
        else{
            System.out.println("Aluno Reprovado!");
        }


    }
}
