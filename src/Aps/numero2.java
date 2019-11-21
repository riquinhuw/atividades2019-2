package Aps;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;
/**
 * numero2
 * https://www.guj.com.br/t/fatorial-java/44122/3
 */
public class numero2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        double somaGrandePraCaramba=0;
        for (int i = 1; i < 101; i++) {// para listar de 1 a 100
            numeros.add(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i==0) {
                System.out.println("Numero:"+numeros.get(i));
                System.out.println("Fatorado:"+fatorar(numeros.get(i)));
                somaGrandePraCaramba += numeros.get(i)/fatorar(numeros.get(i)*2);
            } else {
                if (i%2!=0) {
                    System.out.println("Numero:"+numeros.get(i));
                    System.out.println("Fatorado:"+fatorar(numeros.get(i)));
                    somaGrandePraCaramba -= numeros.get(i)/fatorar(numeros.get(i)*2);
                } else {
                    System.out.println("Numero:"+numeros.get(i));
                    System.out.println("Fatorado:"+fatorar(numeros.get(i)));
                    somaGrandePraCaramba += numeros.get(i)/fatorar(numeros.get(i)*2);
                }
            }
            
        }

        System.out.println("O resultado dessa coisa toda deu:"+somaGrandePraCaramba);
    }

    public static int fatorar(double numero){
        int resultado=1;
        int i =2;
        while (i<=numero) {
            resultado *=i;
            i++;
        }
        return resultado;
    }
}