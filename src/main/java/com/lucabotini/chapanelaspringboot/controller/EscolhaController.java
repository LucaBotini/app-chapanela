package com.lucabotini.chapanelaspringboot.controller;

import com.lucabotini.chapanelaspringboot.dto.EscolhaDTO;
import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.service.EscolhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/escolha")
@RequiredArgsConstructor
public class EscolhaController {

    private final EscolhaService service;

    // Retorna apenas os habilitados (para o <select>)
    @GetMapping("/itens")
    public List<Map<String, String>> listarItens() {
        return Arrays.stream(ItemEnum.values())
                .map(item -> Map.of(
                        "value", item.name(),
                        "label", item.getDescricao()
                ))
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

