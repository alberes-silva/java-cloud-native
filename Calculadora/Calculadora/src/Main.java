import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Calculadora calculadora = new Calculadora();

       System.out.println("Informe o primeiro numero: ");
       double valorUm = scanner.nextDouble();

       System.out.println("Informe o segundo numero: ");
       double valorDois = scanner.nextDouble();

       System.out.println("Informe a operação (+, -, *, /): ");
       char operacao = scanner.next().charAt(0);

       System.out.println("Resultado: "+calculadora.calcular(valorUm, valorDois, operacao));

       scanner.close();
    }
}
