package unomed.entidades.odc;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import unomed.entidades.Clinicas;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.odc.PlanoDeSaudeShort;


public class ClinicasLong extends ClinicasPai{

	private PlanoDeSaudeShort planoSaudeShort;
	private List<AgendarConsultaShort> agendarConsulta;
	
	public ClinicasLong(){
		
	}
	
	public ClinicasLong(PlanoDeSaudeShort planoSaudeShort, List<AgendarConsultaShort> agendarConsulta){
		this.planoSaudeShort = planoSaudeShort;
		this.agendarConsulta = agendarConsulta;
	}
	
	public ClinicasLong(Long id, String cpf, String nome, String endereco, String telefone,
	String tipoAcesso, String planoSaude){
		super(id, cpf, nome, endereco, telefone, tipoAcesso, planoSaude);
	}
	
	public ClinicasLong(String cpf, String nome, String endereco, String telefone,
	String tipoAcesso, String planoSaude){
		super(cpf, nome, endereco, telefone, tipoAcesso, planoSaude);
	}
	
	public static ClinicasLong toClinicasLong(Clinicas clinicas){
		ClinicasLong clinicasLong = new ClinicasLong();
		ClinicasPai clinicasPai = toClinicasPai(clinicas);
		if(clinicas != null){
			clinicasLong.setId(clinicasPai.getId());
			clinicasLong.setCpf(clinicasPai.getCpf());
			clinicasLong.setNome(clinicasPai.getNome());
			clinicasLong.setEndereco(clinicasPai.getEndereco());
			clinicasLong.setTelefone(clinicasPai.getTelefone());
			clinicasLong.setTipoAcesso(clinicasPai.getTipoAcesso());
			clinicasLong.setPlanoSaude(clinicasPai.getPlanoSaude());
		}
		return clinicasLong;
	}

	public static List<ClinicasLong> toClinicasLong(List<Clinicas> clinicasz){
		List<ClinicasLong> clinicasLong = new ArrayList<ClinicasLong>();
		if(clinicasz != null){
			for(Clinicas clinicas : clinicasz){
				clinicasLong.add(ClinicasLong.toClinicasLong(clinicas));
			}
		}
		return clinicasLong;
	}
	

public PlanoDeSaude getPlanoSaudeShort(){
	return PlanoDeSaudeShort.toPlanoDeSaude(planoSaudeShort);
}

public void setPlanoSaudeShort(PlanoDeSaudeShort planoSaudeShort){
	this.planoSaudeShort = planoSaudeShort;
}

public List<AgendarConsultaShort> getAgendarConsulta(){
	return agendarConsulta;
}

public void setAgendarConsulta(List<AgendarConsultaShort> agendarConsulta){
	this.agendarConsulta = agendarConsulta;
}
















































}
