package ejemplosUnidad2;

public class OperadoresAsignacion 
{
	public static void main(String[] args)
	{
		int x;
		int y;
		x = 5;  // operador asignaci�n
		y = 3;  // operador asignaci�n
        //operadores de asignaci�n combinados
        System.out.printf("El valor de x es %d y el valor de y es %d\n", x,y);
        x += y;
        // podemos utilizar indistintamente printf o println
        // nos resulta m�s c�modo println
        System.out.println(" Suma combinada: x += y " + " ............ x vale " + x);
        x = 5;
        x -= y;
        System.out.println(" Resta combinada: x -= y " + " ........... x vale " + x);
        x = 5;
        x *= y;
        System.out.println(" Producto combinado: x *= y " + " ........ x vale " + x);
        x = 5;
        x /= y;
        System.out.println(" Division combinada: x /= y " + " ........ x vale " + x);
        x = 5;
        x %= y;
        System.out.println(" Resto combinada: x %= y " + " ........... x vale " + x);
    } // fin main
}
 // fin operadoresasignacion