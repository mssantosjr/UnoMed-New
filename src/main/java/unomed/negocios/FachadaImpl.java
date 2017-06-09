package unomed.negocios;

import java.util.Date;
import java.util.List;

import unomed.entidades.Clinicas;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.odc.ClinicasLong;
import unomed.entidades.odc.ClinicasShort;
import unomed.entidades.odc.PlanoDeSaudeShort;
import unomed.entidades.odc.ProfissionalDeSaudeLong;
import unomed.entidades.odc.ProfissionalDeSaudeShort;
import unomed.exception.ClinicasExistenteException;
import unomed.exception.ClinicasInexistenteException;
import unomed.exception.PlanoDeSaudeExistenteException;
import unomed.exception.PlanoDeSaudeInexistenteException;
import unomed.exception.ProfissionalDeSaudeExistenteException;
import unomed.exception.ProfissionalDeSaudeInexistenteException;

/*
 * Revisar a nomenclatura em todos os comments e o fluxo
 */

public class FachadaImpl implements Fachada {
	
	private static final long serialVersionUID = -3823897062337010663L;
	
	private ServicoClinicas clinicasServ;
	
	private ServicoProfissionalDeSaude profissionalDeSaudeServ;
	
	private ServicoPlanoDeSaude planoDeSaudeServ;
	
	
	// CLINICAS
	
	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException{
		this.clinicasServ.adicionarClinicas(c);
	}

	public void atualizarClinicas(ClinicasShort c) throws ClinicasInexistenteException{
			//this.clinicasServ.atualizarClinicas(c);
	}
	
	public void removerClinicas(Long id) throws ClinicasInexistenteException{
		this.clinicasServ.removerClinicas(id);
	}
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException{
		return this.clinicasServ.findByCpf(cpf);
	}
	
	public ClinicasLong findByTelefone(String telefone) throws ClinicasInexistenteException{
		return this.clinicasServ.findByTelefone(telefone);
	}
	
	public List<Clinicas> findAllClinicas(){
		return null;// this.clinicasServ.findAll();
	}
	
	// PROFISSIONAL DE SAUDE
	
	public void adicionarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeExistenteException{
		this.profissionalDeSaudeServ.adicionarProfissionalDeSaude(pfs);
	}
	
	public void atualizarProfissionalDeSaude(ProfissionalDeSaudeShort pfs) throws ProfissionalDeSaudeInexistenteException{
		//this.profissionalDeSaudeServ.atualizarProfissionalDeSaude(pfs);
	}
	
	public void removerProfissionalDeSaude(Long id) throws ProfissionalDeSaudeInexistenteException{
		//this.profissionalDeSaudeServ.removerProfissionalDeSaude(id);
	}
	
	public ProfissionalDeSaudeShort findByCrm(String crm) throws ProfissionalDeSaudeInexistenteException{
		return null;//this.profissionalDeSaudeServ.findByCrm(crm);
	}
	
	public ProfissionalDeSaudeShort findByEspecialidade(String especialidade) throws ProfissionalDeSaudeInexistenteException{
		return null;//this.profissionalDeSaudeServ.findByEspecialidade(especialidade);
	}
	
	public List<ProfissionalDeSaudeLong> findProfissionalDeSaude(){
		return null;//this.profissionalDeSaudeServ.findAll();
	}
	
	// PLANO DE SAUDE
	
	public void adicionarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeExistenteException{
		this.planoDeSaudeServ.adicionarPlanoDeSaude(ps);
	}
	
	public void atualizarPlanoDeSaude(PlanoDeSaudeShort ps) throws PlanoDeSaudeInexistenteException{
		//this.planoDeSaudeServ.atualizarPlanoDeSaude(ps);
	}
	
	public void removerPlanoDeSaude(Long id) throws PlanoDeSaudeInexistenteException{
		//this.planoDeSaudeServ.removePlanoDeSaude(id);
	}
	
	public PlanoDeSaudeShort findByNome(String nome) throws PlanoDeSaudeInexistenteException{
		return null;// this.planoDeSaudeServ.findByNome(nome);
	}
	
	public PlanoDeSaudeShort findByEmpresa(String empresa) throws PlanoDeSaudeInexistenteException{
		return null;//this.planoDeSaudeServ.findByEmpresa(empresa);
	}
	
	public List<PlanoDeSaudeShort> findAllPlanoDeSaude(){
		return null;//this.planoDeSaudeServ.findAll();
	}

	public PlanoDeSaudeShort findByEmpresa(Clinicas empresa)
			throws PlanoDeSaudeInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProfissionalDeSaudeShort> findAllProfissionalDeSaude() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
