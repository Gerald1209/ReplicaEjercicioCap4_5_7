
package replica.de.ejercicios.capitulo.pkg7;

// Fig. 7.19: PruebaLibroCalificaciones.java
// PruebaLibroCalificaciones crea un objeto LibroCalificaciones, usando un arreglo bidimensional
// de calificaciones, y después invoca al método procesarCalificaciones para analizarlas
 public class PruebaLibroCalificacionesBidi
{
    // el método main comienza la ejecución del programa
    public static void main(String[] args)
    {
        // arreglo bidimensional de calificaciones de estudiantes
        int[][] arregloCalif = {{87, 96, 70},
                                {68, 87, 90},
                                {94, 100, 90},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}};

        LibroCalificacionesBidi miLibroCalificaciones = new LibroCalificacionesBidi(
                    "CS101 Introduccion a la programacion en Java", arregloCalif);
        System.out.printf("Bienvenido al libro de calificaciones para\n%s\n\n",
        miLibroCalificaciones.obtenerNombreDelCurso());
        miLibroCalificaciones.procesarCalificaciones();
    }
} // fin de la clase PruebaLibroCalificaciones