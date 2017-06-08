package unomed.entidades.odc;

import java.util.ArrayList;
import java.util.List;

import unomed.entidades.Clinicas;

public class ClinicasShort extends ClinicasPai{
	
	public ClinicasShort() {
		super();
	}

	public static ClinicasShort toClinicasShort(Clinicas clinicas) {
		ClinicasShort clinicasShort = new ClinicasShort();
		if(clinicas != null){
			clinicasShort.setId(clinicas.getId());
			clinicasShort.setCpf(clinicas.getCpf());
			clinicasShort.setNome(clinicas.getNome());
			clinicasShort.setEndereco(clinicas.getEndereco());
			clinicasShort.setTelefone(clinicas.getTelefone());
			clinicasShort.setTipoAcesso(clinicas.getTipoAcesso());
			clinicasShort.setPlanoSaude(clinicas.getPlanoSaude());
		}
		return clinicasShort;
	}
	
	public static Clinicas toClinicas(ClinicasShort clinicasShort) {
		Clinicas clinicas = new Clinicas();
		if(clinicasShort != null){
			clinicas.setId(clinicasShort.getId());
			clinicas.setCpf(clinicasShort.getCpf());
			clinicas.setNome(clinicasShort.getNome());
			clinicas.setEndereco(clinicasShort.getEndereco());
			clinicas.setTelefone(clinicasShort.getTelefone());
			clinicas.setTipoAcesso(clinicasShort.getTipoAcesso());
			clinicas.setPlanoSaude(clinicasShort.getPlanoSaude());
		}
		return clinicas;
	}
	
	public static List<ClinicasShort> toClinicasShort(List<Clinicas> clinicasz){
		List<ClinicasShort> clinicasShorts = new ArrayList<ClinicasShort>();
		if(clinicasz != null){
			for(Clinicas clinicas : clinicasz){
				clinicasShorts.add(ClinicasShort.toClinicasShort(clinicas));
			}
		}
		return clinicasShorts;
	}
	
	
	public static List<Clinicas> toClinicas(List<ClinicasShort> clinicasShorts){
		List<Clinicas> clinicas = new ArrayList<Clinicas>();
		if(clinicasShorts != null){
			for(ClinicasShort clinicasShort : clinicasShorts){
				clinicas.add(ClinicasShort.toClinicas(clinicasShort));
			}
		}
		return clinicas;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
