package com.alberes.sintaxe.operadores;

public class Operadores {
    public static void main(String[] args) {
        //Operador de atribuição ( = )

        //Ex.: 
        //String nome = "Alberes Silva";
        //int numero = 20;
        //char sexo = 'M';
        //Date daraNascimento = new Date(); -> classes

        //Operadores Aritmétricos + (soma), - (subtração), * (Multiplicação), / (divisão)

        System.out.println("---------- Operadores Aritmétricos ----------");

        double resultado = (54 * 5) + (21 - 7) / 2;
        System.out.println(resultado);

        String nome = "Alberes";
        String sobreNome = "Silva";
        String nomeCompleto = nome + " " + sobreNome;
        System.out.println(nomeCompleto);

        //Operador unário ( + ) Positvo, ( - )Negativo, ( ++ ) incremento, ( -- )decremento
        System.out.println("---------- Operador unário ----------");

        int num = 5;
        num = -num;
        System.out.println(- num);
        System.out.println(num);

        int valor = 3;
        int contador = 0;

        //num = num + 1;
        num++;

        while(contador < valor){
            System.out.println(contador);
            contador++;
        }

        //Operador termário
        System.out.println("---------- Operador termário ----------");
        int x = 9;

        String y = x > 10 ? "Verdadeiro" : "Falso";
        System.out.println(y);

        //Operadores Relacionais (==, !=, >, < , >=, <=)
        System.out.println("---------- Operadores Relacionais ----------");

        int teste = 10;
        int teste2 = 20;

        boolean resultado2 = teste == teste2;
        System.out.println(resultado2);

        boolean resultado3 = teste != teste2;
        System.out.println(resultado3);

        boolean resultado4 = teste > teste2;
        System.out.println(resultado4);

        boolean resultado5 = teste < teste2;
        System.out.println(resultado5);

        boolean resultado6 = teste >= teste2;
        System.out.println(resultado6);

        boolean resultado7 = teste <= teste2;
        System.out.println(resultado7);

        //Quando for utilizador operadores ralcionais para objetos usar equals
        System.out.println("---------- equals ----------");
        String nome3 = "Alberes";
        String nome4 = new String("Alberes");

        System.out.println(nome3.equals(nome4));


        System.out.println("---------- Operadores Lógico ----------");
        //Operadores Lógicos (&&, ||, not)
        boolean condicao = false;
        boolean condicao2 = true;

        if(condicao && condicao2){
            System.out.println("As duas condições são falsa");
        } 
        System.out.println("Fim");

        if (condicao || condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } 

        System.out.println("Fim");
    }
}
