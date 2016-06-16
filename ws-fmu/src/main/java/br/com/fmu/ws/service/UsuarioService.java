package br.com.fmu.ws.service;

import br.com.fmu.ws.model.Usuario;
import br.com.fmu.ws.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wallace on 26/04/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UsuarioService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsuarioRepository usuarioRepository;

	// @Cacheable(value = "userCache", key = "#imei")
	public Usuario getUserByImei(String imei) {
		return usuarioRepository.findByImei(imei);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	// @CachePut(value = "userCache", key = "#usuario.imei")
	public Usuario create(Usuario usuario) {
		logger.info("UsuarioServiceImpl.create");
		Usuario u = this.usuarioRepository.save(usuario);
		logger.info("Usuario cadastrado com sucesso!");
		return u;
	}

}
