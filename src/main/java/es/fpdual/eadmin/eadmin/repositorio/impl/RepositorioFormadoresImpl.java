package es.fpdual.eadmin.eadmin.repositorio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpdual.eadmin.eadmin.mapper.FormadorMapper;
import es.fpdual.eadmin.eadmin.modelo.TablaFormadores;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioFormadores;

public class RepositorioFormadoresImpl implements RepositorioFormadores {

	private FormadorMapper mapper;

	@Autowired
	public RepositorioFormadoresImpl(FormadorMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaFormadores();
	}

	@Override
	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) {
		return this.mapper.consultarRegistrosDeLaTablaFormadoresPorIdFormador(idFormador);
	}

	@Override
	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(
			Integer idActividad, Integer idEmpresa, Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(
				 idActividad,  idEmpresa,  idBloque);
	}

	@Override
	public void modificarRegistroDeLaTablaFormadores(TablaFormadores registro) {
		this.mapper.modificarRegistroDeLaTablaFormadores(registro);
	}

	

}
