
package replica.de.ejercicios.capitulo.pkg5;

 // Fig. 5.1: ContadorWhile.java
 // Repetición controlada con contador, con la instrucción de repetición while.

 public class ContadorWhile
 {
    public static void main(String[] args)
    {
        int contador; // declara contador
        contador = 1; // inicializa contador en 1

        while (++contador <= 10) // condición de continuación de ciclo
            System.out.printf("%d " , contador);

        contador = 1; //inicializa la variable de control

        while (contador <= 10) // condición de continuación de ciclo
        {
            System.out.printf("%d ", contador);
            ++contador; // incrementa la variable de control
        }

        System.out.println();
    }
 } // fin de la clase ContadorWhile
