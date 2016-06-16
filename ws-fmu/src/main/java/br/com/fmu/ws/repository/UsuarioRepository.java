package br.com.fmu.ws.repository;

import br.com.fmu.ws.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by wallace on 26/04/16.
 */
@Repository
//@CacheConfig(cacheNames = "userCache")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    /**
     * Busca o usuario pelo imei
     *
     * @param imei
     * @return
     */
    @Query("SELECT u FROM Usuario u WHERE u.imei = :imei ")
    Usuario findByImei(@Param("imei") String imei);

}
