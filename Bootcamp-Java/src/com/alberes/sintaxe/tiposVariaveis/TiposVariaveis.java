package com.alberes.sintaxe.anatomiaClasse;
public class TiposVariaveis {
    public static void main(String[] args) {
         //float, double -> Números fracionados. Ex.: 3.14
        //boolean ->  Lógico. Ex.: true ou false
        //String, char -> Texto. Ex.: "Texto completo", 'R'

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto2);

        int numero = 1;

        numero = 2;

        System.out.println(numero);

        String nome = "Alberes Silva";
        System.out.println(nome);

        //Constantes -> final + o nome em caixa alta
        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);
    }
}
