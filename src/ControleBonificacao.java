public class ControleBonificacao {

    private double soma;

     public void registra (Funcionario f){//mesmo que o parâmetro seja genérico, a implementação será do método específico
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }



    public double getSoma() {
        return soma;
    }
}
