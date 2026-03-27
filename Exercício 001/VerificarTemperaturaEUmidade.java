import java.util.Scanner;

public class VerificarTemperaturaEUmidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura?");
        float temperatura = scan.nextFloat();

        System.out.println("Qual a umidade do ar?");
        int umidade = scan.nextInt();
        
        if (temperatura >= 25 && umidade >= 60) {
            System.out.println("O clima é úmido e quente");
        }
        else{
            System.out.println("O clima não é úmido e nem quente");
        }
    }
}
