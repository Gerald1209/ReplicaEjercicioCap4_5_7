
package replica.de.ejercicios.capitulo.pkg7;

// Fig. 7.17: InicArreglo.java
// Inicialización de arreglos bidimensionales.

public class InicArregloBidi
{
    // crea e imprime arreglos bidimensionales
    public static void main(String[] args)
    {
        int[][] arreglo1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arreglo2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Los valores en arreglo1 por filas son");
        imprimirArreglo(arreglo1); // muestra arreglo1 por filas

        System.out.println("\nLos valores en arreglo2 por filas son \n");
        imprimirArreglo(arreglo2); // muestra arreglo2 por filas
    }

    // imprime filas y columnas de un arreglo bidimensional
    public static void imprimirArreglo(int[][] arreglo)
    {
        // itera a través de las filas del arreglo
        for (int fila = 0; fila < arreglo.length; fila++)
        {
            // itera a través de las columnas de la fila actual
            for (int columna = 0; columna < arreglo[fila].length; columna++)
            System.out.printf("%d ", arreglo[fila][columna]);

            System.out.println();
        }
    }
 } // fin de la clase InicArreglo