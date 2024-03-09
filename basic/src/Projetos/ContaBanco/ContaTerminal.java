package Projetos.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pedindo que o usuario insira o numero da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, insira o numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, insira o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, insira o seu saldo: ");
        Double saldo = scanner.nextDouble();

    
        System.out.print("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");
    
        scanner.close();
    }
}
