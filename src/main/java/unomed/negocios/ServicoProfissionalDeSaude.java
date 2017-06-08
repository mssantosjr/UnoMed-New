package unomed.negocios;

import java.io.Serializable;
import java.util.List;

import unomed.entidades.AgendarConsulta;
import unomed.entidades.Clinicas;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;
import unomed.entidades.odc.ProfissionalDeSaudeLong;
import unomed.entidades.odc.ProfissionalDeSaudeShort;
import unomed.exception.ProfissionalDeSaudeExistenteException;
import unomed.exception.ProfissionalDeSaudeInexistenteException;

public interface ServicoProfissionalDeSaude extends Serializable {
	
	/**
	 * Adiciona um profissional
	 * 
	 * @param p
	 * @throws ProfissionalDeSaudeExistenteException
	 */
	
	public void adicionarProfissionalDeSaude(ProfissionalDeSaudeShort p) throws ProfissionalDeSaudeException;
	
	
	public void atualizarProfissionalDeSaude
	
	
	

}
