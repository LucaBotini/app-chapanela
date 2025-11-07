package com.lucabotini.chapanelaspringboot.controller;


import com.lucabotini.chapanelaspringboot.entity.Convidado;
import com.lucabotini.chapanelaspringboot.repository.ConvidadoRepository;
import com.lucabotini.chapanelaspringboot.service.ConvidadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/convidados")
public class ConvidadoController {

    private final ConvidadoService service;

    @PostMapping
    public Convidado cadastrar(@RequestBody Convidado convidado){
        return service.salvar(convidado);
    }

    @GetMapping
    public List<Convidado> listar(){
        return service.listar();
    }

    @PostMapping("/lote")
    public ResponseEntity<?> salvarEmLote(@RequestBody List<Convidado> convidados) {
        service.salvarTodos(convidados);
        return ResponseEntity.ok("Convidados salvos com sucesso!");
    }
}
