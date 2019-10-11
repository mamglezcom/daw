package ejemplosUnidad2;

public class EjemploVariables
{
	final double PI= 3.141592; // Pi es una constante
	int x; // x es una variable miembro de la clase EjemploVariables
	
	int obtenerX(int x) // x es un parámetro
	{
		int valorAntiguo= this.x; // valorantiguo es una variable local
		return valorAntiguo;
	}
	
	// el metodo main comienza la ejecucion de la aplicacion
	public static void main(String[] args)
	{
		// aquí iría el código de la aplicación
		
	}// fin del método main

}// fin de la clase Ejemplovariables.
