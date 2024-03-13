package br.com.fiap.springpjchamadostecnicos.repository;

import br.com.fiap.springpjchamadostecnicos.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
