import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        System.out.println("Escolha uma das opções de conversão:");
        System.out.println("1 - Converter de USD para BRL");
        System.out.println("2 - Converter de BRL para USD");
        System.out.println("3 - Converter de USD para ARS");
        System.out.println("4 - Converter de ARS para USD");
        System.out.println("5 - Converter de USD para CLP");
        System.out.println("6 - Converter de CLP para USD");

        int opcao = scanner.nextInt();

        System.out.println("Digite o valor que deseja converter:");
        double valor = scanner.nextDouble();

        ConversorMoedas conversor = new ConversorMoedas();
        double resultado = conversor.realizarConversao(opcao, valor);

        if (resultado != -1) {
            System.out.printf("Valor convertido: %.2f%n", resultado);
        } else {
            System.out.println("Erro ao realizar a conversão. Verifique os dados e tente novamente.");
        }
    }
}
