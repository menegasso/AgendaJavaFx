package com.projetos.agenda.dao;

import com.projetos.agenda.model.TipoContato;
import org.hibernate.Session;

public class TipoContatoDao {

    public void salvar(TipoContato tipo) {

        try ( Session session = ConexaoBanco.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.merge(tipo);
            session.getTransaction().commit();
        }

        System.out.println("Registro Gravado com sucesso!");

    }

}
