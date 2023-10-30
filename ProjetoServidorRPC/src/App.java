import java.util.Scanner;

public class App extends Calculadora {
    public static void main(String[] args) throws Exception {
        
        new ServidorRPC();

        Scanner menu = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = menu.nextInt();
           

            switch (escolha) {
                case 1:
                    System.out.println("Coloque os números a serem Somados:");
                    int x = menu.nextInt();
                    int y = menu.nextInt();
                    int resultadoAdicao = new App().adicao(x, y);
                    System.out.println("Resultado da Adição: " + resultadoAdicao);
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2.");
                    // Coloque o código da segunda opção aqui.
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3.");
                    // Coloque o código da terceira opção aqui.
                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4.");
                    break;

                case 5:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (escolha != 5);

        menu.close();

    }
}        



        

 