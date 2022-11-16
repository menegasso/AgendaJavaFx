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
        config.setProperty("hibernate.connection.password", "");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/agenda");
        config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        config.setProperty("hibernate.hbm2ddl.auto", "update");
        config.setProperty("hibernate.show_sql", "true");
        config.setProperty("hibernate.format_sql", "true");
                
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
