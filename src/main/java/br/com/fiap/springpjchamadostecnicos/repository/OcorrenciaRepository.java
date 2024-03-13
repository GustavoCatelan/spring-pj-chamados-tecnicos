package br.com.fiap.springpjchamadostecnicos.repository;

import br.com.fiap.springpjchamadostecnicos.entity.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
