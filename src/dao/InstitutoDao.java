package dao;
import java.util.List;

import javabeans.AbstractPersona;

public interface InstitutoDao {
	//Métodos abstractos:
	boolean altaPersona(AbstractPersona persona);
	AbstractPersona buscarPersona(String nif);
	List<AbstractPersona> buscarTodas();
	boolean eliminarPersona(AbstractPersona persona);
	List<AbstractPersona> buscarPesonasPorTipo(String tipoPersona);

}
