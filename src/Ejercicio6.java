public class Ejercicio6 {
    public static void main (String[] args){

        Estudiante estudiante = new Estudiante(3.5);
        estudiante.mostrarBoletin();

        compararNotas(3.5, 5.0);
    }
    //Este metodo es de instancia porque usa this.nota, así que necesita que exista un estudiante para funcionar

    public static class Estudiante{
        private double nota;

        public Estudiante(double nota){
            this.nota = nota;
        }
        public void mostrarBoletin (){
            System.out.println("la nota del estudiante es: " +this.nota);
        }
    }
    //Este metodo es static porque solo compara los dos números que le hemos dado, sin importar ningún estudiante."

    public static double compararNotas(double nota1, double nota2){
        return Double.compare(nota1,nota2);
    }
}
