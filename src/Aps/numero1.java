package Aps;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
/**
 * numero1
 * Faça um algoritmo para dado o valor de N calcular o valor de H
 * https://www.guj.com.br/t/nao-arredondar-valor/40819
 */
public class numero1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int escolha=1;
        int count=1;
        float resultado=0;
        System.out.println("Digite o numero de vezes para fazer a divisao");
        escolha = Integer.parseInt(s.nextLine());
        while (count<=escolha) {
            resultado +=  ((float) 1/count);
            count++;
        }
        System.out.println("O resultado foi:"+resultado);  
    }
}