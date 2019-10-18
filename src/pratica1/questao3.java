package pratica1;

/**
 * questao3
 */
public class questao3 {

    public static void main(String[] args) {
        double saldo = 300;
        try {
            saldo = sacar(300,350);
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
    

    public conta(){

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