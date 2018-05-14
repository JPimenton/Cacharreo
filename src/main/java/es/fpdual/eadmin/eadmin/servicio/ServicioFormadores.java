package es.fpdual.eadmin.eadmin.servicio;

import java.util.List;

import es.fpdual.eadmin.eadmin.modelo.TablaFormadores;

public interface ServicioFormadores {
	
	List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();
	
	List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador);
	
	void modificarRegistroDeLaTablaFormadores(TablaFormadores registro);
}