package com.lucabotini.chapanelaspringboot.enums;

import lombok.Getter;

@Getter

public enum ItemEnum {

    PANELA_PRESSAO("Panela de Pressão"),
    FRIGIDEIRA("Frigideira"),
    PANELA_MEDIA("Panela Média"),
    PANELA_PEQUENA("Panela Pequena"),
    PANELA_GRANDE("Panela Grande"),
    JOGO_TALHERES("Jogo de Talheres"),
    JOGO_PRATOS("Jogo de Pratos"),
    JOGO_COPOS("Jogo de Copos"),
    JOGO_XICARAS("Jogo de Xícaras"),
    CONJUNTO_TUPPERWARE("Conjunto de Tupperware"),
    ESCORREDOR_ARROZ("Escorredor de Arroz"),
    ESCORREDOR_MACARRAO("Escorredor de Macarrão"),
    TABUA_CORTE("Tábua de Corte"),
    FACA_CHEF("Faca Chef"),
    FACA_PAO("Faca de Pão"),
    COLHER_PAULA("Colher de pau"),
    ESPATULA_SILICONE("Espátula de Silicone"),
    CONCHA("Concha"),
    ABRIDOR_LATAS("Abridor de Latas"),
    ABRIDOR_GARRAFAS("Abridor de Garrafas"),
    RALADOR("Ralador"),
    PENEIRA("Peneira"),
    FORMAS_ASSAR("Formas para Assar"),
    ASSADEIRA_RETANGULAR("Assadeira Retangular"),
    JARRA_SUCO("Jarra para Suco"),
    GARRAFA_TERMICA("Garrafa Térmica"),
    LIQUIDIFICADOR("Liquidificador"),
    BATEDEIRA("Batedeira"),
    CAFETEIRA("Cafeteira"),
    JOGO_PANO_PRATO("Jogo de panos de prato");

    private final String descricao;

    ItemEnum(String descricao) {
        this.descricao = descricao;
    }

}
