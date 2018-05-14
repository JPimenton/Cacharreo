package es.fpdual.eadmin.eadmin.repositorio;

import java.util.List;

import  es.fpdual.eadmin.eadmin.modelo.TablaResultadosAprendizaje;

public interface RepositorioResultadosAprendizaje {
	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje ();
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados (Integer idModulo,Integer idResultado);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo (Integer idModulo);
	
	void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro);
}
