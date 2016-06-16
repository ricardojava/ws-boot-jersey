package br.com.fmu.ws.web.api;

import br.com.fmu.ws.model.Usuario;
import br.com.fmu.ws.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wallace on 26/04/16.
 */
@RestController
public class UsuarioController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Cadastra o usuario no BD.
	 *
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> grava(@RequestBody Usuario usuario) {
		logger.info("UsuarioController.gravaUsuario");

		try {

			Usuario u = this.usuarioService.create(usuario);
			logger.info(u.toString());
		} catch (DataIntegrityViolationException e) {
			logger.error(e.getMessage());
			return new ResponseEntity<Usuario>(HttpStatus.CONFLICT);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<Usuario>(HttpStatus.EXPECTATION_FAILED);
		}

		return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
	}

	/**
	 * Valida se o imei ja esta cadastrado na base de dados
	 *
	 * @param imei
	 * @return
	 */
	@RequestMapping(value = "/usuarios/imei/{imei}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> validaImei(@PathVariable("imei") String imei) {
		logger.info("UsuarioController.validaImei: " + imei);
		Usuario u = this.usuarioService.getUserByImei(imei);
		String retorno = u != null ? u.getRa() : "0";
		return new ResponseEntity<String>("{\"request\":[{\"ra\":\"" + retorno + "\"}]}", HttpStatus.OK);
	}

}