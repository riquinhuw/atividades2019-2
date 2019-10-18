package pratica1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * questao2
 */
public class questao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int erro=0;// para passar no catch, pq ele precisa está no escopo mais de fora, sei que dava criar um metodo e por no TRY, mas :/
        System.out.println("Eu sei dividir!");
        try {
            System.out.println("Informe o primeiro valor: ");
            int x = teclado.nextInt();
            System.out.println("Informe o segundo valor: ");
            int y = teclado.nextInt();
            erro=y;
            double r = (x/y);
            System.out.println("O resultado da divisão é "+r);
        } catch (InputMismatchException e) {
            System.out.println("Insira um numero!");
        } catch (ArithmeticException e) {
            boolean  achouOErro =false;
            
            if (erro==0) {
                System.out.println("Não podemos dividir por 0");
                achouOErro = true;
            }   
            if (!achouOErro) {
                System.out.println("O Erro não foi listado");
            }
        }
        
    }
}