import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC da pessoa é: " + imc);

        if (imc < 18.5) {
            System.out.println("Status: ABAIXO DO PESO");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Status: PESO IDEAL");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Status: SOBREPESO");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Status: OBESIDADE");
        } else {
            System.out.println("Status: OBESIDADE MÓRBIDA");
        }

        scanner.close();
    }
}