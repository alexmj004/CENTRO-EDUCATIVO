package javabeans;

public class Profesor extends AbstractPersona{
	//Atributos propios:
	private String competencias;

	//Constructor vacío:
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructo con todo:
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	//Getters y setters:
	public String getCompetencias() {
		return competencias;
	}


	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	//toString
	@Override
	public String toString() {
		return "Profesor [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", competencias=" + competencias + "]";
	}


	//Método a implementar:
	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El profesor "+nombre+" va a impartir su clase.";
	}
	
	//MÉTODOS PROPIOS:
	public String ponerNotas() {
		return "El profesor "+nombre+" va a corregir exámenes.";
	}
	
	

}
