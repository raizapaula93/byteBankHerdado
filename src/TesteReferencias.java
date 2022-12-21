public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();//variável do tipo mais genérico à esquerda
        g1.setNome("Marcos");
        //String nome = g1.getNome();
        g1.setSalario(5000.0);
        //g1.autentica(2222); -> não funciona pq quem tem o método autentica é a classe filha, e n a classe pai
        //System.out.println(nome);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        ev.setSalario(2000.0);

        //polimorfismo -> trata-se de um objeto que pode ser referenciado por uma referência de mesmo tipo, ou genérica.
        // Ou seja, se temos um objeto Gerente(), a referência pode ser tanto do tipo Gerente, quanto do tipo Funcionario.
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());


    }

}
