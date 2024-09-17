package testing;

import dao.Instituto;
import javabeans.AbstractPersona;
import javabeans.Administrativo;
import javabeans.Alumno;
import javabeans.Profesor;

public class TestingInstituto {
	private static Instituto idao;
	static {
		idao=new Instituto();
	}
	public static void main(String[] args) {
		//Prueba de todos los métodos:
		
		//alta();
		//buscarUna();
		//buscarTodas();
		//eliminar();
		buscarPorTipo();

	}
	
	public static void alta() {
		//Damos de alta un nuevo alumno:
		AbstractPersona alumno4=new Alumno("771845678T", "Sergio", "C/Jardines,29", "644344444", "2ª Bachillerato");
		System.out.println(idao.altaPersona(alumno4));
		buscarTodas();
	}
	
	public static void buscarUna() {
		System.out.println(idao.buscarPersona("78456679Q"));
	}
	public static void buscarTodas() {
		int cuantosAdmin=0,cuantosProf=0,cuantosAlumn=0;
		for(AbstractPersona persona:idao.buscarTodas()) {
			System.out.println(persona);
			if(persona instanceof Alumno) {
				cuantosAlumn++;
			}else {
				if(persona instanceof Profesor) {
					cuantosProf++;
				}else {
					if(persona instanceof Administrativo) {
						cuantosAdmin++;
					}
				}
			}
		}
		
		//ESTADÍSTICAS:
		System.out.println("Nº DE ALUMNOS = "+cuantosAlumn);
		System.out.println("Nº DE PROFESORES = "+cuantosProf);
		System.out.println("Nº DE ADMINISTRATIVOS = "+cuantosAdmin);
		
		
	}
	
	public static void eliminar() {
		//Nos creamos una persona nueva y si coincide con alguna de las de la lista, entonces la eliminamos:
		AbstractPersona alumnoNuevo=new Alumno("78965673O", "Marta", "C/La Vega,7", "644356743", "2ª Bachillerato");
		System.out.println(idao.eliminarPersona(alumnoNuevo));
		buscarTodas();
	}
	
	public static void buscarPorTipo() {
		for(AbstractPersona persona:idao.buscarPesonasPorTipo("Alumno")) {
			System.out.println(persona);
		}
		
		
		
	}

}
