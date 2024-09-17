package testing;
import javabeans.AbstractPersona;

import javabeans.Administrativo;
import javabeans.Alumno;
import javabeans.Profesor;

public class Principal {

	public static void main(String[] args) {
		//Objetos de Profesores,Alumnos,administrativos:
		AbstractPersona profesor1 = new Profesor("71183654W", "Alejandro", "C/Luz,8", "644363644", "2ª Bachillerato");
		
		AbstractPersona alumno1=new Alumno("78967589Z", "Celia", "C/Juan Martínez,9", "644363655", "2ª Bachillerato");
		AbstractPersona alumno2=new Alumno("78965673O", "Marta", "C/La Vega,7", "644356743", "2ª Bachillerato");
		AbstractPersona alumno3=new Alumno("71122339P", "Alex", "C/ Ortiz Camino,Bajo", "644363622", "2ª Bachillerato");
		
		
		AbstractPersona admin = new Administrativo("78456679Q", "Marta","C/Jardines 26", "654678900", "Hacer matrículas, controlar asistencia.");
		//Métodos de cada Persona:
		System.out.println(profesor1.toString());
		System.out.println(profesor1.trabajar());
		System.out.println("");
		
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		System.out.println(alumno1.trabajar());
		System.out.println(alumno2.trabajar());
		System.out.println(alumno3.trabajar());
		
		System.out.println("");
		
		System.out.println(admin.toString());
		System.out.println(admin.trabajar());
		System.out.println("");
		System.out.println("");
		
		System.out.println(alumno3.llamar(profesor1));
		System.out.println("");
		
		System.out.println(((Profesor)profesor1).ponerNotas());
		System.out.println(((Alumno)alumno1).hacerExamen());
		System.out.println(((Alumno)alumno2).hacerExamen());
		System.out.println(((Alumno)alumno3).hacerExamen());	
		System.out.println(((Administrativo)admin).gestionarMatrícula());
		
		
		
		
	
		
	}

}
