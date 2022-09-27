package com.projetos.agenda.dao;

import com.projetos.agenda.model.Cidade;
import com.projetos.agenda.model.Contato;
import com.projetos.agenda.model.TipoContato;
import com.projetos.agenda.model.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexaoBanco {
    private static SessionFactory conexao = null;
    private static Configuration config;
    
    private static SessionFactory buildSessionFactory(){
        config = new Configuration().configure();
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "root1234");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/agenda?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");
        config.setProperty("hibernate.hbm2ddl.auto", "create");
                
        config.addPackage("com.projetos.agenda.model").addAnnotatedClass(TipoContato.class);
        config.addPackage("com.projetos.agenda.model").addAnnotatedClass(Contato.class);
        config.addPackage("com.projetos.agenda.model").addAnnotatedClass(Usuario.class);
        config.addPackage("com.projetos.agenda.model").addAnnotatedClass(Cidade.class);
        
        conexao = config.buildSessionFactory();
        return conexao;
    }
    
    public static SessionFactory getSessionFactory(){
        if (conexao == null){
            conexao = buildSessionFactory();
        }
        return conexao;
    }
}
