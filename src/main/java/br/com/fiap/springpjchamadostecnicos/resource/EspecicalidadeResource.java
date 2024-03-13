package br.com.fiap.springpjchamadostecnicos.resource;

import br.com.fiap.springpjchamadostecnicos.entity.Especialidade;
import br.com.fiap.springpjchamadostecnicos.repository.EspecialidadeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/especialidade")
public class EspecicalidadeResource {

    @Autowired
    private EspecialidadeRepository repo;

    @GetMapping
    public List<Especialidade> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Especialidade findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Especialidade save(@RequestBody Especialidade especialidade) {
        return repo.save(especialidade);
    }
}
