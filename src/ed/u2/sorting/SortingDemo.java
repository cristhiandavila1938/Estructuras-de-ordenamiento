package ed.u2.sorting;

import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) throws IOException {

        PrintWriter archivo = new PrintWriter(new FileWriter("Salidas_Trazas.txt"));
        PrintStream consola = System.out;
        PrintStream salidaDoble = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                consola.write(b);
                archivo.write(b);
            }
        });

        System.setOut(salidaDoble);


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

        System.out.println("\n Se ha guardado correctamente en Salidas_Trazas.txt");
        archivo.close();

    }

    // Método que prueba un dataset usando insertion, selection y bubble sort con trazas
    private static void probar(String nombre, int[] original) {
        System.out.println("\n===== PROBANDO DATASET " + nombre + " =====");

        int[] copiaInsertion = Arrays.copyOf(original, original.length);
        int[] copiaSelection = Arrays.copyOf(original, original.length);
        int[] copiaBubble = Arrays.copyOf(original, original.length);

        System.out.println("\n ----- Metodo InsertionSort -----");
        InsertionSort.sort(copiaInsertion, true); // con trazas
        System.out.println("Resultado final: " + Arrays.toString(copiaInsertion));

        System.out.println("\n----- Metodo SelectionSort -----");
        SelectionSort.sort(copiaSelection, true);
        System.out.println("Resultado final: " + Arrays.toString(copiaSelection));

        System.out.println("\n----- Metodo BubbleSort -----");
        BubbleSort.sort(copiaBubble, true);
        System.out.println("Resultado final: " + Arrays.toString(copiaBubble));
    }
}
