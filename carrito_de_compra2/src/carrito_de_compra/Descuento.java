package carrito_de_compra;

public class Descuento {
	public double param;
	public double para;
	public double parametro;
	
	
	public  Descuento(double para) {
		this.para = para;
	
		if(para  < 1000) {
			para = para - (para*0.05);
			System.out.println(para);
		}
		if( para > 1000 && para < 2000) {
			para = para - 100;
		}	
		parametro = para;
		System.out.println(parametro);
		
	}
	public double Descuento() {
		return parametro;
	}
	
	
	
	/*
	 * if(datos2.containsKey("cocacola")) {	
		preciounit = datos2.getOrDefault("cocacola",preciounit );
		
		Preciounitario = preciounit;
		if(preciounit < 1000) {
			preciounit = preciounit - (preciounit*0.05);
		}
		if( preciounit > 1000 && preciounit < 2000) {
			preciounit = preciounit - 100;
		}	
		
		System.out.println("el valor del precio unitario es :  "+ preciounit);
	}*/

}
