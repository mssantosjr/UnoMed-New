package unomed.negocios;

import java.util.Date;
import java.util.List;

import unomed.entidades.PlanoDeSaude;

// tem mais coisas aqui spring


// export de entidades, exceptions e odc


public class FachadaImpl implements Fachada {
	
	private static final long serialVersionUID = -3823897062337010663L;
	
	private ServicoClinicas clinicasServ;
	
	private ServicoProfissionalDeSaude profissionalDeSaudeServ;
	
	private ServicoPlanoDeSaude planoDeSaudeServ;
	
	
	// CLINICAS
	
	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException{
		this.clinicasServ.adicionarClinicas(c);
	}

	public void atualizarClinicas(ClinicasShort c) throws CLinicasInexistenteException{
		this.clinicasServ.atualizarClinicas(c);
	}
	
	public void removerClinicas(Long id) throws ClinicasInexistenteException{
		this.clinicasServ.removerClinicas(id);
	}
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException{
		return this.clinicasServ.findByCpf(cpf);
	}
	
	public ClinicasShort findByTelefone(String telefone) throws ClinicasInexistenteException{
		return this.clinicasServ.findByTelefone(telefone);
	}
	
	public List<ClinicasLong> findAllClinicas(){
		return this.clinicasServ.findAll();
	}
	
	// PROFISSIONAL DE SAUDE
	
	public void adicionarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeExistenteException{
		this.profissionalDeSaudeServ.adicionarProfissionalDeSaude(pfs);
	}
	
	public void atualizarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeInexistenteException{
		this.profissionalDeSaudeServ.atualizarProfissionalDeSaude(pfs);
	}
	
	public void removerProfissionalDeSaude(Long id) throws ProfissionalDeSaudeInexistenteException{
		this.profissionalDeSaudeServ.removerProfissionalDeSaude(id);
	}
	
	public ProfissionalDeSaudeShort findByCrm(String crm) throws ProfissionalDeSaudeInexistenteException{
		return this.profissionalDeSaudeServ.findByCrm(crm);
	}
	
	public ProfissionalDeSaudeShort findByEspecialidade(String especialidade) throws ProfissionalDeSaudeInexistenteException{
		return this.profissionalDeSaudeServ.findByEspecialidade(especialidade);
	}
	
	public List<ProfissionalDeSaudeLong> findProfissionalDeSaude(){
		return this.profissionalDeSaudeServ.findAll();
	}
	
	// PLANO DE SAUDE
	
	
	public void adicionarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeExistenteException{
		this.planoDeSaudeServ.adicionarPlanoDeSaude(ps);
	}
	
	public void atualizarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeInexistenteException{
		this.planoDeSaudeServ.atualizarPlanoDeSaude(ps);
	}
	
	public void removerPlanoDeSaude(Long id) throws PlanoDeSaudeInexistenteException{
		this.planoDeSaudeServ.removePlanoDeSaude(id);
	}
	
	public PlanoDeSaudeShort findByNome(String nome) throws PlanoDeSaudeInexistenteException{
		return this.planoDeSaudeServ.findByNome(nome);
	}
	
	public PlanoDeSaudeShort findByEmpresa(String empresa) throws PlanoDeSaudeInexistenteException{
		return this.planoDeSaudeServ.findByEmpresa(empresa);
	}
	
	public List<PlanoDeSaudeShort> findAllPlanoDeSaude(){
		return this.planoDeSaudeServ.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
