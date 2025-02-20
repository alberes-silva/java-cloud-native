public class Calculadora {

   
    private double somar(double valorUm, double valorDois){
        return valorUm + valorDois;
    }

    private double subtrair(double valorUm, double valorDois){
        return valorUm - valorDois;
    }

    private double multiplicar(double valorUm, double valorDois){
        return valorUm * valorDois;
    }

    private double dividir(double valorUm, double valorDois){
        if(valorDois == 0){
            System.out.println("Divisão por zero não é permitida");
        }
        return valorUm / valorDois;
    }

    public double calcular(double valorUm, double valorDois, char operacao){
        switch (operacao) {
            case '+':
              return somar(valorUm, valorDois);
            case '-':
              return subtrair(valorUm, valorDois);
            case '*':
              return multiplicar(valorUm, valorDois);
            case '/':
              return dividir(valorUm, valorDois);
            default:
                System.out.println("Operação Ivalida");
                return 0;
        }
            
    }

}