package unomed.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import unomed.entidades.Clinicas;
import unomed.entidades.odc.ClinicasShort;
import unomed.exception.ClinicasExistenteException;
import unomed.negocios.Fachada;

/**
 * Responsável pelo controle de qual entidade com a requisição necessária para
 * tal
 */

@Controller
public class ControllerUser {

	private Fachada fachada;

	public ResponseEntity<Void> adicionarClinica(ClinicasShort c) {
		return null;

		/*
		 * try { this.fachada.adicionarClinicas(c); } catch
		 * (ClinicasExistenteException e) { return new
		 * ResponseEntity<ClinicasExistenteException>(e,
		 * HttpStatus.BAD_REQUEST); //Type mismatch: cannot convert from
		 * //ResponseEntity<ClinicasExistenteException> to
		 * ResponseEntity<Clinicas> }
		 * 
		 * return new ResponseEntity<Clinicas>(HttpStatus.OK);
		 */
	}

	// Mapeando como uma url
	@RequestMapping("/b")
	@ResponseBody
	String home() {
		return "<html><h2><center>Seja Bem Vindo ao UnoMed-New</center></h2></html>";
	}

}