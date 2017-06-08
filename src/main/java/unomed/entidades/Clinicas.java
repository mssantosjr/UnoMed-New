package unomed.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Clinicas implements Serializable {
	
	//todos estao com o mesmo uid TESTE ATUALIZACAO GIT
	private static final long serialVersionUID = -8277445364627347945L;
	
	private Long id;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String tipoAcesso; //cliente ou usuário // Não eh cliente ou adm não?
	private String planoSaude;
	private String email;
	
	public Clinicas(){
		
	}
	
	public Clinicas(String cpf, String nome, String endereco, String telefone, String tipoAcesso, String planoSaude){
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipoAcesso = tipoAcesso;
		this.planoSaude = planoSaude;
	}
	
	public Clinicas(Long id, String cpf, String nome, String endereco, String telefone, String tipoAcesso, String planoSaude){
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipoAcesso = tipoAcesso;
		this.planoSaude = planoSaude;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
