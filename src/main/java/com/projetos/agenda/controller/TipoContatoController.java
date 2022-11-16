package com.projetos.agenda.controller;

import com.projetos.agenda.dao.TipoContatoDao;
import com.projetos.agenda.model.TipoContato;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class TipoContatoController implements Initializable, ICadastro {

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
    private TableView<TipoContato> tableView;
    @FXML
    private Label lbTitulo;

    private TipoContatoDao dao = new TipoContatoDao();
    
    private ObservableList<TipoContato> observable = FXCollections.observableArrayList();
    
    private List<TipoContato> listaTipo;
    
    private TipoContato objetoSelecionado = new TipoContato();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbTitulo.setText("Cadastro de Tipo de Contato");
        criarColunasTabela();
        atualizarTabela();
    }

    @FXML
    private void btnNovo(ActionEvent event) {
    }

    @FXML
    private void btnSalvar(ActionEvent event) {

        TipoContato tipoContato = new TipoContato();
        tipoContato.setDescricao(tfDescricao.getText());
        dao.salvar(tipoContato);
        atualizarTabela();

    }

    @FXML
    private void btnExcluir(ActionEvent event) {
    }


    @Override
    public void criarColunasTabela() {
        TableColumn<TipoContato, Long> colunaId = new TableColumn<>("ID");
        colunaId.setMinWidth(40);
        colunaId.setMaxWidth(40);
        
        TableColumn<TipoContato, String> colunaDescricao = new TableColumn<>("DESCRIÇÃO");

        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tableView.getColumns().addAll(colunaId, colunaDescricao);

        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
    }

    @Override
    public void atualizarTabela() {
        observable.clear();
        listaTipo = dao.consulta(tfPesquisa.getText());

        for (TipoContato t : listaTipo) {
            observable.add(t);
        }

        tableView.getItems().setAll(observable);
        tableView.getSelectionModel().selectFirst();
    }

    @Override
    public void setarCamposFormulario() {
        objetoSelecionado = tableView.getItems().get(tableView.getSelectionModel().getSelectedIndex());
        tfId.setText(String.valueOf(objetoSelecionado.getId()));
        tfDescricao.setText(objetoSelecionado.getDescricao());

    }

    @Override
    public void limparCamposFormulario() {

    }

    @FXML
    private void filtrarRegistros(KeyEvent event) {
        atualizarTabela();
    }

    @FXML
    private void clicarTabela(MouseEvent event) {
        setarCamposFormulario();
    }

}
