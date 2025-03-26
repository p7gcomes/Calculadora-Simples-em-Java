import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de operação
        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação: ");
        
        int choice = scanner.nextInt();  // Lê a escolha do usuário

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();  // Lê o primeiro número

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();  // Lê o segundo número

        double result = 0;  // Variável para armazenar o resultado

        // Realiza a operação escolhida
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Resultado: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }""
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}
