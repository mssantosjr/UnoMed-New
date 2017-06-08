package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unomed.entidades.Clinicas;


public class ClinicasLong extends ClinicasPai{

	private PlanoSaudeShort planoSaudeShort;
	private List<AgendarConsultaShort> agendarConsulta;
	
	public ClinicasLong(){
		
	}
	
	public ClinicasLong(PlanoSaudeSHort planoSaudeShort, List<AgendarConsultaShort> agendarConsulta){
		this.planoSaudeShort = planoSaudeShort;
		this.agendarConsulta = agendarConsultaShort;
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
	

public PlanoSaude getPlanoSaudeShort(){
	return planoSaudeShort;
}

public void setPlanoSaudeShort(PlanoSaudeShort planoSaudeShort){
	this.planoSaudeShort = planoSaudeShort;
}

public List<AgendarConsultaShort> getAgendarConsulta(){
	return agendarConsulta;
}

public void setAgendarConsulta(Lost<AgendarConsultaShort> agendarConsulta){
	this.agendarConsulta = agendarConsulta;
}


//// booleana que não sei pra que serve 


















































}
