package com.lucabotini.chapanelaspringboot.service;

import com.lucabotini.chapanelaspringboot.dto.EscolhaDTO;
import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.entity.ItemEscolhido;
import com.lucabotini.chapanelaspringboot.repository.EscolhaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EscolhaService {

    private final EscolhaRepository repository;

    public List<ItemEnum> listarItensDisponiveis() {
        return repository.findAll().stream()
                .filter(ItemEscolhido::isEnabled)
                .map(ItemEscolhido::getItem)
                .toList();
    }

    public void registrarEscolha(String nome, ItemEnum item) {
        ItemEscolhido itemEscolhido = repository.findByItem(item)
                .orElseThrow(() -> new RuntimeException("Item não encontrado no banco!"));

        if (!itemEscolhido.isEnabled()) {
            throw new RuntimeException("Esse item já foi escolhido!");
        }

        itemEscolhido.setNome(nome);
        itemEscolhido.setEnabled(false); // Desabilita automaticamente
        repository.save(itemEscolhido);
    }

    public List<EscolhaDTO> listarEscolhas() {
        return repository.findAll().stream()
//                .filter(ItemEscolhido::isEnabled) // se quiser os habilitados, usar isEnabled(); para escolhidos = !isEnabled()
                .filter(item -> !item.isEnabled()) // se quiser só os escolhidos, manter essa linha em vez da anterior
                .map(item -> new EscolhaDTO(item.getNome(), item.getItem()))
                .toList();
    }

}

