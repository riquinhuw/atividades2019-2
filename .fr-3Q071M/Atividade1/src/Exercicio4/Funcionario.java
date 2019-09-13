package Exercicio4;

/**
 * Funcionario
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas=0;
    private float valorPorHora=0;
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.nome ="Luis";
        novoFuncionario.sobrenome="Silva";
        novoFuncionario.horasTrabalhadas=10;
        novoFuncionario.valorPorHora=25.50;
        novoFuncionario.calcularSalario();
        System.out.println("Você trabalhou 8 horas extras nesse mês\nO seu saldo na verdade é:");
        novoFuncionario.incrementarHoras(8);
        novoFuncionario.calcularSalario();

    }

    //Metodos

    public String nomeCompleto(String nome,String sobrenome){
        return nome+" "+sobrenome;
    }

    public void calcularSalario() {
        System.err.println("Você trabalhou "+this.horasTrabalhadas+" horas\nVocê recebe "+this.valorPorHora+" por hora");
        System.out.println("Seu salario é de:"+this.horasTrabalhadas*this.valorPorHora);
    }
    public void incrementarHoras(int hora) {
        this.horasTrabalhadas += hora;
        System.out.println("Foi adicionado "+hora+"horas");
        System.out.println("Suas horas trabalhadas são de:"+this.horasTrabalhadas);
    }
}