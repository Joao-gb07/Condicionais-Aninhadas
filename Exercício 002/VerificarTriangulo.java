import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite um valor: ");
        int valor2 = scan.nextInt();

        System.out.println("Digite um valor: ");
        int valor3 = scan.nextInt();

        if (valor1 + valor2 > valor3 && valor2 + valor3 > valor1 && valor3 + valor1 > valor2) {
            System.out.println("Isso é um triângulo");

            if (valor1 == valor2 && valor2 == valor3) {
                System.out.println("Equilátero");
            } else if (valor1 == valor2 || valor2 == valor3 || valor3 == valor1) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
