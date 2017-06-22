package unomed.entidades;

import javax.persistence.Embeddable;


@Embeddable
public enum StatusDaMarcacao {
	
	CONCLUIDO, PENDENTE, CANCELADO;

}