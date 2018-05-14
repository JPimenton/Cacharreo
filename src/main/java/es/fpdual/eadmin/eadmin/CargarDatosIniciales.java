package es.fpdual.eadmin.eadmin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.EstadoDocumento;
import es.fpdual.eadmin.eadmin.modelo.TablaModulos;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioDocumento;

@Component
public class CargarDatosIniciales implements ApplicationRunner {

	private final RepositorioDocumento repositorioDocumento;
	
	private static final Date FECHA = new Date();
	
	@Autowired
	public CargarDatosIniciales(RepositorioDocumento repositorioDocumento) {
		this.repositorioDocumento =repositorioDocumento;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<TablaModulos> list = this.repositorioDocumento.obtenerTodosLosDocumentos();
		System.out.println(list.size());
		System.out.println(list.get(0));
	}
	
	

}
