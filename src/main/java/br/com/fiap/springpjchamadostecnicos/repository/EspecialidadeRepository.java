package br.com.fiap.springpjchamadostecnicos.repository;

import br.com.fiap.springpjchamadostecnicos.entity.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}
