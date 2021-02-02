# numeros-pares-dio-gft
Algoritmo para mostrar números pares até um determinado número

Linguagem: Java

Desafio: Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
Entrada: 1 valor inteiro N, onde N > 0.
Saída: Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

Exemplo de entrada: 6;
Exemplo de saída: 2, 4, 6.


Algoritmo:


import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
    
      
      Scanner entrada = new Scanner(System.in);
      int i = entrada.nextInt();

      
      for (int contador=1; contador <= i; contador++) {
        if (contador%2==0) {
          System.out.println(contador);          
        }
      }
    }
}

 
