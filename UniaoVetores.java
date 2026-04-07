import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = leitor.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];
        // O tamanho máximo da união é a soma dos dois
        int[] Z = new int[2 * n]; 
        int contZ = 0;

        // Leitura de X
        System.out.println("Preencha o vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = leitor.nextInt();
        }

        // Leitura de Y
        System.out.println("Preencha o vetor Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = leitor.nextInt();
        }

        // Adicionando elementos de X em Z (verificando duplicados)
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(Z, contZ, X[i])) {
                Z[contZ] = X[i];
                contZ++;
            }
        }

        // Adicionando elementos de Y em Z (verificando duplicados)
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(Z, contZ, Y[i])) {
                Z[contZ] = Y[i];
                contZ++;
            }
        }

        // Exibindo o vetor união Z
        System.out.print("Vetor União Z: ");
        for (int i = 0; i < contZ; i++) {
            System.out.print(Z[i] + " ");
        }
    }

    // Método auxiliar para verificar se o número já está no vetor
    public static boolean existeNoVetor(int[] vetor, int tamanhoAtual, int busca) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == busca) {
                return true;
            }
        }
        return false;
    }
}