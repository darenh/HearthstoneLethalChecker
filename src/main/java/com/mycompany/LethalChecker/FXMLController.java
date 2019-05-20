/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.LethalChecker;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private Button button2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws UnirestException
    {
	if (event.getSource() == button1)
	{
	    String deckString;
	    deckString = textfield1.getCharacters().toString();
	    System.out.println(deckString);
	    
	    for (int i = 0; i < deckString.length(); i++)
	    {
		
	    }
	    
	    String url = "https://omgvamp-hearthstone-v1.p.rapidapi.com/cards/search/";
	    String cardName = "Malygos";

	    url = url + cardName;
	    System.out.println(url);

	    HttpResponse<JsonNode> response = Unirest.get(url)
	    .header("X-RapidAPI-Host", "omgvamp-hearthstone-v1.p.rapidapi.com")
	    .header("X-RapidAPI-Key", "ee3bed5e1bmshe33761c800b3944p188172jsnf9812b22adf7")
	    .asJson();
	
	    System.out.println(response.getBody());
	}
	else if (event.getSource() == button2)
	{
	    System.out.println("Next button clicked.");
	}
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
	// TODO

    }    
    
    
}
