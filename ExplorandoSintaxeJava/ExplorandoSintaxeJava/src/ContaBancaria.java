import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do saldo inicial
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        // Entrada das três transações
        System.out.print("Digite a primeira transação: ");
        double transacao1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda transação: ");
        double transacao2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira transação: ");
        double transacao3 = scanner.nextDouble();
        
        // Cálculo do saldo final
        saldo += transacao1 + transacao2 + transacao3;
        
        // Exibição do saldo final
        System.out.printf("Saldo final: %.2f\n", saldo);
        
        scanner.close();
    }
}
