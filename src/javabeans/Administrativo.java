package javabeans;

public class Administrativo extends AbstractPersona{
	//Atributos propios:
	private String tareas;
	
	//Constructor por defecto:
	public Administrativo() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor con todo:
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}
	
	//Getters y setters:
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	//toString
	@Override
	public String toString() {
		return "Administrativo [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", tareas=" + tareas + "]";
	}

	//Métodos implementados:
	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El adiministrativo "+nombre+" va a realizar estas tareas: "+tareas;
	}
	
	//MÉTODOS PROPIOS:
	public String gestionarMatrícula(){
		return "El administrativo "+nombre+" va a gestionar una matrícula";
		}
	

}
