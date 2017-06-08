package unomed.persistence;

import org.springframework.data.repository.CrudRepository;
import unomed.entidades.Clinicas;
import java.util.List;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;
import unomed.entidades.StatusDaMarcacao;

public interface RepositorioStatusDaMarcacao extends CrudRepository<StatusDaMarcacao,Long> {
	
	

}
