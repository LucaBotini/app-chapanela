package com.lucabotini.chapanelaspringboot.repository;

import com.lucabotini.chapanelaspringboot.entity.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
    Convidado findByNome(String nome);
}
