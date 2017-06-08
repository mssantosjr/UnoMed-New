package unomed.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;




public class PlanoDeSaude implements Serializable {
	
	private static final long serialVersionUID = -8277445364627347945L;
	
	private Long id;
	private String nome;
	private String empresa;
	
	public PlanoDeSaude(){
		
	}
	
	public PlanoDeSaude(String nome, String empresa){
		this.nome = nome;
		this.empresa = empresa;
	}
	
	public PlanoDeSaude(Long id, String nome, String empresa){
		this.id = id;
		this.nome = nome;
		this.empresa = empresa;
	}
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	

}
