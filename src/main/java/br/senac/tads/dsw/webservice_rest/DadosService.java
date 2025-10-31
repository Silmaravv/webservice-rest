package br.senac.tads.dsw.webservice_rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class DadosService {
    private Map<Integer, DadosDto> dados;
    public DadosService() {
        dados = new HashMap<>();
        dados.put(1, new DadosDto(1, "Fulano da Silva", "2000-10-20",
                "fulano@email.com", "11 99999-9999"));
        dados.put(2, new DadosDto(2, "Ciclano de Souza", "1999-05-15",
                "ciclano@email.com", "11 98888-8888"));
        dados.put(3, new DadosDto(3, "Beltrana dos Santos", "2001-02-09",
                "beltrana@email.com", "11 97777-7777"));
    }
    public List<DadosDto> findAll() {
        return new ArrayList<>(dados.values());
    }
    public Optional<DadosDto> findById(Integer id) {
        return Optional.ofNullable(dados.get(id));
    }
}