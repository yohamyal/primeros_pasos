public class condicionales2 {
    public static void main(String[] args) {
// trabajaremos con las condicionales if y else  (y, or) , comenzando por la condion if

        int yearOld = 18;
        int  cantidadAnimales = 2;

        if (yearOld >= 15 && cantidadAnimales >= 2 ){   // if la varieable yearOld es mayor o igual a 15 este sera el resultado
            System.out.println(" Usted es bienvenido, puedes entrar" + " es mayor de edad ");
        }
        // if (yearOld < 15 ){            // if la variable yearOld es menor que 15 este sera el resultado
        else{
      //  if   {      // vamos a utilizar  else para referirnos a otro resultado que no sea nuestra condicion
            System.out.println("Usted no es bienvenido" + " no es mayor de edad " + " Tiene muchas mascotas  " );
        }

    }
}
 //&&	Operador AND. Para que la cóndición resultante final sea true ambas condiciones tienen que ser ciertas.
//||	Operador OR. Para que la cóndición resultante final sea true, tan solo bastaría con que una fuese cierta.
//!	Operador NOT. Dicho muy genéricamente, este operador se puede utilizar para cambiar el resultado de una condición. Es decir si la condición se evaluase como true mediante este operador lo transformariamos en false y viceversa:.
