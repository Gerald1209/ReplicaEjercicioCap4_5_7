/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replica.de.ejercicios.capituto.pkg4;

/**
 *
 * @author Janine
 */
import java.util.Scanner;
public class PromedioClase {
	public static void main(String[] args)
	{
            Scanner entrada = new Scanner(System.in);
            int total = 0;
            int contadorCalificaciones = 1;
            while (contadorCalificaciones <= 10) // itera 10 veces
            {
                System.out.print("Escriba la calificacion:"); // indicador
                int calificacion = entrada.nextInt(); // recibe siguiente calificación de entrada
                total = total + calificacion; // suma calificación al total
                contadorCalificaciones = contadorCalificaciones + 1; // incrementa el contador en 1      
                
            }
            int promedio = total / 10; // la división de enteros produce resultado entero

            // muestra el total y el promedio de las calificaciones
            System.out.printf("\nEl total de las 10 calificaciones es %d\n", total);
            System.out.printf("El promedio de la clase es %d\n", promedio);
        } // fin de main
    } // fin de la clase PromedioClase

