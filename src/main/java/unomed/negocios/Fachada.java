package unomed.negocios;

import java.io.Serializable;
import java.util.Date;
import java.utio.List;

//faltam varios imports entidades, exceptions e odc

public interface Fachada extends Serializable {

	// CLINICAS
	
	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException;
	
	public void atualizarClinicas(ClinicasShort c) throws ClinicasInexistenteException;
	
	public void removerClinicas(Long id) throws ClinicasInexistenteException;
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException;
	
	public ClinicasShort findByTelefone(String telefone) throws ClinicasInexistenteException;
	
	public List<ClinicasLong> findAllClinicas();
	
	// PLANO DE SAUDE
	
	public void adicionarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeExistenteException;
	
	public void atualizarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeInexistenteException;
	
	public void removerPlanoDeSaude(Long id) throws PlanoDeSaudeInexistenteException;
	
	public PlanoDeSaudeShort findByNome(String nome) throws PlanoDeSaudeInexistenteException;
	
	public PlanoDeSaudeShort findByEmpresa(Empresa empresa) throws PlanoDeSaudeInexistenteException;
	
	public List<PlanoDeSaudeShort> findAllPlanoDeSaude();
	
	// PROFISSIONAL DE SAUDE
	
	public void adicionarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeExistenteException;
	
	public void atualizarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeInexistenteException;
	
	public void removerProfissionalDeSaude(Long id) throws ProfissionalDeSaudeInexistenteException;
	
	public ProfissionalDeSaudeShort findByCrm(String crm) ProfissionalDeSaudeInexistenteException;
	
	public ProfissionalDeSaudeShort findByEspecialidade(String especialidade) ProfissionalDeSaudeInexistenteException;
	
	public List<ProfissionalDeSaudeShort> findAllProfissionalDeSaude();
	
	
	// pode implementar mais? 
	
}
