package javabeans;

public class Alumno extends AbstractPersona{
	//Atributos propios:
	private String curso;
	
	//Constructor por defecto:
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor con todo:
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	//Getters y setters:
	public String getAlumno() {
		return curso;
	}


	public void setAlumno(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", curso=" + curso + "]";
	}

	//Métodos a implementar:
	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El alumno "+nombre+" va a estudiar para el curso "+curso;
	}
	
	

	//MÉTODOS PROPIOS:
	public String hacerExamen() {
		return "El alumno "+nombre+" va a hacer su examen.";
	}
}
