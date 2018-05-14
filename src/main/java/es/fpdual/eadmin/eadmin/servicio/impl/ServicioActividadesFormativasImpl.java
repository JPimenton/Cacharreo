package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpdual.eadmin.eadmin.modelo.TablaActividadesFormativas;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioActividadesFormativas;
import es.fpdual.eadmin.eadmin.servicio.ServicioActividadesFormativas;

public class ServicioActividadesFormativasImpl implements ServicioActividadesFormativas {
	
	
	RepositorioActividadesFormativas repositorioActividadesFormativas;

	@Override
	public List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas() {
		return this.repositorioActividadesFormativas.consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(
			Integer idActividad, String Empresa, Integer idBloque) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(idActividad, Empresa, idBloque);
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(
			String Empresa, Integer idBloque) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(Empresa, idBloque);
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(
			Integer idFormador) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(idFormador);
	}

	@Override
	public void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro) {
		this.repositorioActividadesFormativas.modificarRegistroDeLaTablaActividadesFormativas(registro);
	}
	
	
}