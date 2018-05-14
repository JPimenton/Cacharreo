package es.fpdual.eadmin.eadmin.servicio;

import java.util.List;

import es.fpdual.eadmin.eadmin.modelo.TablaModulos;

public interface  ServicioModulos {

	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);

}
