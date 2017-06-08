package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.List;

import unomed.entidades.ProfissionalDeSaude;

public class ProfissionalDeSaudeShort extends ProfissionalDeSaudePai {
	
	public ProfissionalDeSaudeShort(){
		
	}
	
	public static ProfissionalDeSaudeShort toProfissionalDeSaudeShort(ProfissionalDeSaude profissionalDeSaude){
		ProfissionalDeSaudeShort profissionalDeSaudeShort = new ProfissionalDeSaudeShort();
		if(profissionalDeSaude != null){
			profissionalDeSaudeShort.setId(profissionalDeSaude.getId());
			profissionalDeSaudeShort.setCrm(profissionalDeSaude.getCrm());
			profissionalDeSaudeShort.setNome(profissionalDeSaude.getNome());
			profissionalDeSaudeShort.setEspecialidadeMedica(profissionalDeSaude.getEspecialidadeMedica());
			profissionalDeSaudeShort.setClinicaQAtua(profissionalDeSaude.getClinicaQAtua());
		}
		return profissionalDeSaudeShort;
	}
	
	public static ProfissionalDeSaude toProfissionalDeSaude(ProfissionalDeSaudeShort profissionalDeSaudeShort){
		ProfissionalDeSaude profissionalDeSaude = new ProfissionalDeSaude();
		if(profissionalDeSaude != null){
			profissionalDeSaude.setId(profissionalDeSaudeShort.getId());
			profissionalDeSaude.setCrm(profissionalDeSaudeShort.getCrm());
			profissionalDeSaude.setNome(profissionalDeSaudeShort.getNome());
			profissionalDeSaude.setEspecialidadeMedica(profissionalDeSaudeShort.getEspecialidadeMedica());
			profissionalDeSaude.setClinicaQAtua(profissionalDeSaudeShort.getClinicaQAtua());
		}
		return profissionalDeSaude;
	}
	
	
	public static List<ProfissionalDeSaudeShort> toProfissionalDeSaudeShort(List<ProfissionalDeSaude> profissionalDeSaudez){
		List<ProfissionalDeSaudeShort> profissionalDeSaudeShorts = new ArrayList<ProfissionalDeSaudeShort>();
		if(profissionalDeSaudez != null){
			for(ProfissionalDeSaude profissionalDeSaude:profissionalDeSaudez){
				profissionalDeSaudeShorts.add(ProfissionalDeSaudeShort.toProfissionalDeSaudeShort(profissionalDeSaude));
			}
		}
		return profissionalDeSaudeShorts;
	}
	
	
	public static List<ProfissionalDeSaude> toProfissionalDeSaude(List<ProfissionalDeSaudeShort> profissionalDeSaudeShorts){
		List<ProfissionalDeSaude> profissionalDeSaude = new ArrayList<ProfissionalDeSaude>();
		if(profissionalDeSaudeShorts != null){
			for(ProfissionalDeSaudeShort profissionalDeSaudeShort : profissionalDeSaudeShorts){
				profissionalDeSaude.add(profissionalDeSaudeShort.toProfissionalDeSaude(profissionalDeSaudeShort));
			}
		}
		return profissionalDeSaude;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
