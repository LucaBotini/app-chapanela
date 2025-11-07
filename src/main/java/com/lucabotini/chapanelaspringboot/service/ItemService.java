package com.lucabotini.chapanelaspringboot.service;


import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.model.ItemEscolhido;
import com.lucabotini.chapanelaspringboot.repository.EscolhaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final EscolhaRepository repository;

    public void disableItem(ItemEnum item) {
        ItemEscolhido itemEscolhido = repository.findByItem(item)
                .orElseGet(() -> criarItem(item));

        itemEscolhido.setEnabled(false);
        repository.save(itemEscolhido);
    }

    public void enableItem(ItemEnum item) {
        ItemEscolhido itemEscolhido = repository.findByItem(item)
                .orElseGet(() -> criarItem(item));

        itemEscolhido.setEnabled(true);
        repository.save(itemEscolhido);
    }

    private ItemEscolhido criarItem(ItemEnum item) {
        ItemEscolhido novo = new ItemEscolhido();
        novo.setItem(item);
        return novo;
    }
}

