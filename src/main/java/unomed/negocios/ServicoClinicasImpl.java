package unomed.negocios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import unomed.entidades.AgendarConsulta;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;
import unomed.entidades.odc.ClinicasLong;
import unomed.entidades.odc.ClinicasShort;
import unomed.exception.ClinicasExistenteException;
import unomed.exception.ClinicasInexistenteException;
import unomed.persistence.RepositorioClinicas;

public class ServicoClinicasImpl implements ServicoClinicas {
	
	private static final long serialVersionUID = 1336061289381836117L;
	
	private RepositorioClinicas clinicasRep;
	
	private ServicoAgendarConsulta agendarConsultaServ;
	
	(rollbackFor = ClinicasExistenteException.class)
	public void adicionarClinicas(ClinicasShort c) throws ClinicasExistenteException {
		try {
			ClinicasShort clinicas = this.findByCpf(c.getCpf());
			if (clinicas.getNome() != null)
				throw new ClinicasExistenteException();
		} catch (ClinicasInexistenteException e) {
			this.clinicasRep.save(ClinicasShort.toClinicas(c));
		}
	}
	
	(rollbackFor = ClinicasInexistenteException.class)
	public void atualizarClinica(ClinicasShort c) throws ClinicasInexistenteException {
		ClinicasShort old = this.findByCpf(c.getCpf());
		old.setCpf(c.getCpf());
		old.setNome(c.getNome());
		old.setEndereco(c.getEndereco());
		old.setTelefone(c.getTelefone());
		old.setTipoDeAcesso(c.getTipoDeAcesso());
		old.setPlanoSaude(c.getPlanoSaude());
		this.clinicasRep.save(ClinicasShort.toClinicas(old));

	}
	
	(rollbackFor = ClinicasInexistenteException.class)
	public void removerClinicas(Long id) throws ClinicasInexistenteException {
		Clinicas old = this.clinicasRep.findOne(id);
		
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
	}
	
	public ClinicasShort findByCpf(String cpf) throws ClinicasInexistenteException{
		ClinicasShort clinicas = ClinicasShort.toClinicasShort(this.clinicasRep.findByCpf(cpf));
		if (clinicas.getNome() == null)
			throw new ClinicasInexistenteException();
		return clinicas;
	}
	
	public ClinicasLong findByTelefone(String telefone) {
		return ClinicasLong.toClinicasLong(this.clinicasRep.findByTelefone(telefone));
	}
	
	public List<ClinicasShort> findByNomeOrderByNomeAsc(String nome) {
		return ClinicasShort.toClinicasShort(this.clinicasRep.findByNomeOrderByNomeAsc(nome));
	}
	
	public ClinicasShort findOneClinicas(Long id) {
		return ClinicasShort.toClinicasShort(this.clinicasRep.findOne(id));
	}
	
	public List<ClinicasShort> findByPlanoDeSaudeOrderByNomeAsc(PlanoDeSaude planoDeSaude) {
		return ClinicasShort.toClinicasShort(this.clinicasRep.findByPlanoDeSaudeOrderByNomeAsc(planoDeSaude));
	}
	
	public List<ClinicasLong> findAll(){
		return ClinicasLong.toClinicasLong((List<Clinicas>) this.clinicasRep.findAll());
	}
	
	
	

}
