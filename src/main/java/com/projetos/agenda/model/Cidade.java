package com.projetos.agenda.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cidade {

    private Long id;
    private String descricao;
    private String uf;
    private String cep;

}
