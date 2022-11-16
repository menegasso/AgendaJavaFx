package com.projetos.agenda.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contato")
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private Long numero;

    @OneToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @Column(name = "email")
    private String email;

    @Column(name = "nascimento")
    private String nascimento;

    @Column(name = "telefone1")
    private String telefone1;

    @Column(name = "telefone2")
    private String telefone2;

    @OneToOne
    @JoinColumn(name = "id_tipo_contato")
    private TipoContato tipoContato;
    
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}