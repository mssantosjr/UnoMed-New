package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.List;

import unomed.entidades.PlanoDeSaude;


public class PlanoDeSaudeShort extends PlanoDeSaudePai {
	
	public  PlanoDeSaudeShort(){
		super();
	}

	
	public PlanoDeSaudeShort(Long id, String nome, String empresa){
		super(id, nome, empresa);
	}
	
	//public PlanoDeSaudeShort(String nome, List<AgendarConsulta>)
	
	public static PlanoDeSaudeShort toPlanoDeSaude(PlanoDeSaude planoDeSaude){
		PlanoDeSaudeShort planoDeSaudeShort = new PlanoDeSaudeShort();
		if(planoDeSaude != null){
			planoDeSaudeShort.setId(planoDeSaude.getId());
			planoDeSaudeShort.setNome(planoDeSaude.getNome());
			planoDeSaudeShort.setEmpresa(planoDeSaude.getEmpresa());
			return planoDeSaudeShort;
		} else{
			return null;
		}
		
	}
	
	
	
	
	
}
