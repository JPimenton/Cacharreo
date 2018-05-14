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

	RepositorioModulos repositorioDocumento;
	
	@Autowired
	public ServicioModulosImpl (RepositorioModulos repositorioDocumento) {
		this.repositorioDocumento = repositorioDocumento;
	}
	
	
	@Override
	public List<TablaModulos> obtenerTodosLosDocumentos() {
		return repositorioDocumento.obtenerTodosLosDocumentos();
	}

}
