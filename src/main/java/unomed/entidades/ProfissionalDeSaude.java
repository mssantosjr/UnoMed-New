package unomed.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//import javax.persistence.Entidades;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class ProfissionalDeSaude implements Serializable {
	
	private static final long serialVersionUID = -8277445364627347945L;
	
	private Long id;
	private String crm;
	private String nome;
	private String especialidadeMedica;
	private String clinicaQAtua;
	
	public ProfissionalDeSaude(){
		
	}
	
	public ProfissionalDeSaude(String crm, String nome, String especialidadeMedica, String clinicaQAtua){
		this.crm = crm;
		this.nome = nome;
		this.especialidadeMedica = especialidadeMedica;
		this.clinicaQAtua = clinicaQAtua;
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
