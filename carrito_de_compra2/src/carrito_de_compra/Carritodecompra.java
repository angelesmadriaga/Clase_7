package carrito_de_compra;

public class Carritodecompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto prod1 = new Producto(0, null, 0);
		Persona persona1 = new Persona("Pedro", "Marin", "12/06/1948");
		System.out.println( prod1.datos1.containsKey("cocacola"));
		System.out.println("precio unitario de la cocacola es :  "+ prod1.datos2.getOrDefault("cocacola", null));
		System.out.println( prod1.datos1.containsValue(args));
		System.out.println(persona1.getApellido());
		
		
		
	}

}
