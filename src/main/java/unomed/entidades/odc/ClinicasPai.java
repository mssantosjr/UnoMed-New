package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unomed.entidades.Clinicas;

public abstract class ClinicasPai {
	
	private Long id;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String tipoAcesso; 
	private String planoSaude; 

	public ClinicasPai(){
		
	}
	
	public ClinicasPai(String cpf, String nome, String endereco, String telefone, String tipoAcesso,
	String planoSaude){
		
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipoAcesso = tipoAcesso;
		this.planoSaude = planoSaude;
		
	}
	
	public ClinicasPai(Long id, String cpf, String nome, String endereco, String telefone,
	String tipoAcesso, String planoSaude){
		
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipoAcesso = tipoAcesso;
		this.planoSaude = planoSaude;
		
	}
	
	public static ClinicasPai toClinicasPai(Clinicas clinicas){
		ClinicasPai clinicasPai = new ClinicasShort();
		if(clinicas != null){
			clinicasPai.setId(clinicas.getId());
			clinicasPai.setNome(clinicas.getNome());
			clinicasPai.setEndereco(clinicas.getEndereco());
			clinicasPai.setTelefone(clinicas.getTelefone());
			clinicasPai.setTipoAcesso(clinicas.getTipoAcesso());
			clinicasPai.setPlanoSaude(clinicas.getPlanoSaude());
		}
		return clinicasPai;
	}
	
	public static List<ClinicasPai> toClinicasPai(List<Clinicas> clinicasz){
		List<ClinicasPai> clinicasPai = new ArrayList<ClinicasPai>();
		if(clinicasz != null) {
			for(Clinicas clinicas:clinicasz) {
				clinicasPai.add(ClinicasPai.toClinicasPai(clinicas));
			}
		}
		return clinicasPai;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(String tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	
	
	
	// booleana que não sei pra que serve
	
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((tipoAcesso == null) ? 0 : tipoAcesso.hashCode());
		result = prime * result + ((planoSaude == null) ? 0 : planoSaude.hashCode());
		
		//Adicionar o retorno correto
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
