package com.lucabotini.chapanelaspringboot.model;

import com.lucabotini.chapanelaspringboot.enums.ItemEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor

@Entity
public class ItemEscolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 50, message = "Tamanho de nome menor que 3.")
    private String nome;

    @Enumerated(EnumType.STRING)
    private ItemEnum item;

    public ItemEscolhido(String nome, ItemEnum item) {
        this.nome = nome;
        this.item = item;
    }
}
