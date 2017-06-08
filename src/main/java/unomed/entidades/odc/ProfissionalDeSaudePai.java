package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unomed.entidades.ProfissionalDeSaude;

public abstract class ProfissionalDeSaudePai {
	
	private Long id;
	private String crm;
	private String nome;
	private String especialidadeMedica;
	private String clinicaQAtua;
	
	
	public ProfissionalDeSaudePai(){
		
	}
	
	public ProfissionalDeSaudePai(String crm, String nome, String especialidadeMedica, String clinicaQAtua){
		this.crm = crm;
		this.nome = nome;
		this.especialidadeMedica = especialidadeMedica;
		this.clinicaQAtua = clinicaQAtua;
	}
	
	public ProfissionalDeSaudePai(Long id, String crm, String nome, String especialidadeMedica, String clinicaQAtua){
		this.id = id;
		this.crm = crm;
		this.nome = nome;
		this.especialidadeMedica = especialidadeMedica;
		this.clinicaQAtua = clinicaQAtua;
	}
	
	public static ProfissionalDeSaudePai toProfissionalDeSaudePai(ProfissionalDeSaude profissionalDeSaude){
		ProfissionalDeSaudePai profissionalDeSaudePai = new ProfissionalDeSaudeShort();
		if(profissionalDeSaude != null){
			profissionalDeSaudePai.setId(profissionalDeSaude.getId());
			profissionalDeSaudePai.setCrm(profissionalDeSaude.getCrm());
			profissionalDeSaudePai.setNome(profissionalDeSaude.getNome());
			profissionalDeSaudePai.setEspecialidadeMedica(profissionalDeSaude.getEspecialidadeMedica());
			profissionalDeSaudePai.setClinicaQAtua(profissionalDeSaude.getClinicaQAtua());
		}
		return profissionalDeSaudePai;
	}
	
	public static List<ProfissionalDeSaudePai> toProfissionalDeSaudePai(List<ProfissionalDeSaude> profissionalDeSaudez){
		List<ProfissionalDeSaudePai> profissionalDeSaudePai = new ArrayList<ProfissionalDeSaudePai>();
		if(profissionalDeSaudez != null){
			for(ProfissionalDeSaude profissionalDeSaude:profissionalDeSaudez){
				profissionalDeSaudePai.add(ProfissionalDeSaudePai.toProfissionalDeSaudePai(profissionalDeSaudez));
			}
		}
		return profissionalDeSaudePai;
	}
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidadeMedica() {
		return especialidadeMedica;
	}
	public void setEspecialidadeMedica(String especialidadeMedica) {
		this.especialidadeMedica = especialidadeMedica;
	}
	public String getClinicaQAtua() {
		return clinicaQAtua;
	}
	public void setClinicaQAtua(String clinicaQAtua) {
		this.clinicaQAtua = clinicaQAtua;
	}

}
