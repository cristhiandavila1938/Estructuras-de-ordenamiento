# Taller 5 – Ordenación básica en Java
**Burbuja · Selección · Inserción**

**Estudiantes:** Bryan Gustavo Troya Velez - Cristhian Alexander Davila Sari   
**Docente:** Ing. Andres Navas  
**Ciclo:** Tercero  
**Fecha:** 16 de noviembre de 2025

---

Este proyecto implementa tres algoritmos clásicos de ordenación (Insertion Sort, Selection Sort y Bubble Sort) con trazas.  
Todas las salidas se muestran en consola y también se guardan automáticamente en el archivo **Salidas_Trazas.txt**.

---
### Crear una carpeta para el proyecto y clonar del repositorio
- Se crea manualmente una carpeta en la direccion que se va a trabajar.
- Clonamos el repositorio de github del proyecto con el comando:

      git clone https://github.com/cristhiandavila1938/Estructuras-de-ordenamiento.git

---


### Decisiones de diseño
- Paquete: `ed.u2.sorting`
- Clases finales con método estático:  
  `InsertionSort.sort(int[] a, boolean trace)`  
  `SelectionSort.sort(int[] a, boolean trace)`  
  `BubbleSort.sort(int[] a, boolean trace)`
- Todos los algoritmos son **in-place**.
- Parámetro `trace = true` muestra traza paso a paso.
- SelectionSort contabiliza y muestra número de swaps.
- BubbleSort implementa **corte temprano** (bandera swapped).
- Se implementó un `PrintStream` personalizado que envía la salida tanto a la consola como al archivo txt:
    
    Permite ver resultados en consola.  
    Guarda la salida automáticamente en el archivo txt.
- SortingDemo redirige automáticamente la salida a consola **y** al archivo `Salidas_Trazas.txt` (salida doble).



## Casos Borde Probados
Se incluyeron 5 casos críticos para validar comportamiento extremo:

| Caso | Arreglo | Razón |
|------|---------|-------|
| Arreglo vacío | `[]` | Verifica que los algoritmos no fallen sin elementos |
| Un elemento | `[7]` | Asegura que no haya errores de índice |
| Ordenado | `[1,2,3,4,5,6,7,8,9,10]` | Prueba mejor caso para Insertion y Bubble |
| Inverso | `[10,9,8,7,6,5,4,3,2,1]` | Prueba peor caso para todos |
| Duplicados | `[10,9,2,2,10,5,9,9,2,1]` | Evalúa estabilidad y manejo repetido |

Estos casos permiten evaluar eficiencia, estabilidad y comportamiento general.

---

## Cómo Ejecutar
Desde la carpeta del proyecto:

Se ejecuta la clase SortingDemo:
```bash
java ed.u2.sorting.SortingDemo
