package com.projetos.agenda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ContatoController implements Initializable, ICadastro {

    @FXML
    private TextField tfId;
    @FXML
    private Button btnNovo;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnExcluir;
    @FXML
    private TextField tfPesquisa;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfEndereco;
    @FXML
    private TextField tfNumero;
    @FXML
    private ComboBox<?> cbCidade;
    @FXML
    private ComboBox<?> cbUF;
    @FXML
    private TextField tfCep;
    @FXML
    private TextField tfTelefone1;
    @FXML
    private TextField tfTelefone2;
    @FXML
    private ComboBox<?> cbTipoContato;
    @FXML
    private TextField tfNascimento;
    @FXML
    private TableView<?> tableView;

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
