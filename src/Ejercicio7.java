public class Ejercicio7 {
    public static void main (String[] args){
        double[] notas = {4.0, 3.5, 5.0, 2.0, 1.5};
        double promedio = calcularPromedioClase(notas);

        System.out.println("el promedio del grupo es: " + promedio);

    }
    public static double calcularPromedioClase(double[] calificaciones){
        if (calificaciones == null || calificaciones.length == 0){
            return 0.0;
        }
        double suma = 0.0;
        for (int i = 0; i < calificaciones.length; i++){
            suma += calificaciones[i];
        }
        return suma / calificaciones.length;
    }
}
