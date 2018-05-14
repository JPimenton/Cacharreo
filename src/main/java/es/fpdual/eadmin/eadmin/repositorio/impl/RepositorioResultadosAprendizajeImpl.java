package es.fpdual.eadmin.eadmin.repositorio.impl;

import java.util.List;

import es.fpdual.eadmin.eadmin.mapper.ResultadoAprendizajeMapper;
import es.fpdual.eadmin.eadmin.modelo.TablaResultadosAprendizaje;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioResultadosAprendizaje;

public class RepositorioResultadosAprendizajeImpl implements RepositorioResultadosAprendizaje {
	private ResultadoAprendizajeMapper mapper;
	
	public void RepositorioTablarResultadosAprendizaje(ResultadoAprendizajeMapper mapper) {
		this.mapper=mapper;
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(
			Integer idModulo,Integer idResultado) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(idModulo,idResultado);
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(
			Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);

	}

	@Override
	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.mapper.modificarRegistroDeLaTablaResultadosAprendizaje(registro);
		
	}
	
}