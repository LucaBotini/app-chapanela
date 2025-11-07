package com.lucabotini.chapanelaspringboot.service;

import com.lucabotini.chapanelaspringboot.entity.Convidado;
import com.lucabotini.chapanelaspringboot.repository.ConvidadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class ConvidadoService {

    private final ConvidadoRepository repository;

    public Convidado salvar(Convidado convidado){
        return repository.save(convidado);
    }

    public List<Convidado> listar(){
        return repository.findAll(Sort.by("nome"));
    }

    public void salvarTodos(List<Convidado> convidados){
        repository.saveAll(convidados);
    }

}
