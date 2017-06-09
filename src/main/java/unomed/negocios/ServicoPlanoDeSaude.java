package unomed.negocios;

import java.io.Serializable;


import java.util.List;

import unomed.entidades.odc.PlanoDeSaudeShort;
import unomed.entidades.odc.PlanoDeSaudeLong;
import unomed.exception.PlanoDeSaudeExistenteException;
import unomed.exception.PlanoDeSaudeInexistenteException;

public interface ServicoPlanoDeSaude extends Serializable {
	
	public void adicionarPlanoDeSaude(PlanoDeSaudeShort p) throws PlanoDeSaudeExistenteException;
	
	public void atualizarClinicas(PlanoDeSaudeShort p) throws PlanoDeSaudeInexistenteException;
	
	public void removerPlanoDeSaude(Long id) throws PlanoDeSaudeInexistenteException;
	
	public PlanoDeSaudeShort findById(Long id) throws PlanoDeSaudeInexistenteException;
	
	public List<PlanoDeSaudeLong> findaAll();

}
