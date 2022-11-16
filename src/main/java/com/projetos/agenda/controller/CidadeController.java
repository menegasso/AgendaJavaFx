package com.projetos.agenda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CidadeController implements Initializable, ICadastro {

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
    private ComboBox<?> tfUf;
    @FXML
    private TextField tfCep;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnNovo(ActionEvent event) {
    }

    @FXML
    private void btnSalvar(ActionEvent event) {
    }

    @FXML
    private void btnExcluir(ActionEvent event) {
    }

    @FXML
    private void pesquisar(ActionEvent event) {
    }

    @Override
    public void criarColunasTabela() {

    }

    @Override
    public void atualizarTabela() {

    }

    @Override
    public void setarCamposFormulario() {

    }

    @Override
    public void limparCamposFormulario() {

    }

}
