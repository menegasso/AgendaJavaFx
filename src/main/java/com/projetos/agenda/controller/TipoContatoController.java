package com.projetos.agenda.controller;

import com.projetos.agenda.dao.TipoContatoDao;
import com.projetos.agenda.model.TipoContato;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TipoContatoController implements Initializable {

    @FXML
    private TextField tfId;
    @FXML
    private TextField tfDescricao;
    @FXML
    private Button btnNovo;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnExcluir;
    @FXML
    private TextField tfPesquisa;
    @FXML
    private TableView<?> tableView;
    @FXML
    private Label lbTitulo;

    TipoContatoDao dao = new TipoContatoDao();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbTitulo.setText("Cadastro de Tipo de Contato");
    }

    @FXML
    private void btnNovo(ActionEvent event) {
    }

    @FXML
    private void btnSalvar(ActionEvent event) {
        
        TipoContato tipoContato = new TipoContato();
        tipoContato.setDescricao(tfDescricao.getText());
        dao.salvar(tipoContato);
        
    }

    @FXML
    private void btnExcluir(ActionEvent event) {
    }

    @FXML
    private void pesquisar(ActionEvent event) {
    }

}
