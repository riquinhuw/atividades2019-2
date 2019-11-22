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
        double auxiliar=0;
        for (int i = 1; i < 11; i++) {// para listar de 1 a 100
            numeros.add(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i==0) {
                System.out.println("Numero:"+numeros.get(i));
                System.out.println("Fatorado:"+fatorar(numeros.get(i)));
                auxiliar = fatorar(numeros.get(i));
                somaGrandePraCaramba += numeros.get(i)/auxiliar;
                //somaGrandePraCaramba += numeros.get(i)/fatorar(numeros.get(i)*2);
                System.out.println("Somando deu:"+somaGrandePraCaramba);
            } else {
                if (i%2!=0) {
                    System.out.println("Numero:"+numeros.get(i));
                    System.out.println("Fatorado:"+fatorar(numeros.get(i)));
                    auxiliar = fatorar(numeros.get(i));
                    somaGrandePraCaramba += numeros.get(i)/auxiliar;
                    //somaGrandePraCaramba -= numeros.get(i)/fatorar(numeros.get(i)*2);
                    System.out.println(numeros.get(i)/fatorar(numeros.get(i)*2));
                    System.out.println("Subtraindo deu:"+somaGrandePraCaramba);
                } else {
                    System.out.println("Numero:"+numeros.get(i));
                    System.out.println("Fatorado:"+fatorar(numeros.get(i)));
                    auxiliar = fatorar(numeros.get(i));
                    somaGrandePraCaramba += numeros.get(i)/auxiliar;
                    //somaGrandePraCaramba += numeros.get(i)/fatorar(numeros.get(i)*2);
                    System.out.println(numeros.get(i)/fatorar(numeros.get(i)*2));
                    System.out.println("Somando deu:"+somaGrandePraCaramba);
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