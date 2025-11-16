package ed.u2.sorting;

public class SelectionSort {
    private SelectionSort() {}

    public static void sort(int[] a, boolean trace) {
        int n = a.length;
        int contador = 0;

        for (int i = 0; i < n -1; i++){
            contador++;
            int min = i;

            for (int j = i + 1; j < n; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }

            if (min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }

            if (trace) {
                System.out.print("Iteración " + (i + 1) + ": ");
                printArray(a);
            }
        }
        System.out.println("Numero de iteraciones: " + contador);
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
