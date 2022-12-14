public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Raiza");
        f1.setCpf("12345678901");
        f1.setSalario(4000);

        System.out.println(f1.getNome());
        System.out.println(f1.getBonificacao());


    }

}
