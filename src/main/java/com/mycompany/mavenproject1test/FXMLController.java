/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author rami
 */
public class FXMLController implements Initializable
{
    @FXML
    private TextField textfield1;
    
    @FXML
    private Button button1;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
	if (event.getSource() == button1)
	{
	    String deckString;
	    System.out.println("You clicked me!");
	    deckString = textfield1.getCharacters().toString();
	    System.out.println(deckString);
	}
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
	// TODO

    }    
    
    
}
