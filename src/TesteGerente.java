public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente g1 = new Gerente();
        g1.setNome("João");
        g1.setCpf("12345678901");
        g1.setSalario(5000);
        g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean autenticou= g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
