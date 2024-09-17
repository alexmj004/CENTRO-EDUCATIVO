package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.AbstractPersona;
import javabeans.Administrativo;
import javabeans.Alumno;
import javabeans.Profesor;
//Dicha clase implementa a la clase InstitutoDao:
public class Instituto implements InstitutoDao{
	
	//Lista privada de personas:
	private  List<AbstractPersona> personas;
	
	//Constructor donde inicializamos la lista:
	public Instituto() {
		personas = new ArrayList<>();
		cargarDatos();
	}
	
	//Carga de personas:
	private void cargarDatos(){
		AbstractPersona profesor1 = new Profesor("71183654W", "Alejandro", "C/Luz,8", "644363644", "2ª Bachillerato");
		personas.add(profesor1);
		
		AbstractPersona alumno1=new Alumno("78967589Z", "Celia", "C/Juan Martínez,9", "644363655", "2ª Bachillerato");
		AbstractPersona alumno2=new Alumno("78965673O", "Marta", "C/La Vega,7", "644356743", "2ª Bachillerato");
		AbstractPersona alumno3=new Alumno("71122339P", "Alex", "C/ Ortiz Camino,Bajo", "644363622", "2ª Bachillerato");
		personas.add(alumno1);
		personas.add(alumno2);
		personas.add(alumno3);
		AbstractPersona admin = new Administrativo("78456679Q", "Marta","C/Jardines 26", "654678900", "Hacer matrículas, controlar asistencia.");
		personas.add(admin);
	}
	
	//Métodos implementados de la interface:
	//Alta de una persona:
	@Override
	public boolean altaPersona(AbstractPersona persona) {
		if(personas.contains(persona)) {
			return false;
		}else {
			personas.add(persona);
			return true;
		}
		
	}
	
	//Buscar una persona en la lista:
	@Override
	public AbstractPersona buscarPersona(String nif) {
		for(AbstractPersona persona:personas) {
			if(persona.getNif().equalsIgnoreCase(nif)) {
				return persona;
			}
		}
		return null;
	}

	//Muestra todas las personas de la lista:
	@Override
	public List<AbstractPersona> buscarTodas() {
		// TODO Auto-generated method stub
		return personas;
		
	}
	
	//Elimina una persona de la lista:
	@Override
	public boolean eliminarPersona(AbstractPersona persona) {
		
		return personas.remove(persona);
	}

	//Dependiendo de que persona sea, se muestra un listado con ese tipo de persona, además de sus métodos propios:
	@Override
	public List<AbstractPersona> buscarPesonasPorTipo(String tipoPersona) {
		List<AbstractPersona> aux = new ArrayList<AbstractPersona>();
		
			
		if(tipoPersona.equalsIgnoreCase("Alumno")) {
			for(AbstractPersona persona:personas) {
				if(persona instanceof Alumno) {
					aux.add(persona);
					
					System.out.println(((Alumno)persona).hacerExamen());
					
				}
				
			}return aux;
		}else if(tipoPersona.equalsIgnoreCase("Profesor")){
			for(AbstractPersona persona:personas) {
				if(persona instanceof Profesor) {
					aux.add(persona);
					
					System.out.println(((Profesor)persona).ponerNotas());
					
				}return aux;
			}
		
		}else if(tipoPersona.equalsIgnoreCase("Administrativo")){
			for(AbstractPersona persona:personas) {
				if(persona instanceof Administrativo) {
					aux.add(persona);
					System.out.println(((Administrativo)persona).gestionarMatrícula());
					
				}
	
			}return aux;
		}
		return aux;
	}
}

