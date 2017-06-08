package unomed.negocios;

import java.io.Serializable;
import java.util.List;

import unomed.entidades.ProfissionalDeSaude;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.odc.ClinicasLong;
import unomed.entidades.odc.ClinicasShort;
import unomed.exception.ClinicasExistenteException;
import unomed.exception.ClinicasInexistenteException;


public interface ServicoClinicas extends Serializable {
	
	
	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException;
	
	public void atualizarClinicas(ClinicasShort c) throws ClinicasExistenteException;
	
	public void removerClinicas(Long id) throws ClinicasInexistenteException;
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException;
	
	public ClinicasLong findByTelefone(String telefone) throws ClinicasInexistenteException;
	
	public List<ClinicasShort> findByNomeOrderByNomeAsc(String nome);
	
	public ClinicasShort findOneClinicas(Long id);
	
	public List<ClinicasShort> findByPlanoDeSaudeOrderByNomeAsc(PlanoDeSaude planoDeSaude);
	
	public List<ClinicasLong> findAll();
	
	

}
