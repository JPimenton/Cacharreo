package es.fpdual.eadmin.eadmin.repositorio;

import java.util.List;

import es.fpdual.eadmin.eadmin.modelo.TablaModulos;

public interface RepositorioModulos {


	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);
	
}
