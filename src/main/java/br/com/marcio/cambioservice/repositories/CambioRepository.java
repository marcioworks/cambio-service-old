package br.com.marcio.cambioservice.repositories;

import br.com.marcio.cambioservice.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<Cambio,Long> {
    Cambio findByFromAndTo(String from, String to);
}
