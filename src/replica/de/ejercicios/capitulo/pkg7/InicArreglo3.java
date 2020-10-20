
package replica.de.ejercicios.capitulo.pkg7;

// Fig. 7.4: InicArreglo.java
// Cálculo de los valores a colocar en los elementos de un arreglo.

public class InicArreglo3
{
    public static void main(String[] args)
    {
        final int LONGITUD_ARREGLO = 10; // declara la constante
        int[] arreglo = new int[LONGITUD_ARREGLO]; // crea el arreglo

        // calcula el valor para cada elemento del arreglo
        for (int contador = 0; contador < arreglo.length; contador++)
            arreglo[contador] = 2 + 2 * contador;

        System.out.printf("%s%8s\n", "Indice", "Valor"); // encabezados de columnas

        // imprime el valor de cada elemento del arreglo
        for (int contador = 0; contador < arreglo.length; contador++)
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
    }
 } // fin de la clase InicArreglo