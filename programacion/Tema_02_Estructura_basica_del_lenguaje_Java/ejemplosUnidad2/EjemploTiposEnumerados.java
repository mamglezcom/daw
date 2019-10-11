package ejemplosUnidad2;

public class EjemploTiposEnumerados 
{
	public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
		
	public static void main(String[] args)
	{
		Dias diaactual = Dias.Miercoles;
		Dias diasiguiente = Dias.Jueves;
		
		System.out.print("Hoy es ");
		System.out.println(diaactual);
		System.out.println("Mañana es "+diasiguiente);
	} // fin main
} // fin EjemploTiposEnumerados
