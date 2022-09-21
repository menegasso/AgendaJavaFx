package com.projetos.agenda.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TelaPrincipalController implements Initializable {

    @FXML
    private MenuBar barraDeMenu;
    @FXML
    private Menu menuArquivo;
    @FXML
    private MenuItem menuItemContato;
    @FXML
    private MenuItem menuItemTipoContato;
    @FXML
    private MenuItem menuItemCidade;
    @FXML
    private MenuItem menuItemUsuario;
    @FXML
    private MenuItem menuItemSair;
    @FXML
    private Menu menuRelatorio;
    @FXML
    private MenuItem menuItemRelContatoGeral;
    @FXML
    private MenuItem menuItemRelEndereco;
    @FXML
    private MenuItem menuItemRelTelefone;
    @FXML
    private MenuItem menuItemRelTipo;
    @FXML
    private Menu menuSobre;
    @FXML
    private MenuItem menuItemSistema;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        menuItemContato.setGraphic(new ImageView("/icons/iconeMenuContato.png"));
        menuItemTipoContato.setGraphic(new ImageView("/icons/iconeMenuContatoTipo.png"));
        menuItemCidade.setGraphic(new ImageView("/icons/iconeMenuCidade.png"));
        menuItemUsuario.setGraphic(new ImageView("/icons/iconeMenuUsuario.png"));
        menuItemSair.setGraphic(new ImageView("/icons/iconeMenuSair.png"));

        menuItemRelContatoGeral.setGraphic(new ImageView("/icons/iconeMenuRelatorio.png"));
        menuItemRelEndereco.setGraphic(new ImageView("/icons/iconeMenuRelatorio.png"));
        menuItemRelTelefone.setGraphic(new ImageView("/icons/iconeMenuRelatorio.png"));
        menuItemRelTipo.setGraphic(new ImageView("/icons/iconeMenuRelatorio.png"));

        menuItemSistema.setGraphic(new ImageView("/icons/iconeMenuSobre.png"));

    }

    @FXML
    private void acessarContato(ActionEvent event) throws IOException {
        abrirFormulario("Contato");
    }

    @FXML
    private void acessarTipoContato(ActionEvent event) throws IOException {
        abrirFormulario("TipoContato");
    }

    @FXML
    private void acessarCidade(ActionEvent event) throws IOException {
        abrirFormulario("Cidade");
    }

    @FXML
    private void acessarUsuario(ActionEvent event) throws IOException {
        abrirFormulario("Usuario");
    }

    @FXML
    private void acessarSair(ActionEvent event) {

    }

    @FXML
    private void acessarRelContatoGeral(ActionEvent event) {
    }

    @FXML
    private void acessarRelEndereco(ActionEvent event) {
    }

    @FXML
    private void acessarRelTelefone(ActionEvent event) {
    }

    @FXML
    private void acessarRelContatoTipo(ActionEvent event) {
    }

    @FXML
    private void acessarSobreSistema(ActionEvent event) {
    }

    public void abrirFormulario(String form) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/" + form + ".fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Formulário");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
        }
    }

}
