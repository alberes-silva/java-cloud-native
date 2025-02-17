import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite a sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo R$ "+saldo+"  já está disponível para saque.");
        
    }
}
