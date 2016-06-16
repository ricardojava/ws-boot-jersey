package br.com.fmu.ws.repository;

import br.com.fmu.ws.model.Pesquisa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wallace on 26/04/16.
 */
@Repository
public interface PesquisaRepository extends JpaRepository<Pesquisa, Long> {

}
