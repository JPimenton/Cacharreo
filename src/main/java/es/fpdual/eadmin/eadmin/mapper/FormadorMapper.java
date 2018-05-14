package es.fpdual.eadmin.eadmin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import es.fpdual.eadmin.eadmin.modelo.*;

public interface FormadorMapper {

	public int modificarRegistroDeLaTablaFormadores(@Param("formador")TablaFormadores registro);

	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(@Param("idFormador")Integer idFormador) ;

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(@Param("idActividad")Integer idActividad, @Param("idEmpresa") Integer idEmpresa, @Param("idBloque") Integer idBloque) ;
	
}