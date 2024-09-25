public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Zé");
        f.setCpf("65432198725");
        f.setSalario((1998.57f));

        System.out.println("O bônus do funcionário é "+f.calcularBonus());

        Presidente p = new Presidente();
        p.setNome("Maria");
        p.setCpf("78945612302");
        p.setSalario(39878.57f);
        p.qtdAcoes = 33684;

        System.out.println("O bônus do Presidente é "+p.calcularBonus());
    }
}