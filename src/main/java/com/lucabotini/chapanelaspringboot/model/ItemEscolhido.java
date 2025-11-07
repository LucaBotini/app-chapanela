package com.lucabotini.chapanelaspringboot.model;

import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor

@Data
@Entity
public class ItemEscolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 50, message = "Tamanho de nome menor que 3.")
    private String nome;

    @Enumerated(EnumType.STRING)
    private ItemEnum item;

    private boolean enabled = true;

    public ItemEscolhido(String nome, ItemEnum item) {
        this.nome = nome;
        this.item = item;
    }
}
