import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySet mySet = new MySet();

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int value = scanner.nextInt();

            if (value < 0) {
                System.out.println("Encerrando...");
                break;
            }

            try {
                mySet.add(value);
                System.out.println("Conjunto Atual: " + mySet);
            } catch (DuplicateValueException | InvalidValueException | ArrayFullException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}