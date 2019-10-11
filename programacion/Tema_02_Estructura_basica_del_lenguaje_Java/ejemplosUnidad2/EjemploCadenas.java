package ejemplosUnidad2;

public class EjemploCadenas 
{
	public static void main(String[] args)
	{
		String cad1 = "CICLO DAW ";
  
      	String cad2 = "ciclo daw ";

    	System.out.printf("La cadena cad1 es: %s y cad2 es: %s", cad1,cad2 );
    	System.out.println("\nLa cadena cad1 es: "+cad1+" y cad2 es: "+cad2 );
       	
    	System.out.printf( "\nLongitud de cad1: %d", cad1.length() );
    	System.out.println( "\nLongitud de cad1: "+cad1.length() );
    	
    	// concatenación de cadenas (concat o bien operador +)
	    System.out.printf( "\nConcatenación: %s", cad1.concat(cad2) );
	    System.out.println( "\nConcatenación: "+cad1.concat(cad2) );
	    System.out.println( "Concatenación: "+cad1+cad2);
  	    
	    //comparación de cadenas
   		System.out.printf("\ncad1.equals(cad2) es %b", cad1.equals(cad2));
   		System.out.println("\ncad1.equals(cad2) es "+cad1.equals(cad2));
		System.out.printf("\ncad1.equalsIgnoreCase(cad2) es %b", cad1.equalsIgnoreCase(cad2) );
		System.out.println("\ncad1.equalsIgnoreCase(cad2) es "+cad1.equalsIgnoreCase(cad2));
	    	    
	    //obtención de subcadenas
       	System.out.printf("\ncad1.substring(0,5) es %s", cad1.substring(0,5));
       	System.out.println("\ncad1.substring(0,5) es "+cad1.substring(0,5));
	 	
       	//pasar a minúsculas
        System.out.printf("\ncad1.toLowerCase() es %s", cad1.toLowerCase());
      	System.out.println("\ncad1.toLowerCase() es "+cad1.toLowerCase());
	} // fin main
} // fin EjemploCadenas

