package br.com.fmu.ws.service;

import br.com.fmu.ws.model.Pesquisa;
import br.com.fmu.ws.model.Usuario;
import br.com.fmu.ws.repository.PesquisaRepository;
import br.com.fmu.ws.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wallace on 26/04/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PesquisaService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PesquisaRepository pesquisaRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public Pesquisa create(Pesquisa pesquisa) {
		logger.info("PesquisaService.create");
		Pesquisa p = this.pesquisaRepository.save(pesquisa);
		logger.info("Pesauisa cadastrado com sucesso!");
		return p;
	}

}
