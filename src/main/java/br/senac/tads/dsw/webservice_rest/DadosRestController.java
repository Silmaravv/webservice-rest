package br.senac.tads.dsw.webservice_rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/dados")
public class DadosRestController {
    @Autowired
    private DadosService service;

    @GetMapping
    public List<DadosDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public DadosDto findById(@PathVariable("id") Integer id) {
        Optional<DadosDto> optDados = service.findById(id);
        if (!optDados.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return optDados.get();

    }
}