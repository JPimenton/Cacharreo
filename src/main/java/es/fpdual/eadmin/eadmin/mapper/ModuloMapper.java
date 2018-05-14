package es.fpdual.eadmin.eadmin.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import es.fpdual.eadmin.eadmin.modelo.*;

public interface ModuloMapper {

	public int modificarRegistroDeLaTablaModulos(@Param("modulo")TablaModulos registro);	
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();

	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(@Param("idModulo")Integer idModulo) ;

}
