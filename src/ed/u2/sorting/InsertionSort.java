package ed.u2.sorting;

public class InsertionSort {
    private InsertionSort() {} // evitar instanciar la clase

    // Versión con opción de trazas
    public static void sort(int[] a, boolean trace) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int actual = a[i];       // elemento a insertar
            int j = i - 1;

            // Mover elementos mayores que key hacia la derecha
            while (j >= 0 && a[j] > actual) {
                a[j + 1] = a[j];
                j--;
            }

            // Insertar el elemento en su posición correcta
            a[j + 1] = actual;

            // Imprimir traza si está activada
            if (trace) {
                System.out.print("Iteración " + i + ": ");
                printArray(a);
            }
        }
    }

    private static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
