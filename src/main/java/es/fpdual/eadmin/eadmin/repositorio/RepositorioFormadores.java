package es.fpdual.eadmin.eadmin.repositorio;

import java.util.List;

import  es.fpdual.eadmin.eadmin.modelo.TablaFormadores;

public interface RepositorioFormadores {
	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) ;

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(Integer idActividad,  Integer idEmpresa, Integer idBloque) ;
	
	void modificarRegistroDeLaTablaFormadores(TablaFormadores registro);
}
