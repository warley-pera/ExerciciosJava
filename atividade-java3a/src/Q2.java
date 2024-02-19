import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real qualquer: ");
        double numeroReal = scanner.nextDouble();

        int parteInteira = (int) numeroReal;

        System.out.println("A parte inteira de " + numeroReal + " é: " + parteInteira);

        scanner.close();
    }
}