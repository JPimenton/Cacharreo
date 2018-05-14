package es.fpdual.eadmin.eadmin.servicio;

import java.util.List;

import es.fpdual.eadmin.eadmin.modelo.TablaBloques;

public interface ServicioBloques {
	
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado,Integer emmpresa);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo);

	void modificarRegistroDeLaTablaBloques(TablaBloques registro);
}