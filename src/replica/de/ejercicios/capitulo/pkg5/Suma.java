
package replica.de.ejercicios.capitulo.pkg5;

// Fig. 5.5: Suma.java
 // Sumar enteros con la instrucción for.

 public class Suma
{
    public static void main(String[] args)
    {
        int total = 0;

        // total de los enteros pares del 2 al 20
        for (int numero = 2; numero <= 20; numero += 2)
        total += numero;

        System.out.printf("La suma es %d\n", total);
    }
 } // fin de la clase Suma
