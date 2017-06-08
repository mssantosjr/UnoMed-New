package unomed.entidades;

import java.text.SimpleDateFormat;

public class AgendarConsulta {
	
	private SimpleDateFormat spd;
	private String hora;
	private String dia;
	private String mes;
	private String ano;
	private static int disponivel=1;
	private static int ocupado=0;
	private Clinicas tipoAcesso;//Se eh usuario comum ou adm
	
	public AgendarConsulta(){
		//Construtor padrão
	}
	
	public AgendarConsulta(String hora, String dia, String mes, String ano,
			Clinicas tipoAcesso) {
		super();
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.tipoAcesso = tipoAcesso;
	}
	public SimpleDateFormat getSpd() {
		return spd;
	}
	public void setSpd(SimpleDateFormat spd) {
		this.spd = spd;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public static int getDisponivel() {
		return disponivel;
	}
	public static void setDisponivel(int disponivel) {
		AgendarConsulta.disponivel = disponivel;
	}
	public static int getOcupado() {
		return ocupado;
	}
	public static void setOcupado(int ocupado) {
		AgendarConsulta.ocupado = ocupado;
	}
	public Clinicas getTipoAcesso() {
		return tipoAcesso;
	}
	public void setTipoAcesso(Clinicas tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

}
