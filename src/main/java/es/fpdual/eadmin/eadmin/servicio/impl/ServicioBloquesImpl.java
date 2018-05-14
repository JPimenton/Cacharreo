package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpdual.eadmin.eadmin.servicio.ServicioBloques;
import es.fpdual.eadmin.eadmin.modelo.TablaBloques;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioBloques;

public class ServicioBloquesImpl implements ServicioBloques {
	
	RepositorioBloques repositorioTablaBloques;

	@Override
	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		return this.repositorioTablaBloques.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado,
			Integer emmpresa) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(idResultado, emmpresa);
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(idFormadorResponsable);
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorIdModulo(idModulo);
	}

	@Override
	public void modificarRegistroDeLaTablaBloques(TablaBloques registro) {
		this.repositorioTablaBloques.modificarRegistroDeLaTablaBloques(registro);
	}
	


}