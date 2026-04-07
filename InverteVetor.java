import java.util.Scanner;

public class InverteVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor (n): ");
        int n = leitor.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        // Lendo o vetor X
        for (int i = 0; i < n; i++) {
            System.out.print("X[" + i + "]: ");
            X[i] = leitor.nextInt();
        }

        // Gerando o vetor Y em ordem inversa
        for (int i = 0; i < n; i++) {
            Y[i] = X[n - 1 - i];
        }

        // Exibindo o resultado
        System.out.print("Vetor Y (Inverso): ");
        for (int valor : Y) {
            System.out.print(valor + " ");
        }
    }
}
