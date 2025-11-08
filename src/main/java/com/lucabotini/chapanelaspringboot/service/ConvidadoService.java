package com.lucabotini.chapanelaspringboot.service;

import com.lucabotini.chapanelaspringboot.entity.Convidado;
import com.lucabotini.chapanelaspringboot.exception.EscolhaInvalidaException;
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

        if(convidado == null){
            throw new EscolhaInvalidaException("O nome não pode ser vazio.");
        }

        return repository.save(convidado);
    }

    public List<Convidado> listar(){
        return repository.findAll(Sort.by("nome"));
    }

    public void salvarTodos(List<Convidado> convidados){

        if(convidados == null){
            throw new EscolhaInvalidaException("O nome não pode ser vazio.");
        }

        repository.saveAll(convidados);
    }

}
