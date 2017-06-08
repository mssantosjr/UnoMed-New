package unomed.persistence;

import org.springframework.data.repository.CrudRepository;

import unomed.entidades.AgendarConsulta;
import unomed.entidades.Clinicas;
import java.util.List;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;

public interface RepositorioPlanoDeSaude extends CrudRepository<AgendarConsulta, Long> {
	
	public AgendarConsulta findById(String id);
	
	public AgendarConsulta findByNome(String nome);
	
	public AgendarConsulta findByEmpresa(String empresa);

}
