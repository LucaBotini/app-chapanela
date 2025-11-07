package com.lucabotini.chapanelaspringboot.controller;

import com.lucabotini.chapanelaspringboot.dto.EscolhaDTO;
import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.service.EscolhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolha")
@RequiredArgsConstructor
public class EscolhaController {

    private final EscolhaService service;

    // Retorna apenas os habilitados (para o <select>)
    @GetMapping("/itens")
    public List<String> listarItensDisponiveis() {
        return service.listarItensDisponiveis()
                .stream()
                .map(Enum::name)
                .toList();
    }

    // Registrar escolha
    @PostMapping
    public ResponseEntity<String> registrar(
            @RequestParam String nome,
            @RequestParam ItemEnum item) {

        service.registrarEscolha(nome, item);
        return ResponseEntity.ok("Registrado!");
    }

    @GetMapping
    public List<EscolhaDTO> listarEscolhas() {
        return service.listarEscolhas();
    }
}

