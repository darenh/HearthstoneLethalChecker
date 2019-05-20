package com.mycompany.mavenproject1test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root, 900, 650);
	scene.getStylesheets().add(MainApp.class.getResource("/styles/Styles.css").toExternalForm());
        //scene.getStylesheets().add("/styles/Styles.css");
        
	String url = "https://omgvamp-hearthstone-v1.p.rapidapi.com/cards/search/";
	String cardName = "Malygos";
	
	url = url + cardName;
	System.out.println(url);
	
	HttpResponse<JsonNode> response = Unirest.get(url)
	.header("X-RapidAPI-Host", "omgvamp-hearthstone-v1.p.rapidapi.com")
	.header("X-RapidAPI-Key", "ee3bed5e1bmshe33761c800b3944p188172jsnf9812b22adf7")
	.asJson();
	
	System.out.println(response.getBody());
        stage.setTitle("Hearthstone Lethal Checker");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
