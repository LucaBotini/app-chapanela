package com.lucabotini.chapanelaspringboot.config;

import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.entity.ItemEscolhido;
import com.lucabotini.chapanelaspringboot.repository.EscolhaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final EscolhaRepository repository;

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            for (ItemEnum item : ItemEnum.values()) {
                ItemEscolhido escolhido = new ItemEscolhido();
                escolhido.setItem(item);
                escolhido.setEnabled(true);
                repository.save(escolhido);
            }
            System.out.println("✅ Itens carregados no banco!");
        }
    }
}
