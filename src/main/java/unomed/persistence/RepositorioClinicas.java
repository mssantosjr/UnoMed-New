package unomed.persistence;

import org.springframework.data.repository.CrudRepository;
import unomed.entidades.Clinicas;
import java.util.List;
import unomed.entidades.PlanoDeSaude;
import unomed.entidades.ProfissionalDeSaude;

/**
 * define todos os metodos necessarios par ao repositorio da entidade clinicas
 * @author Misa
 *
 */


public interface RepositorioClinicas extends CrudRepository<Clinicas, Long> {
	
	/**
	 * procura um usuario por cpf
	 * 
	 */
	
	public Clinicas findByCpf(String cpf);
	
	/**
	 * procura todos os usuario pelo seu nome
	 */
	
	public Clinicas findByNome(String nome);
	
	/**
	 * procura todos os usuario por plano de saude
	 */
	
	public List<Clinicas> findByPlanoDeSaudeOrderByNomeAsc(String planoDeSaude);
	
	
	
	
	
	
	

}
