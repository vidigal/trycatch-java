import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.next();
            cliente.setNome(nome);

            int i = 10/0;

            System.out.print("Digite a idade do cliente: ");
            cliente.setIdade(scanner.nextInt());
        } catch (InputMismatchException tme) {
            System.out.println("Exception tipo InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println("Exceção de divisão por 0");
        } catch (Exception e) {
            // Mensagem que eu mostraria para o usuário
            System.out.println("Valores fornecidos são inválidos");
            // Log do sistema para auxiliar futuras 'depurações'
            System.out.println(e);
        } finally {
            System.out.println("executa de qualquer forma");
        }

    }

}