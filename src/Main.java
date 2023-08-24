import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ContaTerminal cc = new ContaTerminal();

        System.out.println("Digite o Número da Conta");
        cc.setNumero(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a Agência");
        cc.setAgencia(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Nome do Cliente");
        cc.setNome(sc.nextLine());
        System.out.println("Digite o saldo");
        cc.setSaldo(Double.parseDouble(sc.nextLine()));

        System.out.println("Olá " + cc.getNome() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + cc.getAgencia() + ", " + "conta " + cc.getNumero() + " e seu saldo "
                + cc.getSaldo() + " já está disponível para saque");

    }
}