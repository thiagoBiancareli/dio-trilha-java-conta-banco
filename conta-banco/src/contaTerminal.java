import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Pedindo para digitar no terminal
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
 
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por abrir uma conta em nosso banco, sua agência é: " + agencia + " sua conta é: " + conta + " seu saldo é: " + saldo + " já está disponível para saque");
    }

    
}
