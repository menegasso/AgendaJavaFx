/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetos.agenda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

/**
 *
 * @author tadt
 */
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
    private void acessarContato(ActionEvent event) {
    }

    @FXML
    private void acessarTipoContato(ActionEvent event) {
    }

    @FXML
    private void acessarCidade(ActionEvent event) {
    }

    @FXML
    private void acessarUsuario(ActionEvent event) {
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

}
