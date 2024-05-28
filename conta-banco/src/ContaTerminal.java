import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens par ao nosso usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        String saldo = scanner.nextLine();

        // Obter pelo Scanner os valores digitados no terminal e 
        // Concatenar strings para formar a mensagem final
        String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(numeroConta).concat(" e seu saldo ").concat(saldo).concat(" já está disponível para saque.");


        // Exibir a mensagem conta criada
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
