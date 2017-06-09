package unomed.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import unomed.entidades.AgendarConsulta;
import unomed.entidades.Clinicas;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;
import unomed.entidades.odc.ClinicasLong;
import unomed.entidades.odc.ClinicasShort;
import unomed.exception.ClinicasExistenteException;
import unomed.exception.ClinicasInexistenteException;
import unomed.persistence.RepositorioClinicas;

public class ServicoClinicasImpl implements ServicoClinicas {
	
	private static final long serialVersionUID = 1336061289381836117L;
	
	private CrudRepository<Clinicas, Long> clinicasRep;
	
	private ServicoAgendarConsulta agendarConsultaServ;
	
	/*
	 * Syntax error on token ";", AnnotationName expected after this token
	 * (rollbackFor = ClinicasExistenteException.class)
	 *  The problem is the first for loop. In Java, you cannot just 
	 *  put code under a class - it needs to be in a method, constructor
	 *  or anonymous block.
	 */
	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException {
		try {
			ClinicasShort clinicas = this.findByCpf(c.getCpf());
			if (clinicas.getNome() != null)
				throw new ClinicasExistenteException();
		} catch (ClinicasInexistenteException e) {
			this.clinicasRep.save(ClinicasShort.toClinicas(c));
		}
	}
	
	//(rollbackFor = ClinicasInexistenteException.class)
	public void atualizarClinica(ClinicasShort c) throws ClinicasInexistenteException {
		ClinicasShort old = this.findByCpf(c.getCpf());
		old.setCpf(c.getCpf());
		old.setNome(c.getNome());
		old.setEndereco(c.getEndereco());
		old.setTelefone(c.getTelefone());
		old.setTipoAcesso(c.getTipoAcesso());
		old.setPlanoSaude(c.getPlanoSaude());
		this.clinicasRep.save(ClinicasShort.toClinicas(old));

	}
	
	//(rollbackFor = ClinicasInexistenteException.class)
	public void removerClinicas(Long id) throws ClinicasInexistenteException {
		/*
		 * Revisar a nomenclatura
		 * Clinicas old = this.clinicasRep.findOne(id);
		 
		if(old != null) {
			List<AgendarConsulta> agendarConsulta = old.getAgendarConsultas();
			try {
				for (AgendarConsulta a : agendarConsulta) {
					this.agendarConsultaServ.removerAgendarConsulta(a);
				}
				this.clinicasRep.delete(old);
			} catch (Exception e1) {
				throw new ClinicasInexistenteException();
			}
		}
		else
			throw new ClinicasInexistenteException();
			
			*/
	}
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException{
		/*
		 * Revisar a nomenclatura
		 * ClinicasShort clinicas = ClinicasShort.toClinicasShort(this.clinicasRep.findByCpf(cpf));
		if (clinicas.getNome() == null)
			throw new ClinicasInexistenteException();
		return clinicas;
		*/
		return null;
	}
	
	public ClinicasLong findByTelefone(String telefone) {
		//Revisar a nomenclatura
		return null;//ClinicasLong.toClinicasLong(this.clinicasRep.findByTelefone(telefone));
	}
	
	public List<ClinicasShort> findByNomeOrderByNomeAsc(String nome) {
		//Revisar a nomenclatura
		return null;// ClinicasShort.toClinicasShort(((ServicoClinicasImpl) this.clinicasRep).findByNomeOrderByNomeAsc(nome));
	}
	
	public ClinicasShort findOneClinicas(Long id) {
		return ClinicasShort.toClinicasShort(this.clinicasRep.findOne(id));
	}
	
	public List<ClinicasShort> findByPlanoDeSaudeOrderByNomeAsc(PlanoDeSaude planoDeSaude) {
		//Revisar a nomenclatura
		return null;// ClinicasShort.toClinicasShort(clinicasRep.findByPlanoDeSaudeOrderByNomeAsc(planoDeSaude));
	}
	
	public List<ClinicasLong> findAll(){
		return ClinicasLong.toClinicasLong((List<Clinicas>) this.clinicasRep.findAll());
	}

	public void atualizarClinicas(ClinicasShort c)
			throws ClinicasExistenteException {
		// TODO Auto-generated method stub
		
	}
	
}
