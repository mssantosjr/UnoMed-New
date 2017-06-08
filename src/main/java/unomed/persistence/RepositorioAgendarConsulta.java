package unomed.persistence;

import org.springframework.data.repository.CrudRepository;

import unomed.entidades.AgendarConsulta;
import unomed.entidades.Clinicas;
import java.util.List;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;

public interface RepositorioAgendarConsulta extends CrudRepository<AgendarConsulta, Long> {
	
	

}
