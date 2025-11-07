package com.lucabotini.chapanelaspringboot.controller;

import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.model.ItemEscolhido;
import com.lucabotini.chapanelaspringboot.service.EscolhaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/escolha")
public class EscolhaController {

    private final EscolhaService service;

    @PostMapping
    public ItemEscolhido escolher(
            @RequestParam String nome,
            @RequestParam ItemEnum item) {

        return service.salvar(nome, item);
    }

    @GetMapping("/itens")
    public ItemEnum[] listarItens() {
        return ItemEnum.values();
    }

    @GetMapping()
    public List<ItemEscolhido> listarTodos() {
        return service.listarTodos();
    }
}

