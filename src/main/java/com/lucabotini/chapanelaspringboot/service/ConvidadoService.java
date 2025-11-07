package com.lucabotini.chapanelaspringboot.service;

import com.lucabotini.chapanelaspringboot.entity.Convidado;
import com.lucabotini.chapanelaspringboot.repository.ConvidadoRepository;
import lombok.AllArgsConstructor;
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
        return repository.findAll();
    }
}
