package es.fpdual.eadmin.eadmin.repositorio.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import es.fpdual.eadmin.eadmin.mapper.*;
import es.fpdual.eadmin.eadmin.modelo.*;
import es.fpdual.eadmin.eadmin.repositorio.*;

@Repository
public class RepositorioModulosImpl implements RepositorioModulos {

    private ModuloMapper mapper;

    @Autowired
    public RepositorioModulosImpl(ModuloMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
        return this.mapper.consultarTodosLosRegistrosDeLaTablaModulos();
    }

    @Override
	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}

	@Override
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		this.mapper.modificarRegistroDeLaTablaModulos(registro);
		
	}
}
