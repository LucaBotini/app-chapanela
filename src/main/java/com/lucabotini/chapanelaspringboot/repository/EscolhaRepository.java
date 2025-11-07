package com.lucabotini.chapanelaspringboot.repository;

import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import com.lucabotini.chapanelaspringboot.entity.ItemEscolhido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EscolhaRepository extends JpaRepository<ItemEscolhido, Long> {
    Optional<ItemEscolhido> findByItem(ItemEnum item);
}
