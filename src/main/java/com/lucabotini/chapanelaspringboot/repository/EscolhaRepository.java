package com.lucabotini.chapanelaspringboot.repository;

import com.lucabotini.chapanelaspringboot.model.ItemEscolhido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolhaRepository extends JpaRepository<ItemEscolhido, Long> {
}
