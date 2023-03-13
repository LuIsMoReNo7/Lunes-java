public class Tipos_De_puntos_flotantes {
    public static void main(String[] args) {
        float myNum = 5.75f;
        double myNum2 = 19.99d;
        /* ¿Usar flotante o doble? */
        // La precisión de un valor de punto flotante indica cuántos dígitos puede
        // tener el valor después del punto decimal. La precisión de float es de solo seis 
        //o siete dígitos decimales, mientras que las variables double tienen una precisión de alrededor de 15 dígitos.
        // Por lo tanto, es más seguro usar el double para la mayoría de los cálculos.
           
        System.out.println(myNum);
        System.out.println(myNum2);

    }
}
