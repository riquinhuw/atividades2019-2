package Exercicio4;

/**
 * ContaCorente
 */
public class ContaCorente {

    private float saldo=0;
    public static void main(String[] args) {
        
        ContaCorente novaConta = new ContaCorente();
        novaConta.definirSaldoInicial(950);
        System.out.println("Você receberá um deposito pela hora extra no valor de 50 Reais\n");
        novaConta.depositar(50);
        System.out.println("Você está em débito com a CELPE, você irá sacar 145R$");
        novaConta.sacar(145);
        System.out.println("Seu débito foi quitado");
    }

    //Metodos:
    public  void definirSaldoInicial(float valor){
        saldo=valor;
        System.out.println("Seu saldo inicial é:"+saldo);
    }

    public  void depositar(float valor){
        saldo +=valor;
        System.out.println("Você recebeu um deposito de:"+valor);
        System.out.println("Seu novo saldo é:"+saldo);
    }

    public  void sacar(float valor){
        if(saldo>=valor){
            saldo -=valor;
            System.out.println("Você sacou:"+valor);
            System.out.println("Seu novo saldo é:"+saldo);
        }else{System.out.println("Saldo insuficiente");}

    }
}