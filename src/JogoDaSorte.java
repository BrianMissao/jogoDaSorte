import java.util.Random;
import java.util.Scanner;

public class JogoDaSorte {
    private static String entradaDoUsuario;
    private static Random random = new Random();
    private static int numeroSorteado = random.nextInt(100);
    private static Scanner teclado = new Scanner(System.in);
    private static int numeroDeTentativasDoUsuario = 0;

    public static void main(String[] args) {
        int tentativaDoUsuario;
        System.out.println("Jogo da sorte.\nDigite um número de 00 a 99 (se pressionar enter sem ter digitado nada, o programa se encerrará).");
        do {
            System.out.println("Qual é o número?");
            entradaDoUsuario = teclado.nextLine();
            if (entradaDoUsuario.equals("")) {
                imprimirNumeroSorteadoESairDoJogo();
            }
            tentativaDoUsuario = Integer.parseInt(entradaDoUsuario);
            numeroDeTentativasDoUsuario++;
            if (tentativaDoUsuario < numeroSorteado) {
                System.out.println("O número é maior");
            } else if (tentativaDoUsuario > numeroSorteado) {
                System.out.println("O número é menor.");
            }
        } while (tentativaDoUsuario != numeroSorteado);
        System.out.println("Parabéns!\nVocê acertou!\nFez "+numeroDeTentativasDoUsuario+" tentativas.");
    }

    private static void imprimirNumeroSorteadoESairDoJogo() {
        System.out.println("Desistiu!\nO número era... "+numeroSorteado);
        System.exit(0);
    }
}
