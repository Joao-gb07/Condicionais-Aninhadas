import java.util.Scanner;

public class CalcularImpostoRenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salário");
        float salario = scan.nextFloat();

        if (salario <= 2500) {
            System.out.println("Imposto a pagar R$ " + salario * 0);
        } else if (salario > 2500 && salario <= 4000) {
            System.out.println("Imposto a pagar R$ " + salario * 0.1);
        } else if (salario > 4000 && salario <= 6000) {
            System.out.printf("Imposto a pagar R$ %.2f\n", salario * 0.15);
        } else {
            System.out.printf("Imposto a pagar R$ %.2f\n", salario * 0.2);
        }
        scan.close();
    }
}
