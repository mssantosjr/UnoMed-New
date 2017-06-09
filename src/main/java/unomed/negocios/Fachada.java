package unomed.negocios;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import unomed.entidades.Clinicas;
import unomed.entidades.odc.ClinicasLong;
import unomed.entidades.odc.ClinicasShort;
import unomed.entidades.odc.PlanoDeSaudeShort;
import unomed.entidades.odc.ProfissionalDeSaudeShort;
import unomed.exception.ClinicasExistenteException;
import unomed.exception.ClinicasInexistenteException;
import unomed.exception.PlanoDeSaudeExistenteException;
import unomed.exception.PlanoDeSaudeInexistenteException;
import unomed.exception.ProfissionalDeSaudeExistenteException;
import unomed.exception.ProfissionalDeSaudeInexistenteException;



public interface Fachada extends Serializable {

	// CLINICAS

	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException;
	
	public void atualizarClinicas(ClinicasShort c) throws ClinicasInexistenteException;
	
	public void removerClinicas(Long id) throws ClinicasInexistenteException;
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException;
	
	public ClinicasLong findByTelefone(String telefone) throws ClinicasInexistenteException;
	
	public List<Clinicas> findAllClinicas();
	
	// PLANO DE SAUDE
	
	public void adicionarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeExistenteException;
	
	public void atualizarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeInexistenteException;
	
	public void removerPlanoDeSaude(Long id) throws PlanoDeSaudeInexistenteException;
	
	public PlanoDeSaudeShort findByNome(String nome) throws PlanoDeSaudeInexistenteException;
	
	public PlanoDeSaudeShort findByEmpresa(Clinicas empresa) throws PlanoDeSaudeInexistenteException;
	
	public List<PlanoDeSaudeShort> findAllPlanoDeSaude();
	
	// PROFISSIONAL DE SAUDE
	
	public void adicionarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeExistenteException;
	
	public void atualizarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeInexistenteException;
	
	public void removerProfissionalDeSaude(Long id) throws ProfissionalDeSaudeInexistenteException;
	
	public ProfissionalDeSaudeShort findByCrm(String crm) throws ProfissionalDeSaudeInexistenteException;
	
	public ProfissionalDeSaudeShort findByEspecialidade(String especialidade) throws ProfissionalDeSaudeInexistenteException;
	
	public List<ProfissionalDeSaudeShort> findAllProfissionalDeSaude();
	
	
	// pode implementar mais? 
	/*
	 * poder, pode!! mas temos q implementar todos métodos criados, e temos
	 * que analisar as necessidades de sua utilidade no sistema!!
	 */
	
	
}
