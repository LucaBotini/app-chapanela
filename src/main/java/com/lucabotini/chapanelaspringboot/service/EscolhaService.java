package com.lucabotini.chapanelaspringboot.service;

import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.model.ItemEscolhido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EscolhaService {

    private final List<ItemEscolhido> escolhas = new ArrayList<>();

    public ItemEscolhido salvar(String nome, ItemEnum item) {
        ItemEscolhido escolhido = new ItemEscolhido(nome, item);
        escolhas.add(escolhido);
        System.out.printf("Salvo com sucesso!");
        return escolhido;
    }

    public List<ItemEscolhido> listarTodos() {
        return escolhas;
    }
}

