import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[] args){

        double nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota"));

        String resultado = clasificarNota(nota);
        System.out.println("la tota es: " + resultado);

    }
    public static String clasificarNota(double nota){
        if (nota < 3.5){
            return "reprobada";

        } else if (nota < 4.0) {
            return "aprovada";

        }else {
            return "exelente";
        }
    }
}
