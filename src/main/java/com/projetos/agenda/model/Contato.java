package com.projetos.agenda.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {

    private Long id;
    private String descricao;
    private String endereco;
    private int numero;
    private int idCidade;
    private String email;
    private String nascimento;
    private String telefone1;
    private String telefone2;
    private int idTipoContato;

}
