package unomed.persistence;

import org.springframework.data.repository.CrudRepository;
import unomed.entidades.Clinicas;
import java.util.List;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;

public interface RepositorioProfissionalDeSaude extends CrudRepository<ProfissionalDeSaude, Long> {
	
	public ProfissionalDeSaude findByCrm(String crm);
	
	public ProfissionalDeSaude findByEspecialidadeMedica(String especialidadeMedica);
	
	public ProfissionalDeSaude findByClinicaQAtua(String clinicaQAtua);

}
