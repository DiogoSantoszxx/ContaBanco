import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        //Primeira parte
        
        System.out.println("Qual seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite os digitos de sua agencia?");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número de sua conta?");
        int conta = scanner.nextInt();

        System.out.println("Qual seu saldo?");
        float saldo = scanner.nextFloat();

        //Segunda parte resultado

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta + " e seu saldo " +saldo+ " já está disponível para saque.");

    }
}
