package pratica1;

/**
 * questao3
 */
public class questao3 {

    public static void main(String[] args) {
        //double saldo = 300;
        conta conta = new conta();
        conta.deposita(100);
        conta.setLimite(100);
        

        try {
            conta.saca(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sacar(double saldo,double valor){
        if (saldo < valor) {
        throw new questao3Exception("Saldo Insuficiente, seu saldo é:"+saldo);
    } else {
        saldo-=valor;
        return saldo;
    }      

    }
}

class conta{

    double saldo;
    double limite;
    
    public conta(){
    }

    public void deposita(double valor){
        saldo=+valor;
    }

    public void setLimite(double valor){
        limite=valor;
    }

    public void saca(double valor){

        if (saldo < valor) {
        throw new questao3Exception("Saldo Insuficiente, seu saldo é:"+saldo);
    }else {
        saldo-=valor;
        
        }    
    
    }

    

}

class questao3Exception extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;//isso gerou sozinho

    public questao3Exception(String message) {
        super(message);
    }
    
}