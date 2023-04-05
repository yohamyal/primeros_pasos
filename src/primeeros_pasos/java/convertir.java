package primeeros_pasos.java;

public class convertir {

        public static void main(String[] args){

            float puntoFlotante = 3.14f;

            double salario = 1270.50;
            int valor = (int) salario;
            System.out.println(valor);

            double valor1 = 0.2;
            double valor2 = 0.1;
            double total = valor1 + valor2;

            System.out.println(total);
        }
//En el caso anterior, es explícito que se realizará la conversión de doublé a entero. Vea cómo funciona el cast implícito y explícito en la tabla a continuación.
//
//DE/PARA	byte	short	char	int	long	float	double
//byte	----	Impl.	(char)	Impl.	Impl.	Impl.	Impl.
//short	(byte)	----	(char)	Impl.	Impl.	Impl.	Impl.
//char	(byte)	(short)	----	Impl.	Impl.	Impl.	Impl.
//int	(byte)	(short)	(char)	----	Impl.	Impl.	Impl.
//long	(byte)	(short)	(char)	(int)	----	Impl.	Impl.
//float	(byte)	(short)	(char)	(int)	(long)	----	Impl.
//double	(byte)	(short)	(char)	(int)	(long)	(float)	----
//Para comparar cada tipo primitivo más claramente, la siguiente tabla muestra el tamaño de cada uno.
//
//TIPO	TAMAÑO
//boolean	1 bit
//byte	1 byte
//short	2 bytes
//char	2 bytes
//int	4 bytes
//float	4 bytes
//long	8 bytes
//double	8 bytes//
    }
