
package carrito_de_compra;
import java.util.HashMap;
//import java.util.ArrayList;


	public class Producto {
	public int idProducto;
	public String Descripcion;
	public double Preciounitario;
	public double preciodesc;
	int item;
	String nombre ="cocacola";
	double preciounit;
	
	
	HashMap< String,Integer > datos1 = new HashMap< String,Integer >();
	HashMap<String, Double > datos2= new HashMap<String , Double >();
	
	public Producto(int item, String nombre, double preciounit) {
		this.item = item;
		this.nombre = nombre;
		this.preciounit = preciounit; 
		datos1.put("cocacola",10);
		datos1.put( "levite", 20);
		datos1.put("cerveza_patagonia",30);
		datos1.put("vino",40);
		datos2.put("cocacola", 850.0);
		datos2.put("levite", 750.0);
		datos2.put("cerveza_patagonia", 1250.0);
		datos2.put("vino", 4250.0);
		
		if(datos2.containsKey("cocacola")) {
			
			preciounit = datos2.getOrDefault("cocacola",preciounit );
			
		}
		
		Descuento descu = new Descuento(preciounit);
		System.out.println( "valor con descuento :"+descu.parametro );
	//	System.out.println("el valor del precio unitario es :  " + descu.parametro );
		
		
		// se hizo una prueba de descuento sin generar una clase
		
		/* 
		
		if(datos2.containsKey("cocacola")) {
			
			preciounit = datos2.getOrDefault("cocacola",preciounit );
			
			Preciounitario = preciounit;
			if(preciounit < 1000) {
				preciounit = preciounit - (preciounit*0.05);
			}
			if( preciounit > 1000 && preciounit < 2000) {
				preciounit = preciounit - 100;
			}	
			
			System.out.println("el valor del precio unitario es :  "+ preciounit);
		}
		*/
		
	}

	

	
	
	
	
}
