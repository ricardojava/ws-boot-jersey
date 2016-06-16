package br.com.fmu.ws.web.api;

import br.com.fmu.ws.model.Pesquisa;
import br.com.fmu.ws.service.PesquisaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wallace on 26/04/16.
 */
@RestController
public class PesquisaController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PesquisaService pesquisaService;

    /**
     * Cadastra a avaliacao no BD
     *
     * @param pesquisa
     * @return
     */
    @RequestMapping(value = "/pesquisa",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pesquisa> avaliacao(@RequestBody Pesquisa pesquisa) {
        logger.info("AvaliacaoController.avaliacao");
        Pesquisa p = this.pesquisaService.create(pesquisa);
        logger.info(p.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }


}