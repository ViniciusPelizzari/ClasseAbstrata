import java.util.Scanner;

public abstract class Pessoa {

    public abstract Long codigo();

    public abstract String nome();

    public abstract String logradouro();

    public abstract String bairro();

    public abstract String cidade();

    public abstract String estado();

    public abstract String observacao();

    public Long cdg() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o código: ");
        String codigoStr = s.nextLine();
        return Long.parseLong(codigoStr);
    }

    public String nm() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String lgd() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String br() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String cdd() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String uf() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public String obs() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

}
