package com.projetos.agenda.dao;

import com.projetos.agenda.model.TipoContato;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class TipoContatoDao {

    public void salvar(TipoContato tipo) {

        try ( Session session = ConexaoBanco.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.merge(tipo);
            session.getTransaction().commit();
            session.close();
        }

        System.out.println("Registro salvo com sucesso!");

    }

    public List<TipoContato> consulta(String descricao) {
        List<TipoContato> lista = new ArrayList();

        try ( Session session = ConexaoBanco.getSessionFactory().openSession()) {
            session.beginTransaction();
            if (descricao.length() == 0) {
                lista = session.createQuery(" from TipoContato ").getResultList();
            } else {
                lista = session.createQuery(" from TipoContato t where t.descricao like " + "'" + descricao + "%'").getResultList();
            }
            session.getTransaction().commit();
            session.close();
        }

        return lista;
    }

}
