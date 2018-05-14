package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpdual.eadmin.eadmin.modelo.TablaModulos;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioModulos;
import es.fpdual.eadmin.eadmin.servicio.ServicioModulos;

@Service
public class ServicioModulosImpl implements ServicioModulos {

	RepositorioModulos repositorioModulos;
	
	@Autowired
	public ServicioModulosImpl (RepositorioModulos repositorioModulos) {
		this.repositorioModulos = repositorioModulos;
	}
	
	
	@Override
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
		return repositorioModulos.consultarTodosLosRegistrosDeLaTablaModulos();
	}

	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.repositorioModulos.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}
	
	@Override
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		this.repositorioModulos.modificarRegistroDeLaTablaModulos(registro);;		
	}

}
