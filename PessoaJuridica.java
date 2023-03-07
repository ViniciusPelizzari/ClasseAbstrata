import java.util.Scanner;

public class PessoaJuridica extends Pessoa {

    Scanner s = new Scanner(System.in);

    public Long cnpjj() {
        System.out.print("Digite o CNPJ: ");
        return s.nextLong();
    }

    public String atvv() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    @Override
    public Long codigo() {
        return cdg();
    }

    @Override
    public String nome() {
        return nm();
    }

    @Override
    public String logradouro() {
        return lgd();
    }

    @Override
    public String bairro() {
        return br();
    }

    @Override
    public String cidade() {
        return cdd();
    }

    @Override
    public String estado() {
        return uf();
    }

    @Override
    public String observacao() {
        return obs();
    }

    @Override
    public String toString() {
        return "PessoaJuridica {" +
                "cnpj =" + cnpjj() +
                ", atividade ='" + atvv() + '\'' +
                ", codigo =" + codigo() +
                ", nome ='" + nome() + '\'' +
                ", logradouro ='" + logradouro() + '\'' +
                ", bairro ='" + bairro() + '\'' +
                ", cidade ='" + cidade() + '\'' +
                ", estado ='" + estado() + '\'' +
                ", observacao ='" + observacao() + '\'' +
                '}';
    }

}
