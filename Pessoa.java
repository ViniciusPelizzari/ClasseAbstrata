import java.util.Scanner;

public abstract class Pessoa {

    public abstract Long codigo();

    public abstract String nome();

    public abstract String logradouro();

    public abstract String bairro();

    public abstract String cidade();

    public abstract String estado();

    public abstract String observacao();

    Scanner s = new Scanner(System.in);

    public Long cdg() {
        System.out.print("Digite o código: ");
        String codigoStr = s.nextLine();
        return Long.parseLong(codigoStr);
    }

    public String nm() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String lgd() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String br() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String cdd() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String uf() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String obs() {
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

}
