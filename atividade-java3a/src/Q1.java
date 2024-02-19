import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dinheiro que você tem na carteira em reais: ");
        double dinheiroEmReais = scanner.nextDouble();

        // Considerando a taxa de conversão de R$3,37 para US$1,00
        double taxaConversao = 3.37;
        double dolares = dinheiroEmReais / taxaConversao;

        System.out.println("Com R$" + dinheiroEmReais + " você pode comprar aproximadamente US$" + dolares);

        scanner.close();
    }
}