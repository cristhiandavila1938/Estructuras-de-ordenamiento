package ed.u2.sorting;

import java.util.Arrays;

public class SortingDemo {

    public static void main(String[] args) {

        // DATASETS del taller
        int[] A = {8, 3, 6, 3, 9};
        int[] B = {5, 4, 3, 2, 1};
        int[] C = {1, 2, 3, 4, 5};
        int[] D = {2, 2, 2, 2};
        int[] E = {9, 1, 8, 2};

        // Probar cada uno con trazas
        probar("A", A);
        probar("B", B);
        probar("C", C);
        probar("D", D);
        probar("E", E);
    }

    // Método que prueba un dataset usando insertion sort con trazas
    private static void probar(String nombre, int[] original) {
        System.out.println("\n===== PROBANDO DATASET " + nombre + " =====");

        int[] copia = Arrays.copyOf(original, original.length);

        InsertionSort.sort(copia, true); // con trazas

        System.out.println("Resultado final: " + Arrays.toString(copia));
    }
}
