package javabeans;

import java.util.Objects;

public abstract class AbstractPersona {
	//Atributos propios que heredarán las subclases:
	protected String nif;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	
	//Constructor por defecto:
	public AbstractPersona() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor con todo:
	public AbstractPersona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//Getters y setters:
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	//toString:
	@Override
	public String toString() {
		return "AbstractPersona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
	
	//Dos personas son la misma por el nif:
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPersona other = (AbstractPersona) obj;
		return Objects.equals(nif, other.nif);
	}
	
	
	//MÉTODOS PROPIOS:
	public String llamar(AbstractPersona p) {
		return nombre + " llamando a "+p.getNombre();
		
	}
	//Método abstracto:
	public abstract String trabajar();
	
	
	
	
	

}
