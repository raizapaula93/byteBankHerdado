public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;//protected publico par as classes filhas

    public Funcionario() {

    }

    //metodo sem corpo, nao ha implementacao
    //a unica forma do filho n ser obrigadoa implementar o metodo e se o filho tambem for abstrato
    //um método abstrato define apenas a assinatura (visibilidade, retorno, nome do método e parâmetros).
    public abstract double getBonificacao();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
