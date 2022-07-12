public class App {
    
    public static void main(String[] args) throws Exception {
        
        /**
         * Parte 1
         * Crear una función con tres parámetros que sean números que se suman entre sí.
         * Llamar a la función en el main y darle valores.
         */

        // Creacion de las variables
        int num1 = 10;
        int num2 = 200;
        int num3 = 5000;
        int resultSuma = 0;

        // Obteniendo el valor de la suma de los 3 parametros
        resultSuma = suma(num1, num2, num3);

        // Imprimimos en consola el resultado de la suma de los 3 parametros
        System.out.println("El resultado de sumar los 3 parametros es de: " + resultSuma);

        // ******************************************************************************************************** //

        /**
         * Crear una clase coche.
         * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
         * Una función que incremente el número de puertas que tiene el coche.
         * Crear un objeto miCoche en el main y añadirle una puerta.
         * Mostrar el número de puertas que tiene el objeto.
         */

        //Creacion de variables
        int puerta = 1;
        String resultPuertas = "";
        
        // Instancia de la clase Coche
        Coche miCoche = new Coche();

        // Agregamos puertas al coche
        miCoche.agregarPuerta(puerta);

        // Retornamos la cantidad de puertas agregadas al coche
        resultPuertas = miCoche.getCantidadPuertas();

        // Imprimimos en consola la cantidad de puertas agregadas al coche
        System.out.println(resultPuertas);

    }

    /**
     * Funcion para realizar la suma de los 3 parametros
     * @param num1 primer parametro de la suma de los 3 parametros
     * @param num2 segndo parametro de la suma de los 3 parametros
     * @param num3 tercer parametro de la suma de los 3 parametros
     * @return valor que retornara la suma de los 3 parametros
     */
    public static int suma(int num1, int num2, int num3) {
        int result = 0;
        result = (num1 + num2 + num3);
        return result;
    }

}

/**
 * Creando clase Coche solicitada para la segunda parte del ejercicio
 */
class Coche {
    
    // Atributos de la clase
    public int puertas = 1;

    /**
     * Metodo para agregar puertas al coche
     * @param puerta parametro que indica la cantidad de puertas que se agregaran al coche
     */
    public void agregarPuerta(int puerta) {
        this.puertas += puerta;
    }

    /**
     * Funcion para retornar la cantidad de puertas que tiene el coche
     * @return valor que retornar la cantidad de puertas
     */
    public String getCantidadPuertas() {
        String result = "";
        result = "\nCantidad de puertas que tiene el coche es de: " + this.puertas;
        return result;
    }

}
