public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
       return super.getSalario();//olho pra cima na hierarquia
    }

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
    }
}
