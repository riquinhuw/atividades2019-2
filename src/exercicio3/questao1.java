package exercicio3;
import java.util.ArrayList;
/**
 * questao1
 * O programa deve:
 * -Calcular e exibir o consumo em quilômetros/litro para cada tanque cheio
 * -Imprimir a quilometragem combinada
 * -Soma  total  de  litros  de  combustíveis  consumidos  até  esse  ponto
 */
public class questao1 {

    public static void main(String[] args) {
        ArrayList<carro> listaCarros = new ArrayList<carro>();
        carro teste = new carro();
        boolean loop = true;
        do {
            System.out.println("Olá, esse é o veículo de numero "+(listaCarros.size()+1));
            System.out.println("Digite a quantidade de KM rodados:");
            teste.setKmPercorrido(Integer.parseInt(System.console().readLine())); 
            System.out.println("Digite a quantidade de litros consumidos");    
            teste.gasolinaConsumida(Integer.parseInt(System.console().readLine()));   
            listaCarros.add(teste);
            System.out.println("Deseja adicionar outro veículo? (S/N)");
            if(System.console().readLine().toUpperCase()=="N"){
                loop=false;
            }
        }while (loop);

    }


}

public class carro{
    private int kmPercorrido=0;
    private int gasolinaConsumida=0;

    public carro(){}
    public carro(int km,int gasolina){
        this.kmPercorrido=km;
        this.gasolinaConsumida=gasolina;
    }

    public int getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(int kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public int getGasolinaConsumida() {
        return gasolinaConsumida;
    }

    public void setGasolinaConsumida(int gasolinaConsumida) {
        this.gasolinaConsumida = gasolinaConsumida;
    }
    
    

}

