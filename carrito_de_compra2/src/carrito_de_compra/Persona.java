package carrito_de_compra;

public class Persona {
		private String nombre;
		private String apellido;
		private String fechanacim;
	
	public  Persona() {
		this.nombre="";
		this.apellido="";
		this.fechanacim = "";		
		
				
			
	}
	public Persona(String nombre, String apellido, String fechanacim) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechanacim = fechanacim;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido ;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechanacim() {
		return fechanacim;
	}

	public void setFechanacim(String  fechanacim) {
		this.fechanacim = fechanacim;
	}
}
