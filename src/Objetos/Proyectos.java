package Objetos;

public class Proyectos {

	private String nombre,descripcion,ScrumMaster,ProductOwner;
	
	public Proyectos(String nombre, String descripcion, String scrumMaster, String productOwner) {
		super();

		this.nombre = nombre;
		this.descripcion = descripcion;
		ScrumMaster = scrumMaster;
		ProductOwner = productOwner;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getScrumMaster() {
		return ScrumMaster;
	}

	public void setScrumMaster(String scrumMaster) {
		ScrumMaster = scrumMaster;
	}

	public String getProductOwner() {
		return ProductOwner;
	}

	public void setProductOwner(String productOwner) {
		ProductOwner = productOwner;
	}

	@Override
	public String toString() {
		return "Proyectos [nombre=" + nombre + ", descripcion=" + descripcion + ", ScrumMaster="
				+ ScrumMaster + ", ProductOwner=" + ProductOwner + "]";
	}
	
}
