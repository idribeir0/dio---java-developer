package Projetos.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pedindo que o usuario insira o numero da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        //consumindo a quebra de linha
        scanner.nextLine();

        //pedindo ao usuario que insira o numero da agencia
        System.out.print("Por favor, insira o numero da agencia: ");
        String agencia = scanner.nextLine();

        ///pedindo ao usuario que insira o nome
        System.out.print("Por favor, insira o seu nome: ");
        String nome = scanner.nextLine();

        //pedindo ao usuario que insira o saldo
        System.out.print("Por favor, insira o seu saldo: ");
        Double saldo = scanner.nextDouble();

        //print da mensagem informando o usuario que a conta foi criada
        System.out.print("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");
    
        //fechando o scanner
        scanner.close();
    }
}
