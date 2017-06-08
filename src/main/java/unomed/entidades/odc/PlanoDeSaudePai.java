package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unomed.entidades.PlanoDeSaude;

public abstract class PlanoDeSaudePai {
	
	private Long id;
	private String nome;
	private String empresa;

	public PlanoDeSaudePai(){
		
	}
	
	public PlanoDeSaudePai(Long id, String nome, String empresa){
		this.id = id;
		this.nome = nome;
		this.empresa = empresa;
	}
	
	public PlanoDeSaudePai(String nome, String empresa){
		this.nome = nome;
		this.empresa = empresa;
	}

	public static PlanoDeSaude toPlanoDeSaude(PlanoDeSaudePai planoDeSaudePai){
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		List<PlanoDeSaude> list = new ArrayList<PlanoDeSaude>();
		if(planoDeSaude != null){
			planoDeSaude.setId(planoDeSaude.getId());
			planoDeSaude.setNome(planoDeSaude.getNome());
			planoDeSaude.setEmpresa(planoDeSaude.getEmpresa());
		}
		return planoDeSaude;
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
	
	
	// hash code e booleaana
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
