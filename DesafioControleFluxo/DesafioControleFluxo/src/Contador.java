import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } 
        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
