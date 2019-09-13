/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author riquinhuw
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int escolha = 0;
        float num1 =0,num2=0,num3=0,num4=0,num5=0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escolha a ativiade:\n1-Divisão\n2-Media de 4 notas\n3-Salario");
        System.out.print("Escolha:");
        escolha = Integer.parseInt(s.nextLine());
        switch(escolha){
        
        case 1:
            System.out.println("com um Print só:");
            System.out.println("1 2 3 4");
            System.out.println("Com vários:");
            System.out.printf("1 ");
            System.out.printf("2 ");
            System.out.printf("3 ");
            System.out.printf("4 ");
        break;
        case 2:
            System.out.println("Digite o primeiro numero");
            num1 = s.nextFloat();
            System.out.println("Digite o primeiro numero");
            num2 = s.nextFloat();
            System.out.println("A Soma foi:"+(num1+num2));
            System.out.println("A Subtração foi:"+(num1-num2));
            System.out.println("A Divisão foi:"+(num1/num2));
            System.out.println("A Multiplicação foi:"+(num1*num2));
            System.out.println("O Restou foi de:"+(num1/num2));
            num1=0;
            num2=0;
        break;
        case 3:
        System.out.println("Digite o primeiro numero");
        num1 = s.nextFloat();
        System.out.println("Digite o segundo numero");
        num2 = s.nextFloat();
        
        if(num1>num2)
        {
            System.out.println("O numero:"+num1+"é maior que"+num2);
        }else{
            if (num1<num2) {
                System.out.println("O numero:"+num2+"é maior que"+num1);
            } else {
                System.out.println("O numero:"+num1+"é igual ao"+num2);
            }
        }
        num1=0;
        num2=0;           
        break;        

        case 4:
        System.out.println("Digite o primeiro numero");
        num1 = s.nextFloat();
        System.out.println("Digite o segundo numero");
        num2 = s.nextFloat();
        System.out.println("Digite o terceiro numero");
        num2 = s.nextFloat();

        System.out.println("A Soma foi:"+(num1+num2+num3));
        System.out.println("A media foi:"+((num1+num2+num3)/3));
        System.out.println("A Multiplicação foi:"+(num1*num2*num3));
        System.out.println("O Restou foi de:"+(num1/num2));
        if(num1>num2){
            if (num1>num3) {
                num5 =num1; // maior de todos
            } else {
                num4=num1;  //segundo maior
            }
        }else{
            if (num1>num3) {
                num4=num1;//menor que o 2 maior que o 3
            }else{//o numero 1 é o menor de todos
                if(num2>num3){//2 é o maior de todos, logo o 3 é o seugndo
                    num5=num2;
                    num4=num3;
                }else{num5=num3;num4=num2;}// o 3 foi maior de todos
            }
        }

        num1=0;
        num2=0;
        num3=0;
        num4=0;//segundo maior
        num5=0;//maior

        break;

        case 5:
        double raio = 0;
        System.out.println("Digite o raio");
        raio = s.nextDouble();
        System.out.println("O diametro é:"+raio*raio);
        System.out.println("A área é:"+Math.PI*Math.pow(raio, 2));
        break;


        case 6:
        System.out.println("Digite o primeiro numero");
        num1 = s.nextFloat();
        if (num1%2==0) {
            System.out.println("Ele é par");
        } else {
            System.out.println("Ele é impar");
        }

        num1=0;
        break;


        case 8:
        System.out.println("Digite o nome:");
        String nome = s.nextLine();
        System.out.println("Digite o sobrenome:");
        String sobrenome = s.nextLine();
        System.out.println("Seu nome completo é:"+nome+sobrenome);


        break;

        case 9:
        ArrayList<Float> positivos = new ArrayList<Float>();
        ArrayList<Float> negativos = new ArrayList<Float>();
        ArrayList<Float> zeros = new ArrayList<Float>();
        
        for (int i = 0; i < 5; i++) {// ver se tem arraylist
            System.out.println("Digite o "+i+"º numero");
            num1 = s.nextFloat();
            if(num1>0){
                positivos.add(num1);
            }else{
                if (num1<0) {
                   negativos.add(num1);
                    
                } else {
                    zeros.add(num1);
                }
            }
        }
        System.out.println("Tivemos "+positivos.size()+" positivos");
        System.out.println("Sendo eles:");
        for (float x: positivos) {
            System.out.println(x);
        }
        System.out.println("Tivemos "+negativos.size()+" negativos");
        for (float y : negativos) {
            System.out.println(y);
        }
        System.out.println("Tivemos "+zeros.size()+" zeros");

        num1=0;
        break;
        

        default:
            System.out.println("\nOPÇÃO INVALIDA\nFIM DO ALG");
        break;
    }
    }
    
}
