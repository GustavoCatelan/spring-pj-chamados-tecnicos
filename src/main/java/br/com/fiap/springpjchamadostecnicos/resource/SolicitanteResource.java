package br.com.fiap.springpjchamadostecnicos.resource;

import br.com.fiap.springpjchamadostecnicos.entity.*;
import br.com.fiap.springpjchamadostecnicos.repository.EnderecoRepository;
import br.com.fiap.springpjchamadostecnicos.repository.SolicitanteRepository;
import br.com.fiap.springpjchamadostecnicos.repository.TelefoneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@RestController
@RequestMapping(value = "/solicitante")
public class SolicitanteResource {

    @Autowired
    private SolicitanteRepository repo;

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    public List<Solicitante> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Solicitante findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Solicitante save(@RequestBody Solicitante solicitante) {
        return repo.save(solicitante);
    }

    @Transactional
    @PostMapping(value = "/{id}/endereco")
    public Solicitante addEndereco(@PathVariable Long id, @RequestBody Endereco a) {
        Solicitante solicitante = repo.findById(id).orElseThrow();
        a.setSolicitante(solicitante);
        return solicitante;
    }

    @GetMapping(value = "/{id}/endereco")
    public Set<Endereco> findEndereco(@PathVariable Long id) {
        Solicitante solicitante = repo.findById(id).orElseThrow();
        return null;
    }

    @Transactional
    @PostMapping(value = "/{id}/telefone")
    public Solicitante addTelefone(@PathVariable Long id, @RequestBody Telefone a) {
        Solicitante solicitante = repo.findById(id).orElseThrow();
        a.setSolicitante(solicitante);
        return solicitante;
    }

    @GetMapping(value = "/{id}/telefone")
    public Set<Telefone> findTelefone(@PathVariable Long id) {
        Solicitante solicitante = repo.findById(id).orElseThrow();
        return null;
    }
}
