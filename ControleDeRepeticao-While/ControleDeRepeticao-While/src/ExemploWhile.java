import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        double mesada = 50.0;
        int contador = 0;

        while (mesada > 0){
            double valorDoce = valorAletorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
  
            }
            System.out.println("Doce do valor: "+ valorDoce+ " Adionado no carrinho");
            mesada = mesada - valorDoce;
            contador++;
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Joãozinho comprou "+contador+" doces e gastou a sua mesada");
    }
    private static double valorAletorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
