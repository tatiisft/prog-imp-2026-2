public class Main {
    public static void main(String[] args){
        // A
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        int[] u = new int[8];

        int tamU = uniao(a, 4, b, 4, u);
        System.out.println("UNIÃO");
        imprimirVetor(u, tamU);

        // B
        int[] v = {5, 2, 8, 1, 4};
        ordenar(v, 5);

        System.out.println("\nAPÓS A ORDENAÇÃO");
        imprimirVetor(v, 5);

        // C
        int[] vetor = {5, 2, 5, 3, 3, 8, 3, 8, 2};
        int[] vsr = new int[9];

        int tamVSR = gerarVetorSemRepeticao(vetor, 9, vsr);
        System.out.println("\nVETOR SEM REPETIÇÃO");
        imprimirVetor(vsr, tamVSR);

        // D
        int[] rotacao = {1, 2, 3, 4, 5};

        rotacionar(rotacao, 5, 2);
        System.out.println("\nAPÓS A ROTAÇÃO POSITIVO");
        imprimirVetor(rotacao, 5);

        rotacionar(rotacao, 5, -2);
        System.out.println("\nAPÓS A ROTAÇÃO NEGATIVO");
        imprimirVetor(rotacao, 5);
    }

    public static void imprimirVetor(int[] v, int n) {
        for (int i = 0; i < n; i += 1) {
            System.out.print(v[i] + " ");
        }
    }

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;
        for (int i = 0; i < tamA; i += 1) {
            if (buscaSequencial(u, tamU, a[i]) == -1) {
                u[tamU] = a[i];
                tamU += 1;
            }
        }
        for (int i = 0; i < tamB; i += 1) {
            if (buscaSequencial(u, tamU, b[i]) == -1) {
                u[tamU] = b[i];
                tamU += 1;
            }
        }
        return tamU;
    }

    public static int buscaSequencial(int[] v, int n, int x) {
        for (int i = 0; i < n; i += 1) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void ordenar(int[] v, int n) {
        for (int i = 1; i < n; i += 1) {
            int valor = v[i];
            int local = i - 1;
            while (local >= 0 && v[local] > valor) {
                v[local + 1] = v[local];
                local -= 1;
            }
            v[local + 1] = valor;
        }
    }

    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;
        for (int i = 0; i < tamV; i += 1) {
            if (buscaSequencial(vsr, tamVSR, v[i]) == -1) {
                vsr[tamVSR] = v[i];
                tamVSR += 1;
            }
        }
        return tamVSR;
    }


    public static void rotacionar(int[] v, int tam, int k) {
        if (k > 0) {
            for (int x = 0; x < k; x += 1) {
                int aux = v[0];
                for (int i = 0; i < tam - 1; i += 1) {
                    v[i] = v[i + 1];
                }
                v[tam - 1] = aux;
            }
        }

        if (k < 0) {
            k = -k;
            for (int x = 0; x < k; x += 1) {
                int aux = v[tam - 1];
                for (int i = tam - 1; i > 0; i -= 1) {
                    v[i] = v[i - 1];
                }
                v[0] = aux;
            }
        }
    }
}