package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpdual.eadmin.eadmin.servicio.ServicioFormadores;
import es.fpdual.eadmin.eadmin.modelo.TablaFormadores;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioFormadores;

public class ServicioFormadoresImpl implements ServicioFormadores {
	
	RepositorioFormadores repositorioTablaFormadores;
	
	@Autowired
	public ServicioFormadoresImpl (RepositorioFormadores repositorioTablaFormadores) {
		this.repositorioTablaFormadores = repositorioTablaFormadores;
	}


	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores() {
		return this.repositorioTablaFormadores.consultarTodosLosRegistrosDeLaTablaFormadores();
	}

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) {
		return this.repositorioTablaFormadores.consultarRegistrosDeLaTablaFormadoresPorIdFormador(idFormador);
	}

	public void modificarRegistroDeLaTablaFormadores(TablaFormadores registro) {
		this.repositorioTablaFormadores.modificarRegistroDeLaTablaFormadores(registro);;
	}

}
