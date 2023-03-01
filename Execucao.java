public class Execucao {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setAtividade("Desenvolvimento de Software");
        pj.setCnpj(12345678900123l);

        System.out.println("PJ - Atividade: " + pj.getAtividade() + " | CNPJ :" + pj.getCnpj());
        System.out.println(" ");
        System.out.println(pj);

        System.out.println(" ");
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(12365478901l);
        pf.setOcupacao("Desenvolvedor de Software");

        System.out.println("PF - Ocupação: " + pf.getOcupacao() + " | CPF: " + pf.getCpf());
        System.out.println(" ");
        System.out.println(pf);
    }
}
