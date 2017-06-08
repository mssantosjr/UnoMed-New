package unomed.entidades.odc;

import java.util.List;

public class PlanoDeSaudeLong extends PlanoDeSaudePai {

	public PlanoDeSaudeLong() {
		super();
	}

	public PlanoDeSaudeLong(Long id, String nome, String empresa) {
		super(id, nome, empresa);
	}
	
	private List<String> PlanoDeSaudeLong(){
		return PlanoDeSaudeLong().subList(0, 1);
	}

}
