//A Juan le gustaría crear un programa sobre Impuesto sobre la Renta (IR),
// para ello, verificó las reglas de impuestos. Encontró en el sitio web de impuestos que:

//De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
//De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
//De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.





public class TestIR {
    public static void main(String[] args) {
        double salario = 2384.0;

        if(salario >= 1900 || salario <= 2800) {
            System.out.println("El IR es de 7.5% y puede deducir de la delcaración el monto ede 142");
        }
        else
            if (salario > 2800.01 && salario <= 3751.0 ) {
            System.out.println("El IR es de 15% y puede deducir de la delcaración el monto ede 350");
        }
        else
            if (salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("El IR es de 22.5% y puede deducir de la delcaración el monto ede 636");
        }
    }
}
