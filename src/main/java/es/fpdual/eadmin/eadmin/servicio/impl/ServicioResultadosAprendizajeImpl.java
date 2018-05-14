package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpdual.eadmin.eadmin.modelo.TablaResultadosAprendizaje;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioResultadosAprendizaje;
import es.fpdual.eadmin.eadmin.servicio.ServicioResultadosAprendizaje;

public class ServicioResultadosAprendizajeImpl implements ServicioResultadosAprendizaje {

	RepositorioResultadosAprendizaje repositorioTablaResultadosAprendizaje;

	@Override
	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje() {
		return this.repositorioTablaResultadosAprendizaje.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(
			Integer idModulo, Integer idResultado) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(idModulo, idResultado);
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(
			Integer idModulo) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);
	}

	@Override
	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.repositorioTablaResultadosAprendizaje.modificarRegistroDeLaTablaResultadosAprendizaje(registro);
	}
	
}

